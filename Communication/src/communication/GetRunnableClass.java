
package communication;

public class GetRunnableClass implements Runnable{
    
    public void run(){
        System.out.println("Thread 2 is running!");
        Test test = new Test();
        test.getValue();
        System.out.println("The value is: " + test.getValue());
    }
}
