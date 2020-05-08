package magic8ball;

import java.util.Random;

/**
 * @author CaseyJayne
 *
 */
class AskMe implements Probabilities{

   @Override
   public int returnResult() {
      Random rand = new Random();
      int prob = (int) (100 * rand.nextDouble());
      if (prob < 30) {
         return NO;
      }
      else if (prob <60) {
         return YES;
      }
      else if (prob < 75) {
         return LATER;
      }
      else if (prob < 98) {
         return SOON;
      }
      else {
         return NEVER;
      }
   }

}
