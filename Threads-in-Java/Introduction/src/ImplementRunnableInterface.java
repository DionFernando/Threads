class MyNewThread implements Runnable{

    /*run method eka call wunata passe thmai CPU eken wenama execution path ekak open wenne*/
    @Override
    public void run() {
        System.out.println("Thread is Running..");
    }
}

public class ImplementRunnableInterface {
    public static void main(String[] args) {
        MyNewThread myNewThread = new MyNewThread();
        Thread thread = new Thread(myNewThread);
        thread.start();
    }
}
