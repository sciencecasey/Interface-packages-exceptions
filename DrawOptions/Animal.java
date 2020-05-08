package DrawOptions;

/**creates an Animal with a name (with getters and setters), and all 
 * methods from DrawRotateResizeSounds
 * @author CaseyJayne
 *
 */
public class Animal implements DrawRotateResizeSounds {
   String name;
   //constructor taking name
   public Animal(String name){
      setName(name);
   }
   //default constructor
   public Animal(){
      setName("<null>");
   }
   /**
    * @return the name
    */
   public String getName() {
      return this.name;
   }
   /**
   * @param name the name to set
   */
  protected void setName(String name) {
     this.name = name;
  }
   @Override
   public void drawObject() {
      System.out.println("Drawing an Animal named: " + getName());
   }

   @Override
   public void rotateObject() {
      // TODO Auto-generated method stub
      System.out.println("Rotating an Animal named: " + getName());
   }

   @Override
   public void resizeObject() {
      // TODO Auto-generated method stub
      System.out.println("Resizing an Animal named: " + getName());
   }

   @Override
   public void playSound() {
      // TODO Auto-generated method stub
      System.out.println("Animal Sound, from: " + getName());
   }
}
