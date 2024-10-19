import java.util.*;
public class test9 {
    public static void main(String[] args)
    {
        System.out.println("!! Manav Majmudar - 23DIT030 !!");
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter string: ");
        String name=sc1.nextLine();
        System.out.println(":::::MENU:::::");
        System.out.println("1. Length");
        System.out.println("2. Lowercase");
        System.out.println("3. Uppercase");
        System.out.println("4. Reverse");
        System.out.println("5. Sort");
        System.out.print("Enter number of your choice: ");
        
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        
        StringBuilder str = new StringBuilder(name);

        

        switch(num)
        {
            case 1:
                //System.out.println("Length is " + name.length());
                lengthstring(name);
                break;
            case 2:
                System.out.println("Lower case is " + name.toLowerCase());
                //Lowerstring(name);
                break;
            case 3:
                System.out.println("Upper case is " + name.toUpperCase());
                break;
            case 4:
                System.out.println("Revese string is " + str.reverse());
                break;
            case 5:
                char temp[] = name.toCharArray();
                Arrays.sort(temp);
                System.out.println("Sorted string is " + new String(temp));
                break;
        }
    }
    static void lengthstring(String name)
    {
        int count=0;
        try{
            for(int i=0;i<100;i++)
            {
                name.charAt(i);
                count++;
            }
        }
        catch(IndexOutofBondException)
        {
            
        }
        System.out.println("Length is " + count);
    }
    // public void lowerstring(String name)
    // {

    // }
}