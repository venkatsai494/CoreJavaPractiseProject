package com.venkat.assessment.egen.level1;

public class AccountNumberGenerator {

    private static long newAccNumber = 10000;

    public static synchronized long generateAccountNumber(){
        return ++newAccNumber;
    }

}
