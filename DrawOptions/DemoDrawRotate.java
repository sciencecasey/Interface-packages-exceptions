package DrawOptions;

public class DemoDrawRotate {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      DrawAndRotate [] test = {new Boat(), new PineTree(), new YourMom()};
    
   for(DrawAndRotate i: test) {
      i.drawObject();
      i.rotateObject();
   }
   }
}
