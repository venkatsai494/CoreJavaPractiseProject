package com.venkat.assessment.egen.level1;

public class Demolevel1 {

    public static void main(String[] args) {
        Account a1 = new Account("Venkat", "venkat@test.com", 9863356787L, 23.0);
        System.out.println("Hi "+a1.getAccName()+", your account with account number "+a1.getAccNumber()+" is generated and your account is credit with balance "+a1.getAccBalance()+" Please open your netbanking account the details of which are sent to your email id "+a1.getAccEmail()+" and in case of any conerns please send an SMS 'HELP' to 180012341234 from your registered mobile number "+a1.getAccPhoneNumber());
        a1.deposit(20.0);
        a1.withdraw(40.0);
        a1.deposit(100.0);
        a1.deposit(200.0);
        a1.withdraw(200.0);
        System.out.println(a1.totalTransactionValue());
    }
}
