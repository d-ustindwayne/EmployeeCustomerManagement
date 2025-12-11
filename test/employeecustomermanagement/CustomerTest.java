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
public class CustomerTest {
   
    Customer c = new Customer(1, "Garry", 'M', new Date(2000, 0, 1), 
            "10/20 Papakura", "092242304", 123, LicenseType.FULL, new Date(2025, 11, 11));
    public CustomerTest() {
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of getLicenseNumber method, of class Customer.
     */
    @Test
    public void testGetLicenseNumber() {
        assertEquals(c.getLicenseNumber(), 123);
    }

    /**
     * Test of setLicenseNumber method, of class Customer.
     */
    @Test
    public void testSetLicenseNumber() {
        c.setLicenseNumber(12);
        assertEquals(c.getLicenseNumber(), 12);
    }

    /**
     * Test of getLicenseType method, of class Customer.
     */
    @Test
    public void testGetLicenseType() {
        assertEquals(c.getLicenseType(), LicenseType.FULL);
    }

    /**
     * Test of setLicenseType method, of class Customer.
     */
    @Test
    public void testSetLicenseType() {
        c.setLicenseType(LicenseType.LEARNER);
        assertEquals(c.getLicenseType(), LicenseType.LEARNER);
    }

    /**
     * Test of getLicenseExpiryDate method, of class Customer.
     */
    @Test
    public void testGetLicenseExpiryDate() {
        assertEquals(c.getLicenseExpiryDate(), new Date(2025, 11, 11));
    }

    /**
     * Test of setLicenseExpiryDate method, of class Customer.
     */
    @Test
    public void testSetLicenseExpiryDate() {
        c.setLicenseExpiryDate(new Date(2026, 4, 12));
        assertEquals(c.getLicenseExpiryDate(), new Date(2026, 4, 12));
    }
}