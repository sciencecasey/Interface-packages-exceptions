package nestedInterface;

/**
 * @author CaseyJayne
 *
 */
public interface Group {
   /**
    * @author CaseyJayne
    *
    */
   public interface GirlScouts{
      /**
       * 
       */
      void getBadge();
   }
   /**
    * @author CaseyJayne
    *
    */
   public interface BoyScouts{
      /**
       * 
       */
      void buildTent();
   }
   /**
    * @author CaseyJayne
    *
    */
   public interface Navy{
      /**
       * @param boat
       */
      void driveBoat(String boat);
   }
}
