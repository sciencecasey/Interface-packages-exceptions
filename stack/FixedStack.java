package stack;

class FixedStack implements InStack{
   private int stack[];
   private int tos;
   
   //Constructor
   FixedStack(int size){
      this.stack = new int[size];
      this.tos = -1;
   }
   
   //Push onto stack
   public void push (int item) {
      if (this.tos==this.stack.length-1) {
         System.out.println("Stack is full");
      }
      else {
         this.stack[++this.tos] = item;
      }
   }
   
   //Pop off Stack
   public int pop () {
      if (this.tos<0) {
         System.out.println("Stack underflow. ");
         return 0;
      }
      else {
         return this.stack[this.tos --];
      }
   }

   @Override
   public int getLength() {
      //get length
      return this.stack.length;
   }

   @Override
   public int getTOS() {
      // TODO Auto-generated method stub
      return this.tos;
   }
}
