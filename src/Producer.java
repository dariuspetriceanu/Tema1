import java.util.Random;

class Producer implements Runnable {
    private static int documentCount = 0;
    private PrinterQueue printerQueue;

    public Producer(PrinterQueue printerQueue) {
        this.printerQueue = printerQueue;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 30; i++) {
                String document = "Document #" + (++documentCount);
                printerQueue.enqueueDocument(document);
                Thread.sleep(new Random().nextInt(1000));
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}