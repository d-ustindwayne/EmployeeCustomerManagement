/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employeecustomermanagement;
import java.util.Date;

/**
 *
 * @author nepom
 */
abstract public class Person {
    protected int personID;
    protected String name;
    protected char gender;
    protected Date dateOfBirth;
    protected String address;
    protected String telNumber;
    protected boolean CUSTOMER;
    protected boolean EMPLOYEE;

    public Person(int personID, String name, char gender, Date dateOfBirth, String address, String telNumber) {
        this.personID = personID;
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.telNumber = telNumber;
    }

    public int getPersonID() {
        return this.personID;
    }

    public void setPersonID(int personID) {
        this.personID = personID;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        if (this.gender == 'M') {return "Male";}
        else if (this.gender == 'F') {return "Female";}
        else {return "Other";}
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public Date getDateOfBirth() {
        return this.dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelNumber() {
        return this.telNumber;
    }

    public void setTelNumber(String telNumber) {
        this.telNumber = telNumber;
    }
    
    abstract protected void showDetails();
}