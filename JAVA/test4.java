import java.util.*;
public class test4 {
    public static void main(String args[])
    {
        System.out.println("!! Manav Majmudar - 23DIT030 !!");
        double[] code = {1,2,3,4,5};
        double[] price = {10,20,30,40,50};
        double bill=0;
        double a,b,c,d,e;
        int x;
        do{
            System.out.println("**** Electric Applications CODE *****");
            System.out.println("Motor -> 1");
            System.out.println("Fan -> 2");
            System.out.println("Tube -> 3");
            System.out.println("Wires -> 4");
            System.out.println("Other items -> 5");
            System.out.println("Exit -> 6");
        
            System.out.println("Enter your choice code for item: ");
            Scanner sc = new Scanner(System.in);
            x = sc.nextInt();
        
            switch(x)
            {
                case 1:
                    a = (0.08 * price[0])+price[0];
                    bill += a; 
                    System.out.println("Bill of one motor is " + a + "\n");
                    break;
                case 2:
                    b = (0.12 * price[1])+price[1];
                    bill += b; 
                    System.out.println("Bill of one fan is " + b + "\n");
                    break;
                case 3:
                    c = (0.05 * price[2])+price[2];
                    bill += c; 
                    System.out.println("Bill of one tube is " + c + "\n");
                    break;
                case 4:
                    d = (0.075 * price[3])+price[3];
                    bill += d; 
                    System.out.println("Bill of one wires is " + d + "\n");
                    break;
                case 5:
                    e = (0.03 * price[4])+price[4];
                    bill += e; 
                    System.out.println("Bill of one other items is " + e + "\n");
                    break;
            }
           
        }while(x != 6);

        System.out.println("Total bill is " + bill + "\n");
    }
}
