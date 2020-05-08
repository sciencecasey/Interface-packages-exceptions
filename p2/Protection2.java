package p2;

class Protection2 extends p1.Protection{

   Protection2() {
      super();
      System.out.println("Protection2 constructor--");
      System.out.println("Can't access default n (different package)");
      System.out.println("Can't access private n");
      System.out.println("proctected n = " +this.n_pro);
      System.out.println("public n = " +this.n_pub);
   }

}
