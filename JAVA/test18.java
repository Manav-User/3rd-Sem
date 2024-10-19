

public class test18 {
    public static void main(String[] args) {
        System.out.println("!! Manav Majmudar - 23DIT030 !!");
        Square obj[] = new Square[3];
        obj[0] = new Square(1, 2, 3);
        obj[1] = new Square(10, 20, 30);
        obj[2] = new Square(100, 200, 300);
        for(int i=0;i<obj.length;i++)
        {
            obj[i].areaRect();
            obj[i].periRect();
            obj[i].areaSquare();
            obj[i].periSquare();
        }
    }
}
class Rectangle{
    int l,b;

    Rectangle(int l,int b) 
    {
        this.l=l;
        this.b=b;
    }
    
    void areaRect()
    {
        int area = l*b;
        System.out.println("Area of rectangle is "+area);
    }
    void periRect()
    {
        int p = 2*(l+b);
        System.out.println("Perimeter of rectangle is "+p);
    }
}
class Square extends Rectangle{
    int s;

    Square(int s,int l,int b) 
    {
        super(l,b);
        this.s=s;
    }
    void areaSquare()
    {
        int area = s*s;
        System.out.println("Area of square is "+area);
    }
    void periSquare()
    {
        int p = 4*s;
        System.out.println("Perimeter of square is "+p);
    }
}