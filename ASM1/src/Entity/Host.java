package Entity;

import java.util.Date;
import java.util.List;

public class Host extends Person {
    private List<Property> property;
    private List<Owner> owner;

    public Host(String ID, String fullname, Date birthDay, String email, String phoneNumber,
                List<RentalAgreement> rentalAgreement, List<Property> property,
                List<Owner> owner) {
        super(ID, fullname, birthDay, email, phoneNumber,rentalAgreement);
        this.rentalAgreement = rentalAgreement;
        this.property = property;
        this.owner = owner;
    }

    // Getters and Setters
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

    public List<Owner> getOwner() {
        return owner;
    }

    public void setOwner(List<Owner> owner) {
        this.owner = owner;
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


