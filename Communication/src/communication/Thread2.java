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
public class Thread2 implements Runnable{
    
    public void run(){
        System.out.println("Thread 2 is running!");
        Test t = new Test();
        t.getValue();
        System.out.println("The value is: " + t.getValue());
    }
}
