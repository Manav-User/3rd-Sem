import java.util.*;

public class test14 {
    public static void main(String[] args)
    {
        System.out.println("!! Manav Majmudar - 23DIT030 !!");
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length:");
        int l=sc.nextInt();
        System.out.print("Enter breadth:");
        int b=sc.nextInt();
        Area a = new Area(l,b);
        a.returnArea();
    }
}
class Area
{
    int length,breath;
    Area()
    {
        length=0;
        breath=0;
    }
    Area(int l, int b)
    {
        length = l;
        breath = b;
    }
    void returnArea()
    {
        System.out.println("Area of rectangle is "+length*breath);
    }
}
