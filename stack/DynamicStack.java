package stack;

class DynamicStack implements InStack{
   private int stack[];
   private int tos;
   
   /**
    * @return the tos
    */
   public int getTOS() {
      return this.tos;
   }

   //allocate and initialize stack
   DynamicStack(int size){
      this.stack = new int[size];
      this.tos = -1;
   }

   @Override
   public void push(int item) {
      //if stack is full, allocate larger stack
      if(this.tos==this.stack.length-1) {
         int temp[] = new int [this.stack.length*2]; //double the size
         for (int i=0; i<this.stack.length; i++) {
            temp[i] = this.stack[i];
            }
         this.stack = temp;
         this.stack[++this.tos] = item;
      }
      else {
         this.stack[++this.tos] = item;
      }
   }

   @Override
   public int pop() {
      // pop off stack
      if (this.tos <0) {
         System.out.println("Stack underflow.");
         return 0;
      }
      else {
         return this.stack[this.tos--];
      }
   }

   @Override
   public int getLength() {
      return this.stack.length;
   }
}
