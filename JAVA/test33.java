import java.util.Random;

public class test33 {
    private static volatile int randomNumber = 0;
    static class NumberGenerator implements Runnable
    {
        private Random random = new Random();
        public void run() 
        {
            while(true){
                try{
                    int number = random.nextInt(100);
                    System.out.println("Generated number: "+number);
                    Thread.sleep(1000);
                } 
                catch(InterruptedException e){
                    Thread.currentThread().interrupt();
                    break;
                }
            }
        }
    }
    static class EvenNumberProcessor implements Runnable 
    {
        public void run() 
        {
            if(randomNumber%2 == 0){
                int square = randomNumber*randomNumber;
                System.out.println("Square of "+randomNumber+" is: "+square);
            }
        }
    }
    static class OddNumberProcessor implements Runnable 
    {
        public void run() 
        {
            if(randomNumber%2 != 0){
                int cube = randomNumber*randomNumber*randomNumber;
                System.out.println("Cube of "+randomNumber+" is: "+cube);
            }
        }
    }
    public static void main(String[] args){
        Thread generatorThread = new Thread(new NumberGenerator());
        Thread evenProcessorThread = new Thread(new EvenNumberProcessor());
        Thread oddProcessorThread = new Thread(new OddNumberProcessor());

        generatorThread.start();
        evenProcessorThread.start();
        oddProcessorThread.start();
    }
}
