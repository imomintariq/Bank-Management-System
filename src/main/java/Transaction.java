import java.util.*;
public class Transaction {
    private Date date;
    private String transactionType;
    private double transactionAmount;
    private double transactionFee;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public double getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(double transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public double getTransactionFee() {
        return transactionFee;
    }

    public void setTransactionFee(double transactionFee) {
        this.transactionFee = transactionFee;
    }

    public Transaction() {
        date = new Date();
        transactionAmount = 0;
        transactionType ="";
        transactionFee = 0;
    }

    public Transaction(String transactionType, double transactionAmount) {
        this.date = new Date();
        this.transactionType = transactionType;
        this.transactionAmount = transactionAmount;
        this.transactionFee = 0;
    }
}
