package Entity;

import java.util.Date;
import java.util.List;

public abstract class Person {
    protected String ID;
    protected String fullname;
    protected Date birthDay;
    protected String email;
    protected String phoneNumber;
    protected List<RentalAgreement> rentalAgreement;

    public Person(String ID, String fullname, Date birthDay, String email, String phoneNumber, List<RentalAgreement> rentalAgreement) {
        this.ID = ID;
        this.fullname = fullname;
        this.birthDay = birthDay;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.rentalAgreement = rentalAgreement;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public abstract String toString();
}

