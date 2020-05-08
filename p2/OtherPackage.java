package p2;

class OtherPackage {
   public OtherPackage() {
      p1.Protection p = new p1.Protection();
      System.out.println("OtherPackage constructor, instantiated Protected");
      System.out.println("Can't access default data");
      System.out.println("can't access private data");
      System.out.println("can't access protected data");
      System.out.println("public n = " + p.n_pub);
   }
}
