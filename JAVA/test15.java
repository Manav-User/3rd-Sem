import java.util.Scanner;

public class test15 {
    public static void main(String[] args)
    {
        System.out.println("!! Manav Majmudar - 23DIT030 !!");
        Scanner sc = new Scanner(System.in);
        System.out.println("-----Enter First Complex Number-----");
        System.out.print("Enter real part: ");
        int r1 = sc.nextInt();
        System.out.print("Enter imaginary part: ");
        int i1 = sc.nextInt();
        
        System.out.println("-----Enter Second Complex Number-----");
        System.out.print("Enter real part: ");
        int r2 = sc.nextInt();
        System.out.print("Enter imaginary part: ");
        int i2 = sc.nextInt();
        
        System.out.println("-------------------------");
        complex c = new complex();
        c.displayComplex(r1,r2,i1,i2);
        c.sum(r1,r2,i1,i2);
        c.difference(r1,r2,i1,i2);
        c.product(r1,r2,i1,i2);
    }
}
class complex
{
    void displayComplex(int r1, int r2, int i1, int i2)
    {
        System.out.println("First complex number is "+r1+"+"+i1+"i");
        System.out.println("Second complex number is "+r2+"+"+i2+"i");
    }
    void sum(int r1, int r2, int i1, int i2)
    {
        System.out.println("Sum is "+(r1+r2)+" + "+(i1+i2)+"i");
    }
    void difference(int r1, int r2, int i1, int i2)
    {
        System.out.println("Difference is "+(r1-r2)+" + "+(i1-i2)+"i");
    }
    void product(int r1, int r2, int i1, int i2)
    {
        int r = (r1*r2)-(i1*i2);
        int i = (r1*i2)+(r2*i1);
        System.out.println("Product is "+r+" + "+i+"i");
    }
}