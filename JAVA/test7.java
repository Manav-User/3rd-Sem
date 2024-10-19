import java.util.*;
public class test7 {
    public static void main(String[] args)
    {
        System.out.println("!! Manav Majmudar - 23DIT030 !!");
        System.out.print("Size of array: ");
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println("Enter elements of array:");
        int arr[]=new int[num];
        for(int i=0;i<num;i++)
        {
            arr[i]=sc.nextInt();
        }
        int count=0;
        for(int i=0;i<num;i++)
        {
            if(arr[i]==9)
            {
                count++;
            }
        }
        System.out.println("The number 9 appears "+count+" times.");
    }
}  
