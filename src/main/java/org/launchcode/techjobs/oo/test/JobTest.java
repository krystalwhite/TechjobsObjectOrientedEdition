package org.launchcode.techjobs.oo.test;
import org.launchcode.techjobs.oo.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;


/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {

    Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

    @Test
    public void testSettingJobId() {
        Job job3 = new Job();
        Job job2 = new Job();
        assertNotEquals(job3.getId(), job2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        assertEquals("Product tester", job1.getName());
        assertEquals("ACME", job1.getEmployer().getValue());
        assertEquals("Desert", job1.getLocation().getValue());
        assertEquals("Quality control", job1.getPositionType().getValue());
        assertEquals("Persistence", job1.getCoreCompetency().getValue());
        assertTrue(job1 instanceof Job);
        assertTrue(job1.getEmployer() instanceof Employer);
        assertTrue(job1.getLocation() instanceof Location);
        assertTrue(job1.getPositionType() instanceof PositionType);
        assertTrue(job1.getCoreCompetency() instanceof CoreCompetency);
    }

    @Test
    public void testJobsForEquality() {
        Job job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(job1.equals(job2));
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        assertEquals(job1.toString().charAt(0), '\n');
        assertEquals(job1.toString().charAt(job1.toString().length() - 1), '\n');
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        String job1String = new String();
        job1String = '\n' + "ID: " + job1.getId() + '\n' + "Name: " + job1.getName() + '\n' + "Employer: " + job1.getEmployer() + '\n' + "Location: " + job1.getLocation() + '\n' + "Position Type: " + job1.getPositionType() + '\n' + "Core Competency: " + job1.getCoreCompetency() +'\n';
        assertEquals(job1.toString(), job1String);
    }

    @Test
    public void testToStringHandlesEmptyField() {
        Job job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType(), new CoreCompetency());
        String job2String = new String();
        job2String = '\n' + "ID: " + job2.getId() + '\n' + "Name: " + job2.getName() + '\n' + "Employer: " + job2.getEmployer() + '\n' + "Location: " + job2.getLocation() + '\n' + "Position Type: " + "Data not available" + '\n' + "Core Competency: " + "Data not available" +'\n';
        assertEquals(job2String, job2.toString());
    }


//    Come back for this bonus problem
    /*
    @Test
    public void testToStringHandlesJobWithIdOnly() {
        Job job3 = new Job();
        String job3String = new String("OOPS! This job does not seem to exist.");
        assertEquals(job3.toString(), job3String);
    }

     */

}
