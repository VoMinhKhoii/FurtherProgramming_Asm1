package Entity;

import java.util.Date;
import java.util.List;

public class Tenant extends Person {
    private List<Payment> payment;
    private List<Property> property;

    public Tenant(String ID, String fullname, Date birthDay, String email, String phoneNumber,
                  List<RentalAgreement> rentalAgreement, List<Payment> payment, List<Property> property) {
        super(ID, fullname, birthDay, email, phoneNumber, rentalAgreement);
        this.rentalAgreement = rentalAgreement;
        this.payment = payment;
        this.property = property;
    }

    public List<RentalAgreement> getRentalAgreement() {
        return rentalAgreement;
    }

    public void setRentalAgreement(List<RentalAgreement> rentalAgreement) {
        this.rentalAgreement = rentalAgreement;
    }

    public List<Payment> getPayment() {
        return payment;
    }

    public void setPayment(List<Payment> payment) {
        this.payment = payment;
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

