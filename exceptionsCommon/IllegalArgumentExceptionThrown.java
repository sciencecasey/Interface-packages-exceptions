package exceptionsCommon;

import java.util.Scanner;

public class IllegalArgumentExceptionThrown {
   String year;   
   IllegalArgumentExceptionThrown(){
         Scanner in = new Scanner(System.in);
         System.out.println("Please enter four digit birthyear");
         setYear(in.nextLine());
         in.close();
   }
   public void setYear(String y) {
      y = y.trim();
      if (y.length()!= 4) {
        throw new IllegalArgumentException("Please enter 4 digit year");
      }
      else {
         this.year = y;
      }
   }
      
   public static void main(String[] args) {
      IllegalArgumentExceptionThrown myYear = 
            new IllegalArgumentExceptionThrown();
      System.out.println("You were born in " + myYear.year);
   }

}
