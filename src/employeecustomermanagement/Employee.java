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
public class Employee extends Person {
    private String phoneExt;
    private Role role;
    private String username;
    private String password;

    public Employee(int personID, String name, char gender, Date dateOfBirth, String address, String telNumber, String phoneExt, Role role, String username, String password) {
        super(personID, name, gender, dateOfBirth, address, telNumber);
        this.phoneExt = phoneExt;
        this.role = role;
        this.username = username;
        this.password = password;
        this.EMPLOYEE = true;
    }

    public String getPhoneExt() {
        return phoneExt;
    }

    public void setPhoneExt(String phoneExt) {
        this.phoneExt = phoneExt;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    @Override
    public void showDetails() {
        System.out.println("Employee Details:");
        System.out.print("Customer Details:");
        System.out.printf("ID: %d\n", this.personID);
        System.out.printf("Name: %s\n", this.name);
        System.out.printf("Gender: %c\n", this.gender);
        System.out.printf("Date of Birth: %s\n", this.dateOfBirth);
        System.out.printf("Address: %s\n", this.address);
        System.out.printf("Telephone Number: %s\n", this.telNumber);
        
        System.out.printf("Telephone Number: %s\n", this.phoneExt);
        System.out.printf("Role: %s\n", this.role);
    }
}
