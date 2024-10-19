import java.util.*;

public class test3 {
    public static void main(String args[])
    {
        System.out.println("!! Manav Majmudar - 23DIT030 !!");
        System.out.print("Enter moblie number: +91-");
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        System.out.println("Mobile system operator code is " + x.substring(0,2));
        System.out.println("MSC is " + x.substring(3,6));
        System.out.println("Unique code is " + x.substring(7,12));
    }
}
