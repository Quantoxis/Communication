
package communication;

public class GetRunnableClass implements Runnable{
    
    Test  test;
    
    public void GetRunnableClass(Test test){
        this.test = test;
    }
    
    public void run(){
        System.out.println("Thread 2 is running!");
        Test test = new Test();
        test.getValue();
        System.out.println("The value is: " + test.getValue());
    }
}
