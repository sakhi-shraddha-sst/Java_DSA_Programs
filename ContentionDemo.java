public class ContentionDemo {

    static final Object lock = new Object();

    static void performWork() {

        synchronized (lock) {

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void main(String[] args) {

        for (int i = 0; i < 20; i++) {

            new Thread(
                    ContentionDemo::performWork
            ).start();
        }
    }
}