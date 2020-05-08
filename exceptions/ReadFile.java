package exceptions;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author CaseyJayne
 *throws in the construction with params that will throw filenot found
 *if using readFile method without params could throw custom exception defined
 *as FileException
 */
public class ReadFile{
   private Scanner inFile;
   private String fileName;
   private int recNum;
   private int fieldIndex;
   private int numFields;
   
   /**
    * @param inFileName
    * @param numFields
    * @throws FileNotFoundException
    */
   public ReadFile (String inFileName, int numFields) 
      throws FileNotFoundException{
         this.fileName = inFileName;
         this.inFile = new Scanner(new File(this.fileName));
         this.numFields = numFields;
   }
   
   /**
    * nextInt can throw a input Mismatch, so we look for it but we also
    * look for the regular exception.  Use the info we have in here to pass
    * into the custom exception which gives a detailed output of information
    * about the exception
    * @throws FileException
    */
   public void readFile() throws FileException{
      this.recNum = 0;
      try {
         while(this.inFile.hasNext()) {
            System.out.println("Rec: " + this.recNum);
            for(this.fieldIndex = 0; this.fieldIndex<this.numFields;
                  this.fieldIndex++) {
               System.out.println("  Field" + this.fieldIndex + ":"
                     + this.inFile.nextInt());
            }
            this.recNum++;
         }
      }
      catch(InputMismatchException except) {
         System.out.println("InputMismatchException");
         FileException dfe = new FileException(this.fileName, this.recNum,
               this.fieldIndex);
         dfe.initCause(new InputMismatchException());
         throw dfe;
      }
      catch(Exception except) {
         System.out.println("Exception");
         FileException dfe = new FileException(this.fileName, this.recNum,
               this.fieldIndex);
         dfe.initCause(new InputMismatchException());
         throw dfe;
      }
      finally {
         this.inFile.close();
      }
   }
}