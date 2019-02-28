package communication;

public class SetRunnableClass implements Runnable{
    
    Test test;
    
    public SetRunnableClass(Test test){
        this.test = test;
    }
            

    public void run(){
        System.out.println("Thread 1 is running!");
        test.setValue(44);
        System.out.println("The value is: " + test.getValue());
    }
}
