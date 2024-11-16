import Entity.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Creating sample data
        Date dateOfBirth = new Date(1990, 5, 15);  // Arbitrary DOB for test
        Date contractDate = new Date();  // Current date for rental agreement
        Date paymentDate = new Date();  // Current date for payment

        // Create an Owner
        Owner owner = new Owner("O001", "Vo Minh Khoi", dateOfBirth, "S3991730@rmit.edu.vn", "0792574704",
                new ArrayList<>(), new ArrayList<>(), new ArrayList<>());

        // Create a Host associated with this Owner
        Host host = new Host("H001", "Nhu Y", dateOfBirth, "jane@example.com", "1234567891L",
                new ArrayList<>(), new ArrayList<>(), List.of(owner));
        owner.getHost().add(host);  // Adding the host to the owner's host list

        // Create a Tenant
        Tenant tenant = new Tenant("T001", "Alice Johnson", dateOfBirth, "alice@example.com", "1234567892L",
                new ArrayList<>(), new ArrayList<>(), new ArrayList<>());

        // Create a ResidentialProperty
        ResidentialProperty residentialProperty = new ResidentialProperty(
                "RP001", "123 Main St", 1200.0f, "Available", owner, List.of(host), 4, 2, 3, true, true, "Garage"
        );

        // Create a CommercialProperty
        CommercialProperty commercialProperty = new CommercialProperty(
                "CP002", "456 Commerce Blvd", 5000.0f, "Available", owner, List.of(host), 50, 3,
                "Retail", 10, 1500.0f, "CCTV, Security Guard"
        );

        // Create a Payment
        Payment payment = new Payment("P001",tenant, 1200.0f, paymentDate, "Credit Card", "Completed");
        tenant.getPayment().add(payment);  // Adding payment to tenant's payment list

        // Create a RentalAgreement
        RentalAgreement rentalAgreement = new RentalAgreement(
                owner, residentialProperty, List.of(host), tenant, new ArrayList<>(),
                contractDate, "12 months", 1200.0f, "Active"
        );

        // Adding rental agreement to tenant, host, and owner
        tenant.getRentalAgreement().add(rentalAgreement);
        host.getRentalAgreement().add(rentalAgreement);
        owner.getRentalAgreement().add(rentalAgreement);

        // Print details to verify functionality
        System.out.println("OWNER DETAILS");
        System.out.println(owner);

        System.out.println("\nHOST DETAILS");
        System.out.println(host);

        System.out.println("\nTENANT DETAILS ");
        System.out.println(tenant);

        System.out.println("\nRESIDENTIAL PROPERTY DETAILS");
        System.out.println(residentialProperty);

        System.out.println("\nCOMMERCIAL PROPERTY DETAILS");
        System.out.println(commercialProperty);

        System.out.println("\nPAYMENT DETAILS: ");
        System.out.println(payment);

        System.out.println("\nRENTAL AGREEMENT DETAILS: ");
        System.out.println(rentalAgreement);

        // You can add more detailed print statements or assertions here as needed for further testing.
    }
}
