import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Tester 
{

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
    }


    @Test
    private static void test1()
    {
        try 
        {
            assertEquals("It Works!", "helelo", "hello");
        }
        catch(AssertionError e)
        {
            System.out.println("Error!!");
        }
    }



    public static void main(String[] args)
    {
        test1();
    }



/*
import org.junit.*;
import static org.junit.Assert.*;
import org.junit.rules.ExpectedException;
import java.io.File;
import java.util.Iterator;

public class Tester {
  private String errorMessage1 = "iterator returns incorrect element";
  private String errorMessage2 = "Iterator crashed. Maybe because of a file I/O error or an incorrect number of iterations";
  
 

    // double for-loop that doesn't skip anything
  @Test(timeout=1000)
  private static void test()
  {
        try 
        {
          assertEquals("It Works!", "helelo", "hello");
        }
        catch(AssertionError e)
        {
            System.out.println("Error!!");
        }

  }

   public static void main(String args[]){
    //org.junit.runner.JUnitCore.main("Tester");
    test();
  }

  
  // double for-loop that doesn't skip anything
  @Test(timeout=1000)
  public void test_1()
  {
    String[] expected = {"w1", "w2", "w3", "w4", "w5", "w6", "w7", "w8", "w9", "w10", "w11", "w12", "w13", "w14", "w15", "w1", "w2", "w3", "w4", "veritas", "w6", "w7", "w8", "w9", "moribus", "w11", "inmaturitas", "w13", "w14", "w15", "malignus", "w1", "w2", "w3", "w4", "w5", "w6", "w7", "w8", "w9", "w10", "w11", "w1", "w2", "w3", "w4", "w5", "w6", "w7", "w8", "w9", "w10", "veritas", "w2", "w3", "w4", "w5", "moribus", "w7", "inmaturitas", "malignus", "w10", "w11", "w12", "w13", "w14"};
    try
    {
      File fp = new File("test1.dat");
      ReviewList list = new ReviewList(fp);
      int index = 0;
      for (Review r : list)
          for (String s : r)
              assertEquals(errorMessage1, expected[index++], s);
    }
    catch(Exception e)
    {
      fail(errorMessage2);
    }
  }

  // double while-loop that doesn't skip anything
  @Test(timeout=1000)
  public void test_2()
  {
    String[] expected = {"w1", "w2", "w3", "w4", "w5", "w6", "w7", "w8", "w9", "w10", "w11", "w12", "w13", "w14", "w15", "w1", "w2", "w3", "w4", "veritas", "w6", "w7", "w8", "w9", "moribus", "w11", "inmaturitas", "w13", "w14", "w15", "malignus", "w1", "w2", "w3", "w4", "w5", "w6", "w7", "w8", "w9", "w10", "w11", "w1", "w2", "w3", "w4", "w5", "w6", "w7", "w8", "w9", "w10", "veritas", "w2", "w3", "w4", "w5", "moribus", "w7", "inmaturitas", "malignus", "w10", "w11", "w12", "w13", "w14"};
    try
    {
      File fp = new File("test1.dat");
      ReviewList list = new ReviewList(fp);
      int index = 0;
      Iterator<Review> it1 = list.iterator();
      while(it1.hasNext())
      {
          Review r = it1.next();
          Iterator<String> it2 = r.iterator(false);
          while(it2.hasNext())
              assertEquals(errorMessage1, expected[index++], it2.next());
      }
    }
    catch(Exception e)
    {
      fail(errorMessage2);
    }
  }

  }

  */

}