package exceptionsCommon;

public class ClassCastExceptionCaught {

   public static void main(String[] args) {
      @SuppressWarnings("unused")
      ClassCastExceptionThrown classy = new ClassCastExceptionThrown();
      
      try {
         throw new ClassCastException("Cannot cast Buffalo to Llama");
         //classy.buffalo = classy.llama;
      }
      catch(ClassCastException cce) {
         System.out.println(cce.getMessage() + "\n" + cce.getCause() + "\n" + 
               cce.toString());
      }
   }

}
