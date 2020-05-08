package DrawOptions;

/**
 * display the methods implemented from various DrawRotateResize interfaces by 
 * looping through an array of objects
 * @author CaseyJayne
 *
 */
public class Manipulator {

   @SuppressWarnings("javadoc")
   public static void main(String[] args) {
      DrawRotateResizeSounds [] teachingTool = {new Buffalo("Buffalo Babs"), 
            new Motorcycle("Harley", 1972), 
            new Llama("Leslie Llama"), new Truck("Ford", 1954)};
      
      //Loop through the array
      for(DrawRotateResizeSounds i: teachingTool) {
         i.drawObject();
         i.resizeObject();
         i.rotateObject();
         i.playSound();
      }

   }

}
