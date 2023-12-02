
import static org.junit.Assert.*;
import org.junit.Test;

import java.beans.Transient;

public class Tester 
{

    ////////////////////////////////////////////////////////////////////////////
    //testing Workflow class
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




    /////////////////////////////////////////////////
    //Business Object Test cases
  
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


    public static void main(String args[]){
        checkAddDB();
        checkRetrieveDB();
        checkWorkflow();
    }

    


}