package exceptionsCommon;

public class ArrayIndexOutOfBoundsCaught {

   public static void main(String[] args) {
      ArrayIndexOutOfBoundsThrown stillNoArrayThere = 
            new ArrayIndexOutOfBoundsThrown("Try again please");;
      try {
         stillNoArrayThere.arrayToString();
      }
      catch(IndexOutOfBoundsException oobe) {
         System.out.println();
         System.out.println("Index out of Bounds: " + oobe.getCause() 
            + "\n" + oobe.getMessage());
      }
      //specfic Array Index OOB
      try {
         var realArray = stillNoArrayThere.inputArray.toArray();
         System.out.println("\n\n" + realArray.length);
         //realArray not long enough this will throw the exception
         realArray[4] = "hello";
      }
      catch(ArrayIndexOutOfBoundsException aoobe) {
         System.out.println("Array index out of bounds: " + aoobe.getMessage());
      }
   }

}
