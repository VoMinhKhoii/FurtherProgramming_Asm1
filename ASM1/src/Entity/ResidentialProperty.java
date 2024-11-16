package Entity;

import java.util.List;

public class ResidentialProperty extends Property {
    private int bedroomNums;
    private boolean gardenAvail;
    private boolean petFriendliness;
    private String parkingAvail;

    public ResidentialProperty(String propertyID, String address, float pricing, String propertyStatus,
                               Owner owner, List<Host> host, int maxCapacity, int floorNums,
                               int bedroomNums, boolean gardenAvail, boolean petFriendliness, String parkingAvail) {
        super(propertyID, address, pricing, propertyStatus, owner, host, maxCapacity, floorNums);
        this.bedroomNums = bedroomNums;
        this.gardenAvail = gardenAvail;
        this.petFriendliness = petFriendliness;
        this.parkingAvail = parkingAvail;
    }

    public String toString() {
        return  "--------------------------------\n" +
                "Address: " + address + "\n" +
                "Pricing: $" + pricing + "\n" +
                "Status: " + propertyStatus + "\n" +
                "Owner: " + (owner != null ? owner.getFullname() : "N/A") + "\n" +
                "Max Capacity: " + maxCapacity + " people\n" +
                "Number of Bedrooms: " + bedroomNums + "\n" +
                "Garden Available: " + (gardenAvail ? "Yes" : "No") + "\n" +
                "Pet Friendly: " + (petFriendliness ? "Yes" : "No") + "\n" +
                "Parking: " + parkingAvail + "\n";
    }
}

