package com.venkat.utility;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class SorterAgain {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        ArrayList<String> data1 = new ArrayList<String>();

        data1.add("aam");
        data1.add("baam");
        data1.add("kaam");
        data1.add("vaam");
        data1.add("yaam");
        data1.add("zaam");

        ArrayList<String> data4 = new ArrayList<String>();

        data4.add("08/17/1992");
        data4.add("08/17/1993");
        data4.add("08/17/1994");
        data4.add("08/17/1995");
        data4.add("08/17/1996");
        data4.add("08/17/1997");


        ArrayList<String> data3 = new ArrayList<String>();

        data3.add("Ahd");
        data3.add("Ahd aa");
        data3.add("Ahd aa hyderabad");
        data3.add("Bangaloore");
        data3.add("Calicut");
        data3.add("Delhi");
        data3.add("Farida, Bad");
        data3.add("Gaziabad");

        ArrayList<String> data2 = new ArrayList<String>();

        data2.add("08/17/1991");
        data2.add("08/17/1992");
        data2.add("08/17/1993");
        data2.add("08/17/1994");
        data2.add("08/17/1995");
        data2.add("08/17/1996");
        data2.add("08/17/1997");

        SorterAgain obj = new SorterAgain();

        obj.sorter("CityName", "Ascending");





    }


    public void sorter(String columnName, String sortType) {
        if(columnName.equalsIgnoreCase("Date")) {
            ArrayList<Date> td = new ArrayList<Date>();

            DateFormat dateFormatter = new SimpleDateFormat("dd/MM/yyyy");

            try {
                td.add(dateFormatter.parse("08/17/1991"));
                td.add(dateFormatter.parse("08/17/1992"));
                td.add(dateFormatter.parse("08/17/1993"));
                td.add(dateFormatter.parse("08/17/1994"));
                td.add(dateFormatter.parse("08/17/1995"));
                td.add(dateFormatter.parse("08/17/1996"));
                td.add(dateFormatter.parse("08/17/1997"));

            } catch (ParseException ex) {
                System.err.print(ex);
            }

            List<Date> tempData = td;
            Collections.sort(td);

            if(tempData==td) {
                System.out.println("Dates are sorted properly");
                System.out.println(tempData);
                System.out.println(td);
            }


        }

        else if(columnName.equalsIgnoreCase("CityName")){
            ArrayList<String> td1 = new ArrayList<String>();
            td1.add("Ahd  aaa hyd");
            td1.add("Ahd  aaa");
            td1.add("Ahd");
            td1.add("Bangaloore");
            td1.add("Delhi");
            td1.add("Calicut");
            td1.add("Farida, Bad");
            td1.add("Gaziabad");
            System.out.println(td1);

//			List<String> tempData1 = td1;
            Collections.sort(td1);
            System.out.println(td1);
            Collections.reverse(td1);
            System.out.println(td1);

//			System.out.println(tempData1);
            System.out.println(td1);

            int a =22;
            System.out.println(a);
            int b = a;
            a=50;
            System.out.println(b);
            System.out.println(a);

        }



    }


}
