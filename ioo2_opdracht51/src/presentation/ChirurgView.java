/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation;

import proces.ChirurgPresenter;

/**
 *
 * @author H.M
 */
public class ChirurgView {
    private ChirurgPresenter presenter;
    
    public ChirurgView(ChirurgPresenter presenter){
        System.out.println("ChirurgView->constructor()");        
        this.presenter = presenter;
    }
    
    public void showHartslag(int hartslag){
        // mock: demo
        System.out.println("ChirurgView->showHartslag: " + hartslag);
    }
}
