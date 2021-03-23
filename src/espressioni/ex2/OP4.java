/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package espressioni.ex2;


import espressioni.Buffer;

/**
 *
 * @author gabbo
 */
public class OP4 implements Runnable{
    /*   t = x*y+z  */
    
    Buffer dati;

    public OP4(Buffer dati) {
        this.dati = dati;
    }
    
    
    
    @Override
    public void run() {
        dati.t = dati.x*dati.y+dati.z;
    }
}
