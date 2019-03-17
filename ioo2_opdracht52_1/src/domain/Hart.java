/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.ArrayList;
import proces.Observer;

/**
 * ioo2 - Les 5 (Lagenstructuur)
 * @author H.M. van Dijk
 */
public class Hart {
    private final int MAX_DEFIBRILEER_POGINGEN = 3;
    private final int MIN_DEFIBRILEER_HARTSLAG = 45;
    private final int MAX_DEFIBRILEER_HARTSLAG = 90;
    
    private ArrayList <Observer> observers = new ArrayList();
    private int hartslag;
    private int defibrilleerAantal = MAX_DEFIBRILEER_POGINGEN ;
    
    public int getHartslag(){
        System.out.println("Hart->getHartslag()");
        return this.hartslag;
    }
    
    public void defibrilleer(){
        System.out.println("Hart->defibrilleer()");
        this.defibrilleerAantal--;

        int hartslag = (int) (Math.random() * 100);      
        if (hartslag > MIN_DEFIBRILEER_HARTSLAG
                &&
            hartslag < MAX_DEFIBRILEER_HARTSLAG){
            this.hartslag = hartslag;
        }
        informObservers();
    }
    
    public boolean isDefibrilleerbaar(){
        return ! (Math.signum(this.defibrilleerAantal) == -1);
    }
    
    public void addObserver(Observer observer){
        System.out.println("Hart->addObserver()");
        this.observers.add(observer);
        observer.update();
    }

    public void deleteObserver(Observer observer){
        this.observers.remove(observer);
    }
    
    private void informObservers(){
        for(Observer i : this.observers){
            i.update();
        }
    }
}
