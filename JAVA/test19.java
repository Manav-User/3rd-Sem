public class test19 {
    public static void main(String[] args) {
        System.out.println("!! Manav Majmudar - 23DIT030 !!");
        Square s = new Square();
        s.display4();
        s.display2();
        s.display1();
    }
}
class Shape
{
    void display1()
    {
        System.out.println("This is This is shape");
    }
}
class Rectangle extends Shape
{
    void display2()
    {
        System.out.println("This is rectangular shape");
    }
}
class Circle extends Shape
{
    void display3()
    {
        System.out.println("This is circular shape");
    }
}
class Square extends Rectangle
{
    void display4()
    {
        System.out.println("Square is a rectangle");
    }
}