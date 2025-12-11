/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package employeecustomermanagement;

import java.util.Calendar;
import java.util.Date;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author nepom
 */
public class IndexFrameTest {
    
    public IndexFrameTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    /**
     * Test of isInt method, of class HomeFrame.
     */
    @Test
    public void testIsIntPositive() {
        assertEquals(IndexFrame.isInt("12"), true);
    }
    
    @Test
    public void testIsIntNegative() {
        assertEquals(IndexFrame.isInt("-12"), true);
    }
    
    @Test
    public void testIsNotInt() {
        assertEquals(IndexFrame.isInt("m"), false);
    }

    /**
     * Test of CalendarNoHSM method, of class HomeFrame.
     */
    @Test
    public void testCalendarNoHSM() {
        Calendar tryDate = IndexFrame.CalendarNoHSM(new Date(2023, 2, 3));
        int year = 2023;
        int month = 2;
        int day = 3;
        // When you get the year from the calendar class, there is an offset by the system
        assertEquals(tryDate.get(Calendar.YEAR) - 1900, year);
        assertEquals(tryDate.get(Calendar.MONTH), month);
        assertEquals(tryDate.get(Calendar.DATE), day);
    }

    /**
     * Test of isSameDate method, of class HomeFrame.
     */
    @Test
    public void testIsSameDate() {
        Calendar c1 = Calendar.getInstance();
        c1.set(2022, 1, 14);
        Date d1 = new Date(2022, 1, 14);
        Calendar c2 = Calendar.getInstance();
        c2.set(d1.getYear(), d1.getMonth(), d1.getDate());
        assertEquals(IndexFrame.isSameDate(c1, c2), true);
    }
}
