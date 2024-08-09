class Calculations{
    int num;
    public synchronized void increment(){
        num++;
    }
}
public class Main {
    public static void main(String[] args) {
       Calculations calculations = new Calculations();

        Thread t1 = new Thread(()->{
            for (int i = 0; i < 1000; i++) {
                calculations.increment();
            }
        });

        Thread t2 = new Thread(()->{
            for (int i = 0; i < 1000; i++) {
                calculations.increment();
            }
        });

        t1.start();
        t2.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(calculations.num);
    }
}
