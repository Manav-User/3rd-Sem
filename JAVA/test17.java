public class test17 {
    public static void main(String[] args)
    {
        System.out.println("!! Manav Majmudar - 23DIT030 !!");
        Manager m = new Manager();
        Employee e = new Employee();
        m.name="manav";
        m.age=18;
        m.phone_no=1234567890;
        m.address="M-11, Marvel Society, XYZ road, MultiUniverse";
        m.salary=5000000.100F;
        m.dept="IT";
        System.out.println("--Manager details--");
        System.out.println("Manager Name:"+m.name);
        System.out.println("Manager Age:"+m.age);
        System.out.println("Manager Phone Number:"+m.phone_no);
        System.out.println("Manager Address:"+m.address);
        m.printSalary();
        System.out.println();
        System.out.println("Manager Dep:"+m.dept);
        e.name="dhani";
        e.age=18;
        e.phone_no=054321123;
        e.address="M-10, Marvel Girl Society, XYZ road, MultiUniverse";
        e.salary=50000.10F;
        e.sep="Ai & Robotics";
        System.out.println("--Employee details--");
        System.out.println("Employee Name:"+e.name);
        System.out.println("Employee Age:"+e.age);
        System.out.println("Employee Phone Number:"+e.phone_no);
        System.out.println("Employee Address:"+e.address);
        e.printSalary();
        System.out.println("Employee Dep:"+e.sep);
    }
}
class Member
{
    String name;
    int age;
    long phone_no;
    String address;
    float salary;
    void printSalary()
    {
        System.out.print("Salary:"+salary);
    }
}
class Employee extends Member
{
    String sep;
}
class Manager extends Member
{
    String dept;
}