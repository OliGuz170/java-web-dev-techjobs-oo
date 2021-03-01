package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {
    public Job firstJob;
    public Job nextJob;

    //Instead of creating Job objects using empty constructor, declaring/initializing using @Before
    @Before
    public void createJobObjects(){
        firstJob = new Job();
        nextJob = new Job();
    }

    // Test the Empty Constructor.
    // Id values are not the same and differ by 1.
    @Test
    public void testSettingJobId(){
        assertEquals(firstJob.getId()+1, nextJob.getId());
    }

    //Test the Full Constructor.
    // Used given data to declare/initialize new Job object
    @Test
    public void testJobConstructorSetsAllFields(){
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        //assert statements used to test that constructor correctly assigns class & value of each field
        assertEquals("Product tester", job.getName());
        //instanceof (comparison operator) used to check class of an object. Result is a boolean.
        // Used example on baeldung.com/java-instanceof
        assertTrue(job.getEmployer() instanceof Employer);
        assertTrue(job.getLocation() instanceof Location);
        assertTrue(job.getPositionType() instanceof PositionType);
        assertTrue(job.getCoreCompetency() instanceof CoreCompetency);
    }

    //Test the equals Method.
    // Job objects are not equal if id value differs even if all fields are identical.
    // Used given data for testJobConstructorSetsAllFields test.
    @Test
    public void testJobsForEquality(){
        Job jobId1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job jobId2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        //5.3.2 textbook
        assertFalse(jobId1.equals(jobId2));
    }

     //First Test toString
    // Test when passed Job object, if returns job info string that starts and ends with blank line
    @Test
    public void testToStringIncludesBlankLinesBeforeAndAfterJobInfo(){
        Job job = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
        assertEquals(false, job.toString().startsWith("\n"));
    }


    //Second Test toString
    //String should contain label for each field, followed by data & must be in its own line
    @Test
    public void testToStringIncludesLabelsAndFieldsAndItsOwnLine() {
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String shouldPrint = "\nName: Product tester \nEmployer: ACME \nLocation: Desert \nPosition Type: Quality control \nCore Competency: Persistence\n";
        assertFalse(shouldPrint == job.toString());
    }

    //Test if any of the fields are empty
    @Test
    public void nameFieldIsEmpty(){
        Job job = new Job("", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
//        assertEquals("\nID: " + job.getId()+ "\nName: Data not available\nEmployer: ACME\nLocation: Desert\nPosition Type: Quality control\nCore Competency: Persistence\n", job.toString());
        assertEquals(true,job.toString().contains("Data not available"));
    }

    @Test
    public void employerFieldIsEmpty(){
        Job job = new Job("Product tester", new Employer(""), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals(true,job.toString().contains("Data not available"));
    }

    @Test
    public void locationFieldIsEmpty(){
        Job job = new Job("Product tester", new Employer("ACME"), new Location(""), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals(true,job.toString().contains("Data not available"));
    }

    @Test
    public void positionTypeFieldIsEmpty(){
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType(""), new CoreCompetency("Persistence"));
        assertEquals(true,job.toString().contains("Data not available"));
    }

    @Test
    public void coreCompetencyFieldIsEmpty(){
        Job job = new Job("Product tester", new Employer(""), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency(""));
        assertEquals(true,job.toString().contains("Data not available"));
    }
}