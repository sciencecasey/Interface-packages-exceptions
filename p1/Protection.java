package p1;

/**
 * @author CaseyJayne
 *n_pub
 */
public class Protection {
   int n = 1; //default protection
   private int n_pri = 2;
   protected int n_pro = 3;
   @SuppressWarnings("javadoc")
   public int n_pub = 4;
   
   @SuppressWarnings("javadoc")
   public Protection() {
      System.out.println();
      System.out.println("Base Constructor");
      System.out.println("default n = " +this.n);
      System.out.println("private n = " +this.n_pri);
      System.out.println("protected n = " +this.n_pro);
      System.out.println("public n = " +this.n_pub);
   }
}
