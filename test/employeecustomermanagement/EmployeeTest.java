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
public class EmployeeTest {
    
    Employee e = new Employee(4, "John Smith", 'F', new Date(2002, 03, 11),
"143 Address Street", "+329943763", "312", Role.SALES, "raindrop", "droptop");
    public EmployeeTest() {
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of getPhoneExt method, of class Employee.
     */
    @Test
    public void testGetPhoneExt() {
        assertEquals(e.getPhoneExt(), "312");
    }

    /**
     * Test of setPhoneExt method, of class Employee.
     */
    @Test
    public void testSetPhoneExt() {
        e.setPhoneExt("214");
        assertEquals(e.getPhoneExt(), "214");
    }

    /**
     * Test of getRole method, of class Employee.
     */
    @Test
    public void testGetRole() {
        assertEquals(e.getRole(), Role.SALES);
    }

    /**
     * Test of setRole method, of class Employee.
     */
    @Test
    public void testSetRole() {
        e.setRole(Role.DESKFRONT);
        assertEquals(e.getRole(), Role.DESKFRONT);
    }

    /**
     * Test of getUsername method, of class Employee.
     */
    @Test
    public void testGetUsername() {
        assertEquals(e.getUsername(), "raindrop");
    }

    /**
     * Test of setUsername method, of class Employee.
     */
    @Test
    public void testSetUsername() {
        e.setUsername("quavo11");
        assertEquals(e.getUsername(), "quavo11");
    }

    /**
     * Test of getPassword method, of class Employee.
     */
    @Test
    public void testGetPassword() {
        assertEquals(e.getPassword(), "droptop");
    }

    /**
     * Test of setPassword method, of class Employee.
     */
    @Test
    public void testSetPassword() {
        e.setPassword("migos11");
        assertEquals(e.getPassword(), "migos11");
    }
}