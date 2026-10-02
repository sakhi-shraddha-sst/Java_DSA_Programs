public class WaitNotifyDemo {

    static final Object lock = new Object();

    public static void main(String[] args)
            throws InterruptedException {

        Thread consumer = new Thread(() -> {

            synchronized (lock) {

                try {

                    System.out.println("Waiting...");

                    lock.wait();

                    System.out.println(
                            "Consumer resumed"
                    );

                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        consumer.start();

        Thread.sleep(1000);

        synchronized (lock) {

            System.out.println("Notifying...");

            lock.notify();
        }
    }
}