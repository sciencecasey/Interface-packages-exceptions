package nestedInterface;

/**
 * @author CaseyJayne
 *
 */
public class Seargant implements Group{
   Seargant(){
      System.out.println("Seargant constructor");
      this.secretCommand.secret();
   }
   private interface SecretService{
      void secret();
   }
   protected interface FBI{
      void history();
   }
   
   Group.GirlScouts gScout = new Group.GirlScouts() {
      
      @Override
      public void getBadge() {
         System.out.println("girlScouts: Did you have medallions?");
      }
   };
   /*Group.BoyScouts bScout = new Group.BoyScouts() {
      
      @Override
      public void buildTent() {
         System.out.println("Did you also build a tent?");
      }
   };*/
   
   Group.Navy naval = new Group.Navy() {
      
      @Override
      public void driveBoat(String boat) {
         // TODO Auto-generated method stub
         System.out.println("navy "+boat+ ": I didn't have to implement all "
               + "methods \nSkipped boyscout definition bc they're nested :)");
      }
   };
   
   Seargant.SecretService secretCommand = new Seargant.SecretService() {
      
      @Override
      public void secret() {
         System.out.println("THIS IS CLASSIFIED");
         
      }
   };
}
