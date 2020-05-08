package p1;

class Derived extends Protection{
     Derived(){
        super();
        System.out.println("Derived Constructor: \ndefault n = " + this.n);
        System.out.println("Can't access private n");
        System.out.println("protected n= " + this.n_pro);
        System.out.println("public n = " + this.n_pub);
     }

}
