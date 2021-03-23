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
public class OP2 implements Runnable{
    /*   y = 5*b-7 */
    
    Buffer dati;

    public OP2(Buffer dati) {
        this.dati = dati;
    }
    
    
    
    @Override
    public void run() {
        dati.y = dati.b*5-7;
    }
}
