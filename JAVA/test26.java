
import java.io.*;
import java.util.*;

public class test26 {
    public static void main(String[] args) {
        int x=0;
        for(x=0;x<args.length;x++)
        {
            int y=0;
            try {
                File obj=new File(args[x]);
                if(obj.exists()){
                    System.out.print("Searchinf for file '"+args[x]+"'.......'");
                    System.out.println(args[x]+"' found.");
                }
                Scanner sc = new Scanner(obj);
                while(sc.hasNextLine())
                {
                    y++;
                    sc.nextLine();
                }
                System.out.println("There are "+y+" lines in the '"+obj.getName()+"' file.");
                sc.close();
            } catch(IOException e) {
                System.out.println("Error occured while finding the '"+args[x]+"' file.");
            }
        }
    }
}
