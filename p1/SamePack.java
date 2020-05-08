package p1;

class SamePack {
   SamePack(){
      Protection p = new Protection();
      System.out.println("SamePack constructor. Instance of Protected.");
      System.out.println("default n = " +p.n);
      System.out.println("private n can't be accessed");
      System.out.println("Protected n = " +p.n_pro);
      System.out.println("Public n = " +p.n_pub);
   }
}
