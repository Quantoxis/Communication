/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package communication;

public class SetRunnableClass implements Runnable{
    
    Test  test;
    
    public void SetRunnableClass(Test test){
        this.test = test;
    }
    
    public void run(){
        System.out.println("Hello from a thread!");
        Test test = new Test();
        test.setValue(44);
        
    }
}
