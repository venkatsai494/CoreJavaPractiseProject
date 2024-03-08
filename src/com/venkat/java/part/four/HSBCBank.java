package com.venkat.java.part.four;

public class HSBCBank implements USBank, BrazilBank{


    public void credit() {
        System.out.println("hsbc overridding from USBank ---- credit");
    }

    public void debit() {
        System.out.println("hsbc overridding from USBank ---- debit");
    }

    public void transferMoney() {
        System.out.println("hsbc overridding from USBank ---- transferMoney");
    }

    public void mutualFund() {
        System.out.println("hsbc overridding from BrazilBank ---- mutualFund");
    }

    public void educationLoan() {
        System.out.println("hsbc ----------- eduLoan");
    }

    public void carLoan() {
        System.out.println("hsbc------------ carLoan");
    }

}
