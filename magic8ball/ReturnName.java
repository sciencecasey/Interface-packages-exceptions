package magic8ball;
//import java.lang.reflect.Field;

class ReturnName extends AskMe{
         int value;
      
      public void getAnswer() {
         this.value = returnResult();
         switch(this.value) {
            case 0: {
               System.out.println("No");
               break;
            }
            case 1:{
               System.out.println("Yes");
               break;
            }
            case 2:{
               System.out.println("Maybe");
               break;
            }
            case 3:{
               System.out.println("Later");
               break;
            }
            case 4:{
               System.out.println("Soon");
               break;
            }
            case 5:{
               System.out.println("Never");
               break;
            }
         }
         System.out.println();
      }
}
         
         /*var name = returnResult();
      Field fld[] = AskMe.class.getDeclaredFields();
      Field returnedfld[] = ReturnName.class.getDeclaredFields();
      for (int i = 0; i < fld.length; i++){
         if (fld[i].getName().equals(returnedfld[0].getName())) {
            System.out.println(fld[i].getName());
         }
         else {
            System.out.println(fld[i].getName());
         }
      }                       
   }*/
   

