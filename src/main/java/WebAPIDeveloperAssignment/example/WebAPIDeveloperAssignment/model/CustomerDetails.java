package WebAPIDeveloperAssignment.example.WebAPIDeveloperAssignment.model;

import java.time.LocalDate;

//This class model will hold the customerdetails
public class CustomerDetails {
    private String customerID;
    private double amount;
    private LocalDate date;

    public CustomerDetails(String customerID, double amount, LocalDate date) {
        this.customerID = customerID;
        this.amount = amount;
        this.date = date;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Transaction { \n" +
               "ID = "+ customerID + "\n" +
               ", amount = " + amount + "\n" +
               ", date = " + date + "\n" +
               '}';
    }
}
