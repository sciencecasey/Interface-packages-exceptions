package stack;

public class StackTests {

   public static void main(String[] args) {
      // create fixed and dynamic stacks
      FixedStack fix1 = new FixedStack(5);
      FixedStack fix2 = new FixedStack(8);
      DynamicStack dyn1 = new DynamicStack(5);
      DynamicStack dyn2 = new DynamicStack(8);
      
      //push onto stack
      for (int i=0; i< (fix1.getLength()); i++) {
         fix1.push(i);
      }
      for (int i=0; i< (fix2.getLength()); i++) {
         fix2.push(i);
      }
      int doubleLength = (dyn1.getLength()*2);
      for(int i = 0; i<doubleLength; i++) {
         dyn1.push(i);
      }
      doubleLength = (dyn2.getLength()*2);
      for(int i = 0; i<doubleLength; i++) {
         dyn2.push(i);
      }
      
      //Print size & TOS
      System.out.println("Size: " + fix1.getLength() + "\nTop of Stack: " +
            fix1.getTOS());
      System.out.println("Size: " + fix2.getLength() + "\nTop of Stack: " +
            fix2.getTOS());
      System.out.println("Size: " + dyn1.getLength() + "\nTop of Stack: " +
            dyn1.getTOS());
      System.out.println("Size: " + dyn2.getLength() + "\nTop of Stack: " +
            dyn2.getTOS());
      
      //Pop off Stack
      System.out.println("Stack in fix1: ");
         for(int i=1; i<(fix1.getLength()-1);i++) {
            System.out.println(fix1.pop());
         }
      System.out.println(fix1.getTOS() + "  " + fix1.getLength());
      System.out.println("Stack in fix2: ");
      for(int i=1; i<(fix2.getLength());i++) {
         System.out.println(fix2.pop());
      }
      System.out.println(fix2.getTOS() + "  " + fix2.getLength());
      System.out.println("Stack in dyn1: ");
      for(int i=1; i<(dyn1.getLength());i++) {
         System.out.println(dyn1.pop());
      }
      System.out.println(dyn1.getTOS() + "  " + dyn1.getLength());
      System.out.println("Stack in dyn2: ");
      for(int i=1; i<(dyn2.getLength());i++) {
         System.out.println(dyn2.pop());
      }
      System.out.println(dyn2.getTOS() + "  " + dyn2.getLength());
   }

}
