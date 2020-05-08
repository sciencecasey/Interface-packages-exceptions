package exceptionsCommon;

import java.util.ArrayList;

public class ArrayIndexOutOfBoundsThrown { 
   //this will generate index out of bounds and null pointer
   public ArrayList<String> inputArray;
   ArrayIndexOutOfBoundsThrown(String input){
      this.inputArray = new ArrayList<String>();
      String tempString = input.strip();
      int spaceIndex = tempString.indexOf(' ');
      while (spaceIndex>0) {
         //grab first word
         String word = tempString.substring(0, spaceIndex);
         this.inputArray.add(word);
         //remove word from input
         tempString = tempString.substring(spaceIndex);
         //re-index
         spaceIndex = tempString.indexOf(' ');
      }
      if (spaceIndex==0) {
         this.inputArray.add(tempString);
      }
   }
   
   /**
    * This will throw out of bounds as index is 1 less than length returned by 
    *  size
    */
   public void arrayToString() {
      for (int i = 0; i<=this.inputArray.size(); i++) {
         System.out.print(this.inputArray.get(i));
         System.out.println("\n");
      }
   }
   
   
   public static void main(String[] args) {
      ArrayIndexOutOfBoundsThrown noArrayThere = 
            new ArrayIndexOutOfBoundsThrown("Try please");
      noArrayThere.arrayToString();
   }

}
