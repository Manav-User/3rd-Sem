import java.util.*;
public class test5 {
    public static void main(String[] args)
    {
        System.out.println("!! Manav Majmudar - 23DIT030 !!");
        Random r = new Random();
        int x = r.nextInt(100);

        while(true)
        {
            System.out.print("Enter number: ");
            Scanner sc = new Scanner(System.in);
            int y = sc.nextInt();

            if(x < y)
            {
                System.out.println("Too high");
            }
            if(x > y)
            {
                System.out.println("Too low");
            }
            if(x == y)
            {
                System.out.println("U guess correct");
                break;
            }
        }
        
    }
}
