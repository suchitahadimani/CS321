import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Tester 
{

    ////////////////////////////////////////////////////////////////////////////
    //Data Entry test functions

    private DataEntry dataEntry;

    @BeforeEach
    public void setUp() {
        dataEntry = new DataEntry();
    }

    @Test
    public void test_name() {

      try{
        dataEntry.setName("John Doe");
        assertEquals("John Doe", dataEntry.getName());
      }
        

      catch(AssertionError e)
      {
          System.out.println("name is not a string!!");
      }
    }

    @Test
    public void test_address() {
      try{
        dataEntry.setAddress("123 Main St");
        assertEquals("123 Main St", dataEntry.getAddress());
      }
        

        catch(AssertionError e)
      {
          System.out.println("name is not a string!!");
      }
    }

    @Test
    public void test_email() {
      try{
        dataEntry.setEmail("johndoe@example.com");
        assertEquals("johndoe@example.com", dataEntry.getEmail());
      }
        

        catch(AssertionError e)
      {
          System.out.println("name is not a string!!");
      }
    }

    @Test
    public void test_ssn() {
      try{
        dataEntry.setSsn(123456789);
        assertEquals(123456789, dataEntry.getSsn());
      }
        

        catch(AssertionError e)
      {
          System.out.println("name is not a string!!");
      }
    }

    @Test
    public void test_dob() {
      try{
        dataEntry.setDob(19900101);
        assertEquals(19900101, dataEntry.getDob());
      }
        

        catch(AssertionError e)
      {
          System.out.println("name is not a string!!");
      }
    }

    @Test
    public void test_phone_number() {
      try{
        dataEntry.setPhoneNumber(1234567890);
        assertEquals(1234567890, dataEntry.getPhoneNumber());
      }
        

        catch(AssertionError e)
      {
          System.out.println("name is not a string!!");
      }
    }

    @Test
    public void test_job() {
      try{
        String[] jobs = {"Software Engineer", "Data Analyst"};
        dataEntry.setJob(jobs);
        assertArrayEquals(jobs, dataEntry.getJob());
      }
        

        catch(AssertionError e)
      {
          System.out.println("name is not a string!!");
      }
    }

    @Test
    public void test_education() {
      try{
        String[] education = {"Bachelor's in Computer Science", "Master's in Business Administration"};
        dataEntry.setEducation(education);
        assertArrayEquals(education, dataEntry.getEducation());
      }
        

        catch(AssertionError e)
      {
          System.out.println("name is not a string!!");
      }
    }

    @Test
    public void test_files() {
      try{
        File[] files = {new File("file1.txt"), new File("file2.txt")};
        dataEntry.setFiles(files);
        assertArrayEquals(files, dataEntry.getFiles());
      }
        

        catch(AssertionError e)
      {
          System.out.println("name is not a string!!");
      }
    }


  
  
    @Test
    private static void test_name()
    {
      DataEntry obj = new DataEntry();
        try 
        {
            assertEquals("java.lang.String", obj.getName().getClass().getName());
        }
        catch(AssertionError e)
        {
            System.out.println("name is not a string!!");
        }
    }

    @Test
    private static void test_email()
    {
      DataEntry obj = new DataEntry();
        try 
        {
            assertEquals("java.lang.String", obj.getEmail().getClass().getName());
        }
        catch(AssertionError e)
        {
            System.out.println("email is not a string!!");
        }
    }


        @Test
    private static void test_address()
    {
      DataEntry obj = new DataEntry();
        try 
        {
            assertEquals("java.lang.String", obj.getAddress().getClass().getName());
        }
        catch(AssertionError e)
        {
            System.out.println("address is not a string!!");
        }
    }

        @Test
    private static void test_job()
    {
      DataEntry obj = new DataEntry();
        try 
        {
            for(int i = 0; i < obj.getJob().length; i++){
              assertEquals("java.lang.String", obj.getJob().getClass().getName());
            }
            
        }
        catch(AssertionError e)
        {
            System.out.println("job is not a string!!");
        }
    }


    @Test
    private static void test_edu()
    {
      DataEntry obj = new DataEntry();
        try 
        {
            for(int i = 0; i < obj.getEducation().length; i++){
              assertEquals("java.lang.String", obj.getEducation().getClass().getName());
            }
        }
        catch(AssertionError e)
        {
            System.out.println("educaiton is not a string!!");
        }
    }

      @Test
    private static void test_number()
    {
      DataEntry obj = new DataEntry();
        try 
        {
            assertEquals("java.lang.String", obj.getPhoneNumber());
        }
        catch(AssertionError e)
        {
            System.out.println("name is not a string!!");
        }

    
    ////////////////////////////////////////////////////////////////////////////
    //testing workflow class
    private Workflow workflow;

    @BeforeEach
    public void setUp() {
        workflow = new Workflow();
    }

    @Test
    public void testGetCurrentStep() {
        try {
            int currentStep = workflow.getCurrentStep();
            assertEquals(0, currentStep);
        } catch (Exception e) {
            fail("Exception occurred: " + e.getMessage());
        }
    }

    @Test
    public void testSetCurrentStep() {
        try {
            workflow.setCurrentStep(1);
            int currentStep = workflow.getCurrentStep();
            assertEquals(1, currentStep);
        } catch (Exception e) {
            fail("Exception occurred: " + e.getMessage());
        }
    }

    @Test
    public void testGetNext() {
        try {
            int nextStep = workflow.getNext(2);
            assertEquals(3, nextStep);
        } catch (Exception e) {
            fail("Exception occurred: " + e.getMessage());
        }
    }

    @Test
    public void testHasNext() {
        try {
            boolean hasNext = workflow.hasNext(2);
            assertTrue(hasNext);
        } catch (Exception e) {
            fail("Exception occurred: " + e.getMessage());
        }
    }



  


    public static void main(String[] args)
    {
        test_number();
    }




}