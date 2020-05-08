package DrawOptions;

/** creates a vehicle with a name & age (with getters and setters), and all 
 * methods from DrawRotateResizeSounds
 * @author CaseyJayne
 *
 */
public class Vehicle implements DrawRotateResizeSounds {
   String name;
   int age;
   Vehicle(String model, int year){
      setName(model);
      setAge(year);
   }
   
   //default constructor
   Vehicle(){
      setName("<null>");
      setAge(-1);
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
   /**
    * @return the age
    */
   public int getAge() {
      return this.age;
   }
   /**
    * @param age the age to set
    */
   protected void setAge(int age) {
      this.age = age;
   }
   
   @Override
   public void drawObject() {
      System.out.println("Drawing a Vehicle of type: " + getName() + ".  "
            + "Made in year: " + getAge());
   }

   @Override
   public void rotateObject() {
      System.out.println("Rotating a Vehicle of type: " + getName() + ".  "
            + "Made in year: " + getAge());
   }

   @Override
   public void resizeObject() {
      System.out.println("Resizing a Vehicle of type: " + getName() + ".  "
            + "Made in year: " + getAge());
   }

   @Override
   public void playSound() {
      System.out.println("Vehicle sound, from type: " + getName() + ".  "
            + "Made in year: " + getAge());
   }

}
