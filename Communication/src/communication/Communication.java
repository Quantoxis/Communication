package communication;


public class Communication {

    public static void main(String[] args) {
    
    Test test = new Test();
    
    SetRunnableClass st1 = new SetRunnableClass(test);
    GetRunnableClass gt1 = new GetRunnableClass(test);
    Thread t = new Thread(st1);
    Thread t2 = new Thread(gt1);
    
    t.start();
    t2.start();
    
    
    }

}
