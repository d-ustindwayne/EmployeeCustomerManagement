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
public class DatabaseTest {
    
    Database database = new Database();
    Customer cus = new Customer(10, "Kilometers Morales", 'M', new Date(2022, 10, 15),
    "51 Gulliver Street", "1-4355642", 616, LicenseType.LEARNER, new Date(2034, 11, 8));
    Employee emp = new Employee(11, "Peter Parker", 'M', new Date(2000, 01, 04),
    "12 Queen Street", "134325321", "199999", Role.SALES, "peterParker()", "Integer.parseInt()");
    RentedCar rc = new RentedCar(cus, "Vulla 13", new Date(2025, 10, 25));
    
    public DatabaseTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @Test
    public void testAddCustomer() {
        database.CustomerList.add(cus);
        int listSize = database.CustomerList.size() - 1;
        assertEquals(cus, database.CustomerList.get(listSize));
    }
    
    @Test
    public void testAddEmployee() {
        database.EmployeeList.add(emp);
        int listSize = database.EmployeeList.size() - 1;
        assertEquals(emp, database.EmployeeList.get(listSize));
    }
    
    @Test
    public void testAddRentedCar() {
        database.CarRentedList.add(rc);
        int listSize = database.CarRentedList.size() - 1;
        assertEquals(rc, database.CarRentedList.get(listSize));
    }
    
}
