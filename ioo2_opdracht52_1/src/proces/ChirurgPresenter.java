/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proces;

import domain.Hart;
import domain.Lamp;
import presentation.ChirurgView;

/**
 * ioo2 - Les 5 (Lagenstructuur)
 * @author H.M. van Dijk
 */
public class ChirurgPresenter implements Observer{
   private Hart hart;
   private Lamp lamp;
   private ChirurgView view;
   
   public ChirurgPresenter(Hart hart, Lamp lamp){
       this.hart = hart;
       this.lamp = lamp;
       this.view = new ChirurgView(this);
   }
   
   public void cmdLampAan(){
        if (! this.lamp.isLampAan()){
            this.lamp.setLampAan();
        }       
   }
   
   public void cmdLampUit(){
        if (this.lamp.isLampAan()){
            this.lamp.setLampUit();
        }
   }
   
   public void cmdConnect(){
       System.out.println("ChirurgPresenter->cmdConnect()");
       hart.addObserver(this);       
   }
   
   public void cmdDefibriller(){
       System.out.println("ChirurgPresenter->cmdDefibriller()");
       if (this.hart.isDefibrilleerbaar()){
           this.hart.defibrilleer();
       }
   }
    
   public void update(){
       System.out.println("ChirurgPresenter->update()");     
       int hartslag = hart.getHartslag();
       view.showHartslag(hartslag);
   }
}
