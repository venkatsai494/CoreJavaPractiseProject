package com.enums;

public enum DayEnum {

    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}

class Demo3{
    public static void main(String[] args) {
        System.out.println(DayEnum.SATURDAY);// point to be noted when you directly call DayEnum.Saturday it is not the string value Satuday return instead an object of type DayEnum is returned and java then implicitly uses .toString() method in sout statement.
    }
}