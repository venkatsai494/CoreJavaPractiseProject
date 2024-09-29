package com.venkat.java.part.two;

public class WrapperClassConcept {

    //Wrapper classes are used for data conversion the available wrapper classes are Integer, Double and Boolean

    public static void main(String[] args) {
        String x = "100";//This will be treated as string
        System.out.println(x+20);//This will not add the numbers 100 and 20 instead it will concatenate

//		data conversion from String to Integer, double and boolean
        int i = Integer.parseInt(x);
        System.out.println(i+20);

        String y = "12.23";
        System.out.println(y+20);
        double j = Double.parseDouble(y);
        System.out.println(j+20);

        String z = "true";
        String z1 = "ture";//This value is not true but ture
        boolean k = Boolean.parseBoolean(z);
        boolean k1 = Boolean.parseBoolean(z1);//Hence here the value will become false
        System.out.println(k);
        System.out.println(k1);

        String l = String.valueOf(i);
        System.out.println(l+20);

        String a = "100B";
        int c = Integer.parseInt(a);//This will give a NumberFormatException
        System.out.println(c);

    }

}
