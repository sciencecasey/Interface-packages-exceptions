package magic8ball;

interface Probabilities extends SharedConstants{
   /**
    * Meant to use random util to define the resulting return integer
    * @return integer value, based on the 0-5 finals from extended or
    * a new declaration
    *  
    */
   int returnResult();
}
