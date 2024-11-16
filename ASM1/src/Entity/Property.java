package Entity;

import java.util.List;

public abstract class Property {
    protected String propertyID;
    protected String address;
    protected float pricing;
    protected String propertyStatus;
    protected Owner owner;
    protected List<Host> host;
    protected int maxCapacity;
    protected int floorNums;

    public Property(String propertyID, String address, float pricing, String propertyStatus,
                    Owner owner, List<Host> host, int maxCapacity, int floorNums) {
        this.propertyID = propertyID;
        this.address = address;
        this.pricing = pricing;
        this.propertyStatus = propertyStatus;
        this.owner = owner;
        this.host = host;
        this.maxCapacity = maxCapacity;
        this.floorNums = floorNums;
    }

    public String getAddress() {
        return address;
    }
}

