/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package communication;

/**
 *
 * @author Andrew
 */
public class Thread1 implements Runnable{
    
    public void run(){
        System.out.println("Hello from a thread!");
        Test t = new Test();
        t.setValue(44);
        
    }
}
