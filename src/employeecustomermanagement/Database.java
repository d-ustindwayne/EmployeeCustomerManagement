/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employeecustomermanagement;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author nepom
 */
public class Database {

    public ArrayList<Customer> CustomerList;
    public ArrayList<Employee> EmployeeList;
    public ArrayList<RentedCar> CarRentedList;

    public Database() {
        this.CustomerList = new ArrayList<>();
        this.EmployeeList = new ArrayList<>();
        this.CarRentedList = new ArrayList<>();
        
        // this part is to add items to the list so that i can test the functions of the component
        // I will remove it after the project is done
        Calendar c1_dob = Calendar.getInstance();
        c1_dob.set(2005, 3, 13);
        Calendar c2_dob = Calendar.getInstance();
        c2_dob.set(2005, 10, 26);
        Calendar c3_dob = Calendar.getInstance();
        c3_dob.set(2005, 11, 30);
        Calendar c4_dob = Calendar.getInstance();
        c4_dob.set(1998, 7, 22);
        Calendar c5_dob = Calendar.getInstance();
        c5_dob.set(2001, 11, 5);
        Calendar c6_dob = Calendar.getInstance();
        c6_dob.set(1995, 1, 18);
        Calendar c7_dob = Calendar.getInstance();
        c7_dob.set(2003, 4, 30);
        Calendar c8_dob = Calendar.getInstance();
        c8_dob.set(1992, 9, 12);
        Calendar c9_dob = Calendar.getInstance();
        c9_dob.set(2000, 6, 25);
        Calendar c10_dob = Calendar.getInstance();
        c10_dob.set(1997, 2, 8);
        
        Calendar c1_LicExp = Calendar.getInstance();
        c1_LicExp.set(2034, 1, 7);
        
        Calendar c2_LicExp = Calendar.getInstance();
        c2_LicExp.set(2035, 3, 15);

        Calendar c3_LicExp = Calendar.getInstance();
        c3_LicExp.set(2033, 11, 22);

        Calendar c4_LicExp = Calendar.getInstance();
        c4_LicExp.set(2036, 5, 8);

        Calendar c5_LicExp = Calendar.getInstance();
        c5_LicExp.set(2034, 8, 30);

        Calendar c6_LicExp = Calendar.getInstance();
        c6_LicExp.set(2035, 0, 18);

        Calendar c7_LicExp = Calendar.getInstance();
        c7_LicExp.set(2033, 7, 12);

        Calendar c8_LicExp = Calendar.getInstance();
        c8_LicExp.set(2037, 2, 25);

        Calendar c9_LicExp = Calendar.getInstance();
        c9_LicExp.set(2034, 10, 5);

        Calendar c10_LicExp = Calendar.getInstance();
        c10_LicExp.set(2036, 9, 14);

        Customer c1 = new Customer(1, "Dustin Dwayne Diaz", 'M',
                c1_dob.getTime(), "100 West Street", "0225400799",
                240005609, LicenseType.RESTRICTED, c1_LicExp.getTime());
        Customer c2 = new Customer(2, "Justin Grumal", 'M',
                c2_dob.getTime(), "21 Savage Street", "0221230056",
                240000123, LicenseType.LEARNER, c2_LicExp.getTime());
        Customer c3 = new Customer(3, "Lois Dara Sanglao", 'F',
                c3_dob.getTime(), "16 Victoria Neuman", "01177341",
                240000123, LicenseType.FULL, c3_LicExp.getTime());
        Customer c4 = new Customer(4, "Sophia Maria Rodriguez", 'F',
                c4_dob.getTime(), "456 Oak Avenue", "0225887766",
                240008765, LicenseType.FULL, c4_LicExp.getTime());

        Customer c5 = new Customer(5, "Marcus James Chen", 'M',
                c5_dob.getTime(), "789 Pine Street", "0225334455",
                240009872, LicenseType.LEARNER, c5_LicExp.getTime());

        Customer c6 = new Customer(6, "Isabella Grace Williams", 'F',
                c6_dob.getTime(), "321 Elm Boulevard", "0225667788",
                240007543, LicenseType.RESTRICTED, c6_LicExp.getTime());

        Customer c7 = new Customer(7, "Ethan Michael Thompson", 'M',
                c7_dob.getTime(), "654 Maple Road", "0225112233",
                240006789, LicenseType.RESTRICTED, c7_LicExp.getTime());

        Customer c8 = new Customer(8, "Olivia Rose Martinez", 'F',
                c8_dob.getTime(), "987 Cedar Lane", "0225998877",
                240004321, LicenseType.LEARNER, c8_LicExp.getTime());

        Customer c9 = new Customer(9, "Alexander David Kim", 'M',
                c9_dob.getTime(), "147 Birch Street", "0225443322",
                240005678, LicenseType.FULL, c9_LicExp.getTime());

        Customer c10 = new Customer(10, "Emma Catherine Johnson", 'F',
                c10_dob.getTime(), "258 Walnut Avenue", "0225776655",
                240003456, LicenseType.RESTRICTED, c10_LicExp.getTime());

        CustomerList.add(c1);
        CustomerList.add(c2);
        CustomerList.add(c3);
        CustomerList.add(c4);
        CustomerList.add(c5);
        CustomerList.add(c6);
        CustomerList.add(c7);
        CustomerList.add(c8);
        CustomerList.add(c9);
        CustomerList.add(c10);

        Calendar e1_dob = Calendar.getInstance();
        e1_dob.set(2005, 10, 26);
        Employee e1 = new Employee(1, "John Doe", 'M', e1_dob.getTime(), "21 Mexico Court", "0328845566", "102", Role.MANAGER, "admin25", "password12345678");

        Calendar e2_dob = Calendar.getInstance();
        e2_dob.set(1990, 5, 15);
        Employee e2 = new Employee(2, "Sarah Elizabeth Wilson", 'F', e2_dob.getTime(), "123 Main Street", "0328776655", "105", Role.SALES, "swilson90", "sarahPass123");

        Calendar e3_dob = Calendar.getInstance();
        e3_dob.set(1988, 2, 8);
        Employee e3 = new Employee(3, "Michael Robert Johnson", 'M', e3_dob.getTime(), "456 Park Avenue", "0328665544", "108", Role.SALES, "mjohnson88", "mikeTech888");

        Calendar e4_dob = Calendar.getInstance();
        e4_dob.set(1995, 8, 22);
        Employee e4 = new Employee(4, "Jennifer Lynn Davis", 'F', e4_dob.getTime(), "789 Oak Lane", "0328554433", "112", Role.SALES, "jdavis95", "jennyCS95");

        Calendar e5_dob = Calendar.getInstance();
        e5_dob.set(1992, 11, 30);
        Employee e5 = new Employee(5, "David Christopher Brown", 'M', e5_dob.getTime(), "321 Elm Street", "0328443322", "115", Role.DESKFRONT, "dbrown92", "davidFinance92");

        Calendar e6_dob = Calendar.getInstance();
        e6_dob.set(1985, 4, 18);
        Employee e6 = new Employee(6, "Lisa Marie Garcia", 'F', e6_dob.getTime(), "654 Pine Road", "0328332211", "118", Role.MANAGER, "lgarcia85", "lisaHR8585");

        Calendar e7_dob = Calendar.getInstance();
        e7_dob.set(1998, 0, 12);
        Employee e7 = new Employee(7, "Kevin James Miller", 'M', e7_dob.getTime(), "987 Maple Drive", "0328221100", "120", Role.SALES, "kmiller98", "kevinMkt98");

        Calendar e8_dob = Calendar.getInstance();
        e8_dob.set(1993, 7, 25);
        Employee e8 = new Employee(8, "Amanda Nicole Taylor", 'F', e8_dob.getTime(), "147 Cedar Avenue", "0328110099", "125", Role.SALES, "ataylor93", "amandaOps93");

        Calendar e9_dob = Calendar.getInstance();
        e9_dob.set(1987, 9, 3);
        Employee e9 = new Employee(9, "Robert William Anderson", 'M', e9_dob.getTime(), "258 Birch Boulevard", "0328009988", "130", Role.MANAGER, "randerson87", "robDev8787");

        Calendar e10_dob = Calendar.getInstance();
        e10_dob.set(2000, 1, 14);
        Employee e10 = new Employee(10, "Emily Grace Thomas", 'F', e10_dob.getTime(), "369 Walnut Court", "0328998877", "135", Role.DESKFRONT, "ethomas00", "emilyGrace00");
        
        EmployeeList.add(e1);
        EmployeeList.add(e2);
        EmployeeList.add(e3);
        EmployeeList.add(e4);
        EmployeeList.add(e5);
        EmployeeList.add(e6);
        EmployeeList.add(e7);
        EmployeeList.add(e8);
        EmployeeList.add(e9);
        EmployeeList.add(e10);
        
        Calendar rentDate1 = Calendar.getInstance();
        rentDate1.set(2025, 10, 7);
        Calendar rentDate2 = Calendar.getInstance();
        rentDate2.set(2025, 10, 11);
        Calendar rentDate3 = Calendar.getInstance();
        rentDate3.set(2025, 10, 12);
        Calendar rentDate4 = Calendar.getInstance();
        rentDate4.set(2025, 10, 14);
        RentedCar rentcar1 = new RentedCar(c3, "Toyota Machete", rentDate1.getTime());
        RentedCar rentcar2 = new RentedCar(c4, "Ford Medina", rentDate2.getTime());
        RentedCar rentcar3 = new RentedCar(c7, "Toyota Ranger", rentDate3.getTime());
        RentedCar rentcar4 = new RentedCar(c10, "BMW Sedan", rentDate4.getTime());
        CarRentedList.add(rentcar1);
        CarRentedList.add(rentcar2);
        CarRentedList.add(rentcar3);
        CarRentedList.add(rentcar4);
    }
    
}
