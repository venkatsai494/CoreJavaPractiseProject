package com.venkat.assessment.egen.level1;

import java.util.ArrayList;
import java.util.List;

public class Account {

    private String accName;
    private long accNumber = 10000;
    private double accBalance;

    private String accEmail;

    private long accPhoneNumber;

    private List<Transaction> transactionList;


    public Account(String accName, String accEmail, long accPhoneNumber, double accBalance) {
        this.setAccName(accName);
        this.setAccEmail(accEmail);
        this.setAccPhoneNumber(accPhoneNumber);
        this.accNumber = AccountNumberGenerator.generateAccountNumber();
        setAccBalance(accBalance);
        this.transactionList = new ArrayList<>();
    }

    private void setAccName(String accName) {
        try {
            if (accName.chars().allMatch(ch->Character.isAlphabetic(ch)))
                this.accName = accName;
            else
                throw new RuntimeException("Enter valid account name");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void setAccEmail(String accEmail) {
        try {
            if (accEmail.contains("@") && accEmail.contains(".com"))
                this.accEmail = accEmail;
            else
                throw new RuntimeException("Enter valid email id");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void setAccPhoneNumber(long accPhoneNumber) {
        try {
            if (accPhoneNumber > 6000000000L && accPhoneNumber < 9999999999L)
                this.accPhoneNumber = accPhoneNumber;
            else
                throw new RuntimeException("Enter valid phone number");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getAccName() {
        return accName;
    }

    public String getAccEmail() {
        return accEmail;
    }

    public long getAccPhoneNumber() {
        return accPhoneNumber;
    }

    //Not using the below method as
//    private void setAccNumber(long accNumber) {
//        this.accNumber = accNumber;
//    }

    public long getAccNumber() {
        return accNumber;
    }

    public double getAccBalance() {
        return accBalance;
    }

    private void setAccBalance(double accBalance) {
        this.accBalance = accBalance;
    }

    public List<Transaction> getTransactionList() {
        return transactionList;
    }

    public void setTransactionList(List<Transaction> transactionList) {
        this.transactionList = transactionList;
    }

    public void deposit(double amount) {
        this.accBalance = this.accBalance + amount;
        transactionList.add(new Transaction("Deposit", amount));
        System.out.println(amount + " successfully deposited and the new balance is "+ this.accBalance);
    }

    public void withdraw(double amount) {
        try{
            if(accBalance>=amount) {
                this.accBalance = this.accBalance - amount;
                transactionList.add(new Transaction("Withdraw", amount));
                System.out.println(amount + " successfully withdraw and the new balance is "+ this.accBalance);
            }
            else
                throw new RuntimeException("Low Balance");
        }
        catch (RuntimeException re)
        {
            re.printStackTrace();
        }
    }

    public long totalTransactionValue(){
        long total = 0L;
        List<Transaction> tr = this.transactionList;
        for(Transaction t: tr){
            total = total + (long)t.getAmount();
        }
        return total;
    }


}
