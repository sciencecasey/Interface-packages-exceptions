package nestedInterface;

/**
 * @author CaseyJayne
 *
 */
public class Commander extends Seargant {
   Commander(){
      System.out.println("Commander Constructor");
   }
   //try defining protected interface
   Seargant.FBI fbi = new Seargant.FBI() {
      
      @Override
      public void history() {
         System.out.println("fbi history: When was FBI founded?");
      }
   };
   
   //try using private interface
   //Seargant.SecretService = new Seargant.SecretService();
   //doesn't show up
   
   
   //what am I doing here? 
   void history() {
      System.out.println("commander: another history? oops!");
   }
   
   //this is an overload
   String getBadge(int howMany) {
      return "Commander got" +howMany;
   }

}
