class MyThread extends Thread{
    @Override
    public void run(){
        System.out.println("Thread is Running..");
    }

}
public class ExtendThreadClass {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
    }
}