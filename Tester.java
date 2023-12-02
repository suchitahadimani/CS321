
import static org.junit.Assert.*;
import org.junit.Test;

import java.beans.Transient;

public class Tester 
{

    /*
     * @author Sadhana Mallemudi
     * This is to test the constructor in the Workflow class. 
     */
   @Test
    public static void checkWorkflow() {

        try{
            Workflow wf = new Workflow();
            assertTrue(wf.getTable() != null);
            System.out.println("WORKFLOW TEST PASS");
        }
        


         catch(AssertionError e){
            System.out.println("WORKFLOW TEST FAILED");
        }
    }

    /*
     * @author Sadhana Mallemudi and Suchita Hadimani
     * This is to test to see if the item got added to the business object.
     */
    @Test
    public static void checkAddDB() {

        try{
            Business obj = new Business();
            Workflow wf = new Workflow();
            DataEntry dataEntry = new DataEntry(wf, obj);

            obj.add_DB(dataEntry);
            assertTrue(obj.getSize() != 0);
            System.out.println("ADD DB TEST PASS");

        }

        catch(AssertionError e){
            System.out.println("ADD DB TEST FAILED");
        }

        

    }

    /*
     * @author Suchita Hadimani
     * This is to test to see if the program is able to properly retrieve from the database in the business object.
     */
    @Test
    public static void checkRetrieveDB() {

        try{
            Business obj = new Business();
            Workflow wf = new Workflow();
            DataEntry dataEntry = new DataEntry(wf, obj);
            obj.add_DB(dataEntry);
            assertTrue(obj.retrieve_DB(0) != null);
             System.out.println("RETRIEVE TEST PASS");

        }

        catch(AssertionError e){
            System.out.println("RETRIEVE TEST FAILED");
        }

        

    }


    /*This is the main method to test. */
    public static void main(String args[]){
        checkAddDB();
        checkRetrieveDB();
        checkWorkflow();
    }

    /*Run using the command javac -cp .:junit-4.10.jar *.java followed by java -cp .:junit-4.10.jar Tester for MAC and javac -cp .;.\junit-4.10.jar *.java followed by java -cp .;junit-4.10.jar Tester for Windows. */


}