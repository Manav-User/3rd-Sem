import java.util.*;

public class test23{
    public static void main(String[] args) {
        System.out.println("!! Manav Majmudar - 23DIT030 !!");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value x: ");
        int x = sc.nextInt();
        System.out.print("Enter value y: ");
        int y = sc.nextInt();
        try{
            int z = x/y;
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic Expextion");
        }
    }
}
