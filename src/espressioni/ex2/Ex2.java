/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package espressioni.ex2;

import espressioni.Buffer;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gabbo
 */
public class Ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double a,b,c;
        a=1;
        b=3;
        c=7;
        /*   (3+2a)*(5b-7)+(8-3c)   */
        
        Buffer B = new Buffer(a,b,c);
        OP1 O1 = new OP1(B);
        Thread th1 = new Thread(O1);
        OP2 O2 = new OP2(B);
        Thread th2 = new Thread(O2);
        OP3 O3 = new OP3(B);
        Thread th3 = new Thread(O3);
        
        th1.start();
        th2.start();
        th3.start();
        
        OP4 O4 = new OP4(B);
        Thread th4 = new Thread(O4);
        try {
            th1.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Ex2.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            th2.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Ex2.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            th3.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Ex2.class.getName()).log(Level.SEVERE, null, ex);
        }
        th4.start();
        System.out.println("(3+2a)*(5b-7)+(8-3c)");
        System.out.println("a="+a+" b="+b+" c="+c+"\n");
        try {
            th4.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Ex2.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("il risultato e' "+B.t);
        
        }
        
}
    