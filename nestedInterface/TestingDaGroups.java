package nestedInterface;

/**
 * @author CaseyJayne
 *
 */
public class TestingDaGroups {

   @SuppressWarnings("javadoc")
   public static void main(String[] args) {
      
      Group gSearg = new Seargant(); //this can use any methods in group
      
      Group gCommander = new Commander(); //this can use any methods in group
      
      //this can use methods or vars in Seargant
      Seargant sargCommander = new Commander(); 
      
      //this can use any methods/vars including override
      Commander commanderInCommand = new Commander();
   
      //see that groups can do 
      System.out.println(gSearg.getClass().getName());
      System.out.println(gCommander.getClass().getName());
      //no methods available
      
      //test what Seargant can do
      System.out.println(sargCommander.gScout.getClass().getName());
      sargCommander.gScout.getBadge();
      sargCommander.naval.driveBoat("rowboat");
      //sargCommander.secretCommand.secret(); //can't see this
      
      //test what Commander can do
      System.out.println(commanderInCommand.getClass().getName());
      commanderInCommand.getBadge(5);
      commanderInCommand.gScout.getBadge();
      commanderInCommand.naval.driveBoat("motorboat");
      commanderInCommand.fbi.history();
      commanderInCommand.history();
   
   }

}
