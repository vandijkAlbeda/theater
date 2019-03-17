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
    private ArrayList <Observer> observers = new ArrayList();
    private int hartslag = 0;
    private int defibrilleerAantal = 3;
    
    public int getHartslag(){
        System.out.println("Hart->getHartslag()");
        return this.hartslag;
    }
    
    public void defibrileer(){
        System.out.println("Hart->defibrilleer()"); 
        this.defibrilleerAantal--;
        
        int hartslag = (int) (Math.random() * 100);      
        if (hartslag > 45 && hartslag < 90 ){
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
