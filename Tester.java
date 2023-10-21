import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.File;

public class Tester 
{

    ////////////////////////////////////////////////////////////////////////////
    //Data Entry test functions


 @Test
    public static void testDisplay() {
        try {
          DataEntry obj = new DataEntry();
          assertTrue(true, obj.displayScreen());

        } 
        
        catch (Exception e) {
          System.out.println("display screen");
        }
    }


    @Test
    public static void testSubmit() {
        try {
          DataEntry obj = new DataEntry();
          assertTrue(true, obj.submit());

        } 
        
        catch (Exception e) {
          System.out.println("display screen");
        }
    }


   
    ////////////////////////////////////////////////////////////////////////////
    //testing workflow class


    @Test
    public static void testGetCurrentStep() {
        try {
          Workflow workflow = new Workflow();
          int currentStep = workflow.getCurrentStep();
          assertEquals(0, currentStep);
        } 
        
        catch (AssertionError e) {
          System.out.println("not stepping");
        }
    }

    @Test
    public static void testSetCurrentStep() {
        try {
          Workflow workflow = new Workflow();
          workflow.setCurrentStep(1);
          int currentStep = workflow.getCurrentStep();
          assertEquals(1, currentStep);
        } 
        catch (AssertionError e) {
          System.out.println("current steppp");
        }
    }

    @Test
    public static void testGetNext() {
        try {
          Workflow workflow = new Workflow();
          int nextStep = workflow.getNext(2);
          assertEquals(3, nextStep);
        } 
        catch (AssertionError e) {
          System.out.println("next step");
        }
    }

    @Test
    public static void testHasNext() {
        try {
          Workflow workflow = new Workflow();
          boolean hasNext = workflow.hasNext(2);
          assertTrue(hasNext);
        } 

        catch (AssertionError e) {
          System.out.println("has a next?");
        }
    }

    /////////////////////////////////////////////////
    //Approval Test cases

    @Test
    public static void testGetImmigrant() {
        try {
          Approval approval = new Approval();
          DataEntry immigrant = approval.getImmigrant();
          assertNull(immigrant); 
        } 

        catch (AssertionError e) {
          System.out.println("immigrant object found");
        }
    }

    @Test
    public static void testSetImmigrant() {
        try {
          Approval approval = new Approval();
          DataEntry immigrant = new DataEntry(); 
          approval.setImmigrant(immigrant);
          assertSame(immigrant, approval.getImmigrant());
        }

        catch (AssertionError e) {
          System.out.println("immigrantssss ");
        }
    }

    @Test
    public static void testGetAlienNumber() {
        try {
          Approval approval = new Approval();
          int alienNumber = approval.getAlienNumber();
          assertEquals(0, alienNumber);
        } 
        
        catch (AssertionError e) {
          System.out.println("alien number");
        }
    }

    @Test
    public static void testSetAlienNumber() {
        try {
            Approval approval = new Approval();
            approval.setAlienNumber(12345); 
            assertEquals(12345, approval.getAlienNumber());
        } 
        
        catch (AssertionError e) {
            System.out.println("set aline number");
        }
    }

    @Test
    public static void testApprove() {
        try {
          Approval approval = new Approval();
          boolean result = approval.approve(12345); 
          assertTrue(result);
        } 
        
        catch (AssertionError e) {
          System.out.println("approve method");
        }
    }

    @Test
    public static void testDisplayScreen() {
        try {
          Approval approval = new Approval();
          assertTrue(true, approval.displayScreen());

        } 
        
        catch (Exception e) {
          System.out.println("display screen");
        }
    }

    @Test
    public static void testClearScreen() {
        try {
          Approval approval = new Approval();
          assertTrue(true, approval.clearScreen());
        } 
        
        catch (AssertionError e) {
          System.out.println("Exception occurred: " + e.getMessage());
        }
    }

    @Test
    public static void testDeny(){
        try {
          Approval approval = new Approval();
          boolean result = approval.deny(12345); 
          assertFalse(result);
        } 
        
        catch (AssertionError e) {
          System.out.println("test deny");
        }
    }



    public static void main(String[] args)
    {
        testDeny();
        testApprove();
        testClearScreen();
        testDisplayScreen();
        testGetAlienNumber();
        testGetCurrentStep();
        testGetImmigrant();
        testGetNext();
        testHasNext();
        testSetAlienNumber();
        testSetCurrentStep();
        testSetImmigrant();
        

    }




}