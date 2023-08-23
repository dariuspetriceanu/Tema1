import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

class PrinterQueue {

    private Queue<String> queue = new LinkedList<>();

    public synchronized void enqueueDocument(String document) throws InterruptedException {
        while (queue.size() >= 5) {
            wait();
        }
        queue.add(document);
        System.out.println("Enqueued: " + document);
        notifyAll();
    }

    public synchronized String dequeueDocument() throws InterruptedException {
        while (queue.isEmpty()) {
            wait(); // Wait if the queue is empty
        }
        String document = queue.poll();
        System.out.println("Dequeued: " + document);
        notifyAll(); // Notify waiting threads that the queue is not full
        return document;
    }
}










