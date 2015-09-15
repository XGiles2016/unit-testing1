/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import edu.worcester.cs.kwurst.Student;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Xavi
 */
public class StudentTest {
    private static Student s1;
    
    
    @BeforeClass
    public static void setUpClass() {
      s1 = new Student("John", "Jones");
    }
    
    @Test
    public void testCurrentEarnedCr() {
        int credits = 45;
        s1.setCurrentEarnedCr(credits);
        assertEquals(45, s1.getCurrentEarnedCr());
    }
    //Second test for testing current earned credits. EXPECTED FAILURE!!!
        @Test
    public void testCurrentEarnedCr2() {
        int credits = 45;
        s1.setCurrentEarnedCr(credits);
        assertEquals(40, s1.getCurrentEarnedCr());
    }
    @Test
    public void testAnticipatedAddtlCredits(){
        int credits = 45;
        s1.setAnticipatedAdditionalCr(credits);
        assertEquals(45, s1.getAnticipatedAdditionalCr());
    }
    /**
     * Test of readyToGraduate method, of class Student.
     */
    @Test
    public void testReadyToGraduate() {
        s1.setCurrentEarnedCr(120);
        s1.setGpa(3.0);
        s1.setLascComplete(true);
        s1.setMajorComplete(true);
        boolean expResult = true;
        assertEquals(expResult, s1.readyToGraduate());  
    }
    
    @Test
    public void testReadyToGraduate2() {
        s1.setCurrentEarnedCr(110);
        s1.setGpa(3.0);
        s1.setLascComplete(true);
        s1.setMajorComplete(true);
        boolean expResult = false;
        assertEquals(expResult, s1.readyToGraduate());  
    }
     @Test
    public void testReadyToGraduate3() {
        s1.setCurrentEarnedCr(120);
        s1.setGpa(1.0);
        s1.setLascComplete(true);
        s1.setMajorComplete(true);
        boolean expResult = false;
        assertEquals(expResult, s1.readyToGraduate());  
    }

     @Test
    public void testReadyToGraduate4() {
        s1.setCurrentEarnedCr(120);
        s1.setGpa(3.0);
        s1.setLascComplete(false);
        s1.setMajorComplete(true);
        boolean expResult = false;
        assertEquals(expResult, s1.readyToGraduate());  
    }
     
    @Test
    public void testReadyToGraduate5() {
        s1.setCurrentEarnedCr(120);
        s1.setGpa(3.0);
        s1.setLascComplete(true);
        s1.setMajorComplete(false);
        boolean expResult = false;
        assertEquals(expResult, s1.readyToGraduate());  
    }
}
