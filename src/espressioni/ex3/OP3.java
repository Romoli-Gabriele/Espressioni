/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package espressioni.ex3;

import espressioni.Buffer;

/**
 *
 * @author gabbo
 */
public class OP3 implements Runnable{
    /*   z = 7*b+3  */
    
    Buffer dati;

    public OP3(Buffer dati) {
        this.dati = dati;
    }
    
    
    
    @Override
    public void run() {
        dati.z = 7*dati.b+3;
    }
}
