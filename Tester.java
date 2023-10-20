import static org.junit.Assert.*;
import org.junit.Test;

public class Tester 
{
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
            assertEquals("java.lang.String", obj.getJobs().getClass().getName());
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
            assertEquals("java.lang.String", obj.getEducation().getClass().getName());
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

  // double loop that iterates over all reviews and skips the suspicious words in them
  @Test(timeout=1000)
  public void test_3()
  {
    String[] expected = {"w1", "w2", "w3", "w4", "w5", "w6", "w7", "w8", "w9", "w10", "w11", "w12", "w13", "w14", "w15", "w1", "w2", "w3", "w4", "w6", "w7", "w8", "w9", "w11", "w13", "w14", "w15", "w1", "w2", "w3", "w4", "w5", "w6", "w7", "w8", "w9", "w10", "w11", "w1", "w2", "w3", "w4", "w5", "w6", "w7", "w8", "w9", "w10", "w2", "w3", "w4", "w5", "w7", "w10", "w11", "w12", "w13", "w14"};
    try
    {
      File fp = new File("test1.dat");
      ReviewList list = new ReviewList(fp);
      int index = 0;
      for (Review r : list)
      {
          Iterator<String> it2 = r.iterator(true);
          while(it2.hasNext())
              assertEquals(errorMessage1, expected[index++], it2.next());
      }
    }
    catch(Exception e)
    {
      fail(errorMessage2);
    }
  }

  // double loop that skips the suspicious reviews and iterates over all the words in the non-suspicious reviews
  @Test(timeout=1000)
  public void test_4()
  {
    String[] expected = {"w1", "w2", "w3", "w4", "w5", "w6", "w7", "w8", "w9", "w10", "w11", "w12", "w13", "w14", "w15", "w1", "w2", "w3", "w4", "veritas", "w6", "w7", "w8", "w9", "moribus", "w11", "inmaturitas", "w13", "w14", "w15", "malignus", "w1", "w2", "w3", "w4", "w5", "w6", "w7", "w8", "w9", "w10", "w11"};
    try
    {
      File fp = new File("test1.dat");
      ReviewList list = new ReviewList(fp);
      int index = 0;
      Iterator<Review> it1 = list.iterator(true);
      while(it1.hasNext())
      {
          Review r = it1.next();
          for (String s : r)
              assertEquals(errorMessage1, expected[index++], s);
      }
    }
    catch(Exception e)
    {
      fail(errorMessage2);
    }
  }

  // double loop that skips the suspicious reviews and the suspicious words in the non-suspicious reviews
  @Test(timeout=1000)
  public void test_5()
  {
    String[] expected = {"w1", "w2", "w3", "w4", "w5", "w6", "w7", "w8", "w9", "w10", "w11", "w12", "w13", "w14", "w15", "w1", "w2", "w3", "w4", "w6", "w7", "w8", "w9", "w11", "w13", "w14", "w15", "w1", "w2", "w3", "w4", "w5", "w6", "w7", "w8", "w9", "w10", "w11"};
    try
    {
      File fp = new File("test1.dat");
      ReviewList list = new ReviewList(fp);
      int index = 0;
      Iterator<Review> it1 = list.iterator(true);
      while(it1.hasNext())
      {
          Review r = it1.next();
          Iterator<String> it2 = r.iterator(true);
          while(it2.hasNext())
              assertEquals(errorMessage1, expected[index++], it2.next());
      }
    }
    catch(Exception e)
    {
      fail(errorMessage2);
    }
  }

  */

}