/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package employeecustomermanagement;

import java.util.Date;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author nepom
 */
public class PersonTest {
    
    Person p = new Customer(1, "Dustin", 'M', new Date(2005, 03, 14), "100 West Street",
    "0225400799", 122, LicenseType.LEARNER, new Date(2034, 11, 11));
    public PersonTest() {
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of getPersonID method, of class Person.
     */
    @Test
    public void testGetPersonID() {
        assertEquals(p.getPersonID(), 1);
    }

    /**
     * Test of setPersonID method, of class Person.
     */
    @Test
    public void testSetPersonID() {
        p.setPersonID(2);
        assertEquals(p.getPersonID(), 2);
    }

    /**
     * Test of getName method, of class Person.
     */
    @Test
    public void testGetName() {
        assertEquals(p.getName(), "Dustin");
    }

    /**
     * Test of setName method, of class Person.
     */
    @Test
    public void testSetName() {
        p.setName("Justin");
        assertEquals(p.getName(), "Justin");
    }

    /**
     * Test of getGender method, of class Person.
     */
    @Test
    public void testGetGender() {
        assertEquals(p.getGender(), "Male");
    }

    /**
     * Test of setGender method, of class Person.
     */
    @Test
    public void testSetGender() {
        p.setGender('O');
        assertEquals(p.getGender(), "Other");
    }

    /**
     * Test of getDateOfBirth method, of class Person.
     */
    @Test
    public void testGetDateOfBirth() {
        assertEquals(p.getDateOfBirth(), new Date(2005, 03, 14));
    }

    /**
     * Test of setDateOfBirth method, of class Person.
     */
    @Test
    public void testSetDateOfBirth() {
        p.setDateOfBirth(new Date(2005, 10, 28));
        assertEquals(p.getDateOfBirth(), new Date(2005, 10, 28));
    }

    /**
     * Test of getAddress method, of class Person.
     */
    @Test
    public void testGetAddress() {
        assertEquals(p.getAddress(), "100 West Street");
    }

    /**
     * Test of setAddress method, of class Person.
     */
    @Test
    public void testSetAddress() {
        p.setAddress("Somewhere in Manurewa I think");
        assertEquals(p.getAddress(), "Somewhere in Manurewa I think");
    }

    /**
     * Test of getTelNumber method, of class Person.
     */
    @Test
    public void testGetTelNumber() {
        assertEquals(p.getTelNumber(), "0225400799");
    }

    /**
     * Test of setTelNumber method, of class Person.
     */
    @Test
    public void testSetTelNumber() {
        p.setTelNumber("0221113333");
        assertEquals(p.getTelNumber(), "0221113333");
    }
}
