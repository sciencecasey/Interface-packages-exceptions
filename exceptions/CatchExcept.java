package exceptions;
import java.io.File;
import java.util.Scanner;

public class CatchExcept {
   public static void main(String [] args) {
      Scanner inFile = null;
      try {
         inFile = new Scanner(new File(args[0]));
         while(inFile.hasNext()) {
            String inputString = inFile.next();
            int inputInt = Integer.parseInt(inputString);
            inputString = inFile.nextLine();
            System.out.println("Item: " + inputInt + " Description: "
                  +inputString);
         }
      }
      catch(Exception except) {
         System.out.println("Input file error: " + except.getMessage());
            except.printStackTrace();
      }
      finally {
         inFile.close();
      }
   }
}
