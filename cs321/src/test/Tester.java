package CS321.src.test;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import CS321.src.main.Workflow;
import CS321.src.main.Approval;
import CS321.src.main.Business;
import CS321.src.main.DataEntry;

import static org.junit.jupiter.api.Assertions.*;
import java.io.File;

import java.beans.Transient;

public class Tester 
{

    ////////////////////////////////////////////////////////////////////////////
    //testing Workflow class


    //ensures that the workflow creates the workflow table when calling its constructor
   @Test
    public void checkWorkflow() {

        Workflow wf = new Workflow();

        //if the constructor was iniatialized incorrectly will be false
        assertTrue(wf.getTable() != null);
    }



    /////////////////////////////////////////////////
    //Business Object Test cases
    
    //testing to see if the data entries are added to the database
    @Test
    public void checkAddDB() {

        // creates a business object and data entry to add to database
        Business obj = new Business();
        DataEntry dataEntry = new DataEntry(null, obj);


        // creates a valid data entry to be added to the databae
        dataEntry.setFirstName("John");
        dataEntry.setLastName("Doe");
        dataEntry.setEmail("john.doe@example.com");
        dataEntry.setCity("City");
        dataEntry.setState("State");
        dataEntry.setJob("Job");
        dataEntry.setEducation("Education");
        dataEntry.setPhoneNumber("12345678901");
        dataEntry.setDob(20201231); 
        dataEntry.setPhoneNumber("1234567890"); 

        //adds it to the array list
        obj.add_DB(dataEntry);

        //if the object is added then there should be one object in the data base
        assertTrue(obj.getSize() == 1);

    }


    @Test
    public void checkRetrieveDB() {

        // creates a business object and data entry to add to database
        Business obj = new Business();
        DataEntry dataEntry = new DataEntry(null, obj);


        // creates a valid data entry to be added to the databae
        dataEntry.setFirstName("John");
        dataEntry.setLastName("Doe");
        dataEntry.setEmail("john.doe@example.com");
        dataEntry.setCity("City");
        dataEntry.setState("State");
        dataEntry.setJob("Job");
        dataEntry.setEducation("Education");
        dataEntry.setPhoneNumber("12345678901");
        dataEntry.setDob(20201231); 
        dataEntry.setPhoneNumber("1234567890"); 

        
        //adds it to the array list
        obj.add_DB(dataEntry);

        //if the object is added then it should be able to be retrieved
        assertTrue(obj.retrieve_DB(0).getFirstName()  == "John");

    }

    //actually runs
    public static void main(String[] args)
    {
       checkAddDB();
       checkRetrieveDB();
       checkWorkflow();

    }




}