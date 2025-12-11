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
public class Customer extends Person {
    private int licenseNumber;
    private LicenseType licenseType;
    private Date licenseExpiryDate;

    public Customer(int personID, String name, char gender, Date dateOfBirth, String address, String telNumber, int licenseNumber, LicenseType licenseType, Date licenseExpiryDate) {
        super(personID, name, gender, dateOfBirth, address, telNumber);
        this.licenseNumber = licenseNumber;
        this.licenseType = licenseType;
        this.licenseExpiryDate = licenseExpiryDate;
        this.CUSTOMER = true;
    }

    public int getLicenseNumber() {
        return this.licenseNumber;
    }

    public void setLicenseNumber(int licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public LicenseType getLicenseType() {
        return this.licenseType;
    }

    public void setLicenseType(LicenseType licenseType) {
        this.licenseType = licenseType;
    }

    public Date getLicenseExpiryDate() {
        return licenseExpiryDate;
    }

    public void setLicenseExpiryDate(Date licenseExpiryDate) {
        this.licenseExpiryDate = licenseExpiryDate;
    }
    
    @Override
    public void showDetails() {
        System.out.print("Customer Details:");
        System.out.printf("ID: %d\n", this.personID);
        System.out.printf("Name: %s\n", this.name);
        System.out.printf("Gender: %c\n", this.gender);
        System.out.printf("Date of Birth: %s\n", this.dateOfBirth);
        System.out.printf("Address: %s\n", this.address);
        System.out.printf("Telephone Number: %s\n", this.telNumber);
        
        System.out.printf("License Number: %d\n", this.licenseNumber);
        System.out.printf("License Type: %s\n", this.licenseType);
        System.out.printf("License Date: %s\n", this.licenseExpiryDate);
    }
}
