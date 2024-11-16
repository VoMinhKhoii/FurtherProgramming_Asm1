package Entity;

import java.util.Date;

public class Payment {
    private String paymentID;
    private Tenant tenant;
    private float amount;
    private Date paymentDate;
    private String paymentMethod;
    private String paymentStatus;

    public Payment(String paymentID, Tenant tenant, float amount, Date paymentDate, String paymentMethod, String paymentStatus) {
        this.paymentID = paymentID;
        this.tenant = tenant;
        this.amount = amount;
        this.paymentDate = paymentDate;
        this.paymentMethod = paymentMethod;
        this.paymentStatus = paymentStatus;
    }

    public String getPaymentID() {
        return paymentID;
    }

    public void setPaymentID(String paymentID) {
        this.paymentID = paymentID;
    }

    public Tenant getTenant() {
        return tenant;
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public String toString() {
        return  "-----------------\n" +
                "Tenant: " + (tenant != null ? tenant.getFullname() : "N/A") + "\n" +
                "Amount: $" + amount + "\n" +
                "Payment Date: " + paymentDate + "\n" +
                "Payment Method: " + paymentMethod + "\n" +
                "Payment Status: " + paymentStatus + "\n";
    }
}

