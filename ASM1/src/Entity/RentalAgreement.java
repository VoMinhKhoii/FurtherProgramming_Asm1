package Entity;

import java.util.Date;
import java.util.List;

public class RentalAgreement {
    private Owner owner;
    private Property propertyLeased;
    private List<Host> host;
    private Tenant mainTenant;
    private List<Tenant> subTenants;
    private Date contractDate;
    private String period;
    private float rentingFee;
    private String rentalStatus;

    public RentalAgreement(Owner owner, Property propertyLeased, List<Host> host, Tenant mainTenant,
                           List<Tenant> subTenants, Date contractDate, String period, float rentingFee, String rentalStatus) {
        this.owner = owner;
        this.propertyLeased = propertyLeased;
        this.host = host;
        this.mainTenant = mainTenant;
        this.subTenants = subTenants;
        this.contractDate = contractDate;
        this.period = period;
        this.rentingFee = rentingFee;
        this.rentalStatus = rentalStatus;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Property getPropertyLeased() {
        return propertyLeased;
    }

    public void setPropertyLeased(Property propertyLeased) {
        this.propertyLeased = propertyLeased;
    }

    public List<Host> getHost() {
        return host;
    }

    public void setHost(List<Host> host) {
        this.host = host;
    }

    public Tenant getMainTenant() {
        return mainTenant;
    }

    public void setMainTenant(Tenant mainTenant) {
        this.mainTenant = mainTenant;
    }

    public List<Tenant> getSubTenants() {
        return subTenants;
    }

    public void setSubTenants(List<Tenant> subTenants) {
        this.subTenants = subTenants;
    }

    public Date getContractDate() {
        return contractDate;
    }

    public void setContractDate(Date contractDate) {
        this.contractDate = contractDate;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public float getRentingFee() {
        return rentingFee;
    }

    public void setRentingFee(float rentingFee) {
        this.rentingFee = rentingFee;
    }

    public String getRentalStatus() {
        return rentalStatus;
    }

    public void setRentalStatus(String rentalStatus) {
        this.rentalStatus = rentalStatus;
    }

    public String toString() {
        return  "---------------------------\n" +
                "Owner: " + (owner != null ? owner.getFullname() : "N/A") + "\n" +
                "Property Leased: " + (propertyLeased != null ? propertyLeased.getAddress() : "N/A") + "\n" +
                "Main Tenant: " + (mainTenant != null ? mainTenant.getFullname() : "N/A") + "\n" +
                "Contract Date: " + contractDate + "\n" +
                "Period: " + period + "\n" +
                "Renting Fee: $" + rentingFee + "\n" +
                "Status: " + rentalStatus + "\n";
    }
}

