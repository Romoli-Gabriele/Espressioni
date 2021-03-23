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
public class OP1 implements Runnable{
    /*   x = 3+2*a */
    
    Buffer dati;

    public OP1(Buffer dati) {
        this.dati = dati;
    }
    
    
    
    @Override
    public void run() {
        dati.x = dati.a*2+3;
    }
}
