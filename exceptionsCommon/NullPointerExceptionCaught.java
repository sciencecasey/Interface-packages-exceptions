package exceptionsCommon;
import DrawOptions.*;
public class NullPointerExceptionCaught {

   public static void main(String[] args) {
      NullPointerExceptionThrown throwPlease = new NullPointerExceptionThrown();
      try {
         throwPlease.hoofy.playSound();
      }
      catch(NullPointerException npe) {
         System.out.println("Null Pointer: " + npe.getCause() +"\n" + 
               npe.toString() + "\nFixed: ");
         throwPlease.hoofy = new Buffalo("Hoofy");
         throwPlease.hoofy.playSound();
      }
   }
}
