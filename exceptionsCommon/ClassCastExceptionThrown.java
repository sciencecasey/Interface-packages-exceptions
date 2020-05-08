package exceptionsCommon;
import DrawOptions.*;

public class ClassCastExceptionThrown {
   Buffalo buffalo = new Buffalo("buffy");
   Llama llama = new Llama("shanae");
   
   public static void main(String[] args) {
      ClassCastExceptionThrown classyCast = new ClassCastExceptionThrown();
      System.out.println("Buffalo named: " + classyCast.buffalo.getName());
      System.out.println("Llama named: " + classyCast.llama.getName());
      
      //both buffalo and llama extend Animal-- they can't extend eachother
      //following will not run or compile
      //Buffalo buffalo2 = (Animal) classyCast.llama;
      throw new ClassCastException();
   }

}
