/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 * ioo2 - Les 5 (Lagenstructuur)
 * @author H.M. van Dijk
 */

public class Lamp {
    private boolean lampAan = false;
    
    public void setLampAan(){
        this.lampAan = true;
    }
    
    public void setLampUit(){
        this.lampAan = false;
    }
    
    public boolean isLampAan(){
        return this.lampAan;
    }    
}
