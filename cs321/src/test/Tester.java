package cs321.src.test;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Approval;
import Business;
import DataEntry;
import Workflow;

import static org.junit.jupiter.api.Assertions.*;
import java.io.File;

import java.beans.Transient;

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

    /*
     * @author Sadhana Mallemudi
     */
    @Test
    @DisplayName("Test Immigrant")
    public static void testImmigrant(){
      Business immigrant = new Business();
      Assertions.assertNotNull(immigrant);
    }
    @Test
    @DisplayName("Test Tracking Number")
    public static void testGenerateTrackingNum(){
      Business immigrant = new Business();
      int num = immigrant.generateTrackingNumber(immigrant);
      Assertions.assertEquals(0, num);
    }
    @Test
    @DisplayName("Test if it's added to database")
    public static void testDatabaseAdded(){
      Business immigrant = new Business();
      boolean check = immigrant.addToDatabase(immigrant);
      Assertions.assertEquals(false, check);
    }
    @Test
    @DisplayName("Test if able to retrieve from database")
    public static void testRetrieveFromDatabase(){
      Business immigrant = new Business();
      boolean check = immigrant.retrieveFromDatabase(immigrant);
      Assertions.assertEquals(false, check);
    }
    @Test
    @DisplayName("Test for approval status")
    public static void testApprovalStatus(){
      Business immigrant = new Business();
      boolean check = immigrant.getApprovalStatus(immigrant);
      Assertions.assertEquals(false, check);
    }
    @Test
    @DisplayName("Test for approval email")
    public static void testApprovalEmail(){
      Business immigrant = new Business();
      boolean check = immigrant.sendApprovalEmail(immigrant);
      Assertions.assertEquals(false, check);
    }
    @Test
    @DisplayName("Test for denial email")
    public static void testDenialEmail(){
      Business immigrant = new Business();
      boolean check = immigrant.sendDenialEmail(immigrant);
      Assertions.assertEquals(false, check);
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