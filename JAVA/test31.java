public class test31 {
    public static void main(String[] args) {
        B t1 = new B();
        t1.start();
        C t2 = new C();
        t2.run();        
    }
}
class B extends Thread{
    public void run()
    {
        System.out.println("Thread method run!!"); 
    }
}
class C implements Runnable{
    public void run()
    {
        System.out.println("Runnable method run!!");
    }
}
