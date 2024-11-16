package Entity;

import java.util.Date;
import java.util.List;

public class Owner extends Person {
    private List<Property> property;
    private List<Host> host;

    public Owner(String ID, String fullname, Date birthDay, String email, String phoneNumber,
                 List<RentalAgreement> rentalAgreement, List<Property> property,
                 List<Host> host) {
        super(ID, fullname, birthDay, email, phoneNumber, rentalAgreement);
        this.property = property;
        this.host = host;
    }

    // Getters and Setters
    public List<Host> getHost() {
        return host;
    }

    public void setHost(List<Host> host) {
        this.host = host;
    }

    public List<RentalAgreement> getRentalAgreement() {
        return rentalAgreement;
    }

    public void setRentalAgreement(List<RentalAgreement> rentalAgreement) {
        this.rentalAgreement = rentalAgreement;
    }

    public List<Property> getProperty() {
        return property;
    }

    public void setProperty(List<Property> property) {
        this.property = property;
    }

    @Override
    public String toString() {
        return  "---------------\n" +
                "ID: " + ID + "\n" +
                "Full Name: " + fullname + "\n" +
                "Birth Date: " + birthDay + "\n" +
                "Email: " + email + "\n" +
                "Phone Number: " + phoneNumber + "\n";
    }
}