import java.util.Scanner;

public class test25 {
        public static void checkCondition(boolean condition) throws CustomException 
        {
            if (!condition){
                throw new CustomException("Condition failed: CustomException thrown");
            }
        }
        public static void main(String[] args) 
        {
            try {
                Scanner sc = new Scanner(System.in);
                boolean x = sc.nextBoolean();
                checkCondition(x);
            } catch(CustomException e) {
                System.out.println("Caught exception: "+e.getMessage());
            }
        }
}
class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}
