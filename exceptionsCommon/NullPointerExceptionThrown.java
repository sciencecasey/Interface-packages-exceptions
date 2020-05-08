package exceptionsCommon;
import DrawOptions.*;

public class NullPointerExceptionThrown {
   //hoofy uninitialized: nullpointerException
   public Buffalo hoofy;
   
   public static void main(String[] args) {
      NullPointerExceptionThrown throwPlease = new NullPointerExceptionThrown();
      throwPlease.hoofy.playSound();
   }

}
