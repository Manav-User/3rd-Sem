import java.util.Scanner;

class SumTask implements Runnable {
    private int[] numbers;
    private int start;
    private int end;
    private SharedSum sharedSum;
    public SumTask(int[] numbers,int start,int end,SharedSum sharedSum) 
    {
        this.numbers = numbers;
        this.start = start;
        this.end = end;
        this.sharedSum = sharedSum;
    }
    public void run()
    {
        int sum = 0;
        for (int i=start;i<=end;i++) 
        {
            sum += numbers[i];
        }
        sharedSum.add(sum);
    }
}
class SharedSum {
    private int sum = 0;
    public synchronized void add(int value) 
    {
        sum += value;
    }
    public int getSum() 
    {
        return sum;
    }
}
public class test32 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int N = sc.nextInt();
        int[] numbers = new int[N];
        System.out.println("Enter " + N + " numbers:");
        for (int i=0;i<N;i++) 
        {
            numbers[i] = sc.nextInt();
        }
        System.out.print("Enter the number of threads: ");
        int numThreads = sc.nextInt();
        SharedSum sharedSum = new SharedSum();
        Thread[] threads = new Thread[numThreads];
        int chunkSize = N/numThreads;
        int remainder = N%numThreads;
        int start = 0;
        for (int i=0;i<numThreads;i++)
        {
            int end = start+chunkSize-1;
            if(i<remainder){
                end += 1;
            }
            threads[i] = new Thread(new SumTask(numbers,start,end,sharedSum));
            start = end+1;
        }
        for (int i=0;i<numThreads;i++) 
        {
            threads[i].start();
        }
        for (int i=0;i<numThreads;i++)
        {
            try{
                threads[i].join();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("The total sum is: "+sharedSum.getSum());
        sc.close();
    }
}