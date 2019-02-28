package communication;


public class Communication {

    public static void main(String[] args) {
        
    SetRunnableClass st1 = new SetRunnableClass();
    GetRunnableClass gt1 = new GetRunnableClass();
    Thread t = new Thread(st1);
    Thread t2 = new Thread(gt1);
    
    t.start();
    t2.start();
    
    
    }

}
