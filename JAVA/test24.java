public class test24 { 
    public static void main(String[] args) {
        
        try{
            new test24().m1();
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
    }
    void m1() throws InterruptedException
    {
        System.out.print("Error occurs using throws!!");
    }
}
