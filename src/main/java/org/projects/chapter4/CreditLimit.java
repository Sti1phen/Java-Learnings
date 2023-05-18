package main.java.org.projects.chapter4;
public class CreditLimit {
    private int accountNumber;
    private int balance;
    private int totalCharge;
    private int totalCredit;
    private int allowedCreditLimit;

    public CreditLimit(int accountNumber, int balance, int totalCredit, int totalCharge, int allowedCreditLimit) {
        if (accountNumber > 0)
            this.accountNumber = accountNumber;
        if (balance > 0)
            this.balance = balance;
        if (totalCredit > 0)
            this.totalCredit = totalCredit;
        if (totalCharge > 0)
            this.totalCharge = totalCharge;
        if (allowedCreditLimit > 0)
            this.allowedCreditLimit = allowedCreditLimit;
    }

    public void setAccountNumber(int accountNumber) {
        if (accountNumber > 0)
            this.accountNumber = accountNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAllowedCreditLimit(int allowedCreditLimit) {
        if (allowedCreditLimit > 0)
            this.allowedCreditLimit = allowedCreditLimit;
    }

    public int getAllowedCreditLimit() {

        return allowedCreditLimit;
    }

    public void setBalance(int balance) {
        if (balance > 0)
            this.balance = balance;
    }

    public int getBalance() {
        balance = balance + totalCharge - totalCredit;
        if (balance > 0)
            this.balance = balance;
        return balance;
    }

    public void setTotalCharge(int totalCharge) {
        if (totalCharge > 0)
            this.totalCharge = totalCharge;
    }

    public int getTotalCharge() {

        return totalCharge;
    }

    public void setTotalCredit(int totalCredit) {
        if (totalCredit > 0)
            this.totalCredit = totalCredit;
    }

    public int getTotalCredit() {

        return totalCredit;
    }
}
