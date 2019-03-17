/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation;

import proces.AnesthesistPresenter;

/**
 *
 * @author H.M
 */
public class AnesthesistView {
    private AnesthesistPresenter presenter;
    
    public AnesthesistView(AnesthesistPresenter presenter){
        System.out.println("AnesthesistView->constructor()");        
        this.presenter = presenter;
    }
    
    public void showHartslag(int hartslag){
        // mock: demo
        System.out.println("AnesthesistView->showHartslag(): hartslag = " + hartslag);
    }
}
