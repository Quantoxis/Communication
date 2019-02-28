public class GetRunnableClass implements Runnable {

    
    Test test;
    
    public GetRunnableClass(Test test)
    {
         this.test = test;
    }
    
    public void run() {
        System.out.println("Thread 2 is running!");
        
        test.getValue();
        System.out.println("The value is: " + test.getValue());
    }

}

