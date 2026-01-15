import java.util.concurrent.atomic.AtomicInteger;

public class ThreadsDemo {
    public static void main(String[] args) throws InterruptedException {
        AtomicInteger counter = new AtomicInteger(0);

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) counter.incrementAndGet();
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) counter.incrementAndGet();
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Counter expected 2000, actual=" + counter.get());
    }
}
