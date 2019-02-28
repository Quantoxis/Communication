
package communication;

public class GetRunnableClass implements Runnable{
    
    public void run(){
        System.out.println("Thread 2 is running!");
        Test t = new Test();
        t.getValue();
        System.out.println("The value is: " + t.getValue());
    }
}
