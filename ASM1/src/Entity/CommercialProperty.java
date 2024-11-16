package Entity;

import java.util.List;

public class CommercialProperty extends Property {
    private String businessType;
    private float parkingSpaces;
    private float squareFootage;
    private String securityFeaturesAvail;

    public CommercialProperty(String propertyID, String address, float pricing, String propertyStatus,
                              Owner owner, List<Host> host, int maxCapacity, int floorNums,
                              String businessType, float parkingSpaces, float squareFootage, String securityFeaturesAvail) {
        super(propertyID, address, pricing, propertyStatus, owner, host, maxCapacity, floorNums);
        this.businessType = businessType;
        this.parkingSpaces = parkingSpaces;
        this.squareFootage = squareFootage;
        this.securityFeaturesAvail = securityFeaturesAvail;
    }

    public String toString() {
        return  "---------------------------------\n" +
                "Address: " + address + "\n" +
                "Pricing: $" + pricing + "\n" +
                "Status: " + propertyStatus + "\n" +
                "Owner: " + (owner != null ? owner.getFullname() : "N/A") + "\n" +
                "Business Type: " + businessType + "\n" +
                "Square Footage: " + squareFootage + " sq ft\n" +
                "Parking Spaces: " + parkingSpaces + "\n" +
                "Security Features: " + securityFeaturesAvail + "\n";
    }
}

