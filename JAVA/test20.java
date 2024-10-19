public class test20 {
    public static void main(String[] args) {
        System.out.println("!! Manav Majmudar - 23DIT030 !!");
        Degree d = new Degree();
        Undergraduate u = new Undergraduate();
        Postgraduate p = new Postgraduate();
        d.getDegree();
        u.Display();
        p.Display();
    }
}
class Degree 
{
    void getDegree()
    {
        System.out.println("I got a degree");
    }
}
class Undergraduate extends Degree
{
    void Display()
    {
        System.out.println("I am an Undergraduate");
    }
}
class Postgraduate extends Degree
{
    void Display()
    {
        System.out.println("I am a Postgraduate");
    }
}