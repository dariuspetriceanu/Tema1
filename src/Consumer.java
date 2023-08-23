import java.util.Random;

class Consumer implements Runnable {
    private PrinterQueue printerQueue;

    public Consumer(PrinterQueue printerQueue) {
        this.printerQueue = printerQueue;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 90; i++) {
                String document = printerQueue.dequeueDocument();
                Thread.sleep(new Random().nextInt(500));
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}