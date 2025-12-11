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
public class RentedCarTest {
    
    Customer newC = new Customer(1, "Dustin Dwayne Diaz", 'M', new Date(2005, 03, 14),
    "100 West Street", "+64225400799", 5002019, LicenseType.RESTRICTED, new Date(2039, 3, 8));
    Customer c = new Customer(4, "Christoper Luxon", 'M', new Date(1987, 3, 14),
    "1 King Street", "+642103295342", 34512, LicenseType.RESTRICTED, new Date(2021, 1, 4));
    RentedCar rc = new RentedCar(c, "Toyota Motorola", new Date(2025, 5, 13));
    
    public RentedCarTest() {
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of getCustomer method, of class RentedCar.
     */
    @Test
    public void testGetCustomer() {
        assertEquals(rc.getCustomer(), c);
    }

    /**
     * Test of setCustomer method, of class RentedCar.
     */
    @Test
    public void testSetCustomer() {
        rc.setCustomer(newC);
        assertEquals(rc.getCustomer(), newC);
    }

    /**
     * Test of getCar method, of class RentedCar.
     */
    @Test
    public void testGetCar() {
        assertEquals(rc.getCar(), "Toyota Motorola");
    }

    /**
     * Test of setCar method, of class RentedCar.
     */
    @Test
    public void testSetCar() {
        rc.setCar("Ford Medina");
        assertEquals(rc.getCar(), "Ford Medina");
    }

    /**
     * Test of getDateRented method, of class RentedCar.
     */
    @Test
    public void testGetDateRented() {
        assertEquals(rc.getDateRented(), new Date(2025, 5, 13));
    }

    /**
     * Test of setDateRented method, of class RentedCar.
     */
    @Test
    public void testSetDateRented() {
        rc.setDateRented(new Date(2016, 03, 13));
        assertEquals(rc.getDateRented(), new Date(2016, 03, 13));
    }
    
}
