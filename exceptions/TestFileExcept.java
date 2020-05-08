package exceptions;

/**
 * @author CaseyJayne
 *
 */
public class TestFileExcept {

   public static void main(String[] args) {
      try {
         ReadFile readFile = new ReadFile(args[0], 
               Integer.parseInt(args[1]));
         readFile.readFile();
      }
      catch(FileException dfe) {
         System.out.println(dfe.getMessage() + " Root cause: " +
               ((dfe.getCause() != null) ? dfe.getCause().toString() 
                     : "None"));
      }
      catch(Exception except) {
         System.out.println(except.getMessage());
      }
   }

}
