import java.util.*;
public class test8 {
    public static void main(String[] args)
    {
        System.out.println("!! Manav Majmudar - 23DIT030 !!");
        Scanner sc = new Scanner(System.in);
        String name=sc.nextLine();
        for(int i=0;i<name.length();i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.print(name.charAt(i));
            }
        }
    }
} 