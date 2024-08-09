class A implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("A");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class B implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("B");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        A a = new A();
        Thread threadA = new Thread(a);

        B b = new B();
        Thread threadB = new Thread(b);

        threadA.start();

        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        threadB.start();
    }
}