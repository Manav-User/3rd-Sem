import java.util.*;
public class test2 {
    public static void main(String[] args)
    {
        System.out.println("!! Manav Majmudar - 23DIT030 !!");
        String word[] = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        String morser[] = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter one character: ");
        String name = sc.nextLine();
        for(int i=0;i<26;i++)
        {
          if(word[i].equals(name))
          {
            System.out.println(morser[i]);
          }
        }
    }   
}