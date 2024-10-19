import java.util.*;
public class test6 {
    public static void main(String[] args)
    {
        System.out.println("!! Manav Majmudar - 23DIT030 !!");
        String res = Repeat_char("Manav",3);
        System.out.println(res);
    } 
    static String Repeat_char(String str, int n)
    {
        int len = 3;
        if(len > str.length())
        {
            len = str.length();
        }
        String str1 = str.substring(0,len);
        String rev = "";
        for(int i=0;i<n;i++)
        {
            rev = rev + str1;
        }
        return rev;
    }
}  
