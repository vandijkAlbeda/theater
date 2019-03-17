/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proces;

import domain.Hart;
import presentation.AnesthesistView;

/**
 * ioo2 - Les 5 (Lagenstructuur)
 * @author H.M. van Dijk
 */
public class AnesthesistPresenter implements Observer{
   private Hart hart;
   private AnesthesistView view;
   
   public AnesthesistPresenter(Hart hart){
       this.hart = hart;
       this.view = new AnesthesistView(this);
       this.hart.addObserver(this);
   }
    
   public void update(){
       System.out.println("AnesthesistPresenter->update()");     
       int hartslag = hart.getHartslag();
       view.showHartslag(hartslag);
   }
}
