import java.util.LinkedList;
import java.util.Queue;
public class test36 {
    public static void main(String[] args) {
        Buffer buffer = new Buffer(5);  
        Thread producerThread = new Thread(new Producer(buffer));
        Thread consumerThread = new Thread(new Consumer(buffer));
        producerThread.start();
        consumerThread.start();
    }
}
class Buffer 
{
    private final int MAX_SIZE;
    private Queue<Integer> queue = new LinkedList<>();
    public Buffer(int size) 
    {
        this.MAX_SIZE = size;
    }
    public synchronized void producer(int value) throws InterruptedException
    {
        while(queue.size()==MAX_SIZE)
        {
            wait();
        }
        queue.add(value);
        System.out.println("Produced: "+value);
        notify();
    }
    public synchronized void consumer() throws InterruptedException
    {
        while(queue.isEmpty())
        {
            wait();
        }
        int value = queue.poll();
        System.out.println("Consumed: " + value);
        notify();
    }
}
class Producer implements Runnable
{
    private Buffer buffer;
    public Producer(Buffer buffer) 
    {
        this.buffer = buffer;
    }
    public void run()
    {
        int value=0;
        while (true) {
            try {
                buffer.producer(value++);
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class Consumer implements Runnable
{
    private Buffer buffer;
    public Consumer(Buffer buffer) 
    {
        this.buffer = buffer;
    }
    public void run()
    {
        while (true ) {
            try {
                buffer.consumer();
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}