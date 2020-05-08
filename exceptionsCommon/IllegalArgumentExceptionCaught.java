package exceptionsCommon;


public class IllegalArgumentExceptionCaught {

   public static void main(String[] args) {
      try{
         @SuppressWarnings("unused")
         IllegalArgumentExceptionThrown catchYear= 
            new IllegalArgumentExceptionThrown();
      }
      catch(IllegalArgumentException iae){
         System.out.println(iae.getMessage()+ 
                "\n"+ iae.getCause() + "\n" + iae.toString());
      }
   }
}
