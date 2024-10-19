import java.util.*;
public class test16 {
    public static void main(String[] args)
    {
        System.out.println("!! Manav Majmudar - 23DIT030 !!");
        A a = new A();
        B b = new B();
        System.out.println("Method of parent class by object of parent class:::");
        a.displayA();
        System.out.println("Method of child class by object of child class:::");
        b.displayB();
        System.out.println("Method of parent class by object of child class:::");
        b.displayA();
    }
}
class A
{
    void displayA()
    {
        System.out.println("This is parent class");
    }
}
class B extends A
{
    void displayB()
    {
        System.out.println("This is child class");
    }
}