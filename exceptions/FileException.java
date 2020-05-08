package exceptions;

/**
 * @author CaseyJayne
 *
 */
public class FileException extends Exception{
   /**
    * 
    */
   private static final long serialVersionUID = 1L;
   private String fileName;
   private int recNum;
   private int fieldNum;
  
   
   /**
    * @param fileName name of file being processed
    * @param recNum record number in file being processed when error discovered
    * @param fieldNum field number in record being processed when error 
    *    discovered
    */
   public FileException(String fileName, int recNum, int fieldNum) {
      this.fileName = fileName;
      this.recNum = recNum;
      this.fieldNum = fieldNum;
   }
   /*
    * Returns String description of exception
    */
   public String toString() {
      return "Exception file: " + this.fileName + " rec: " + this.recNum +
            " field: " + this.fieldNum + " invalid.";
   }
   /*
    * Returns String description
    */
   public String getMessage() {
      return toString();
   }

}
