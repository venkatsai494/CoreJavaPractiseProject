package com.venkat.utility;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import java.util.Set;
import java.util.TreeSet;


public class Sorter {



    public static void main(String[] args) throws ParseException {

        ArrayList<String> data4 = new ArrayList<String>();

        data4.add("08/17/1992");
        data4.add("08/17/1993");
        data4.add("08/17/1994");
        data4.add("08/17/1995");
        data4.add("08/17/1996");
        data4.add("08/17/1997");

        ArrayList<String> data2 = new ArrayList<String>();

        data2.add("aam");
        data2.add("baam");
        data2.add("kaam");
        data2.add("vaam");
        data2.add("yaam");
        data2.add("zaam");

        ArrayList<String> data3 = new ArrayList<String>();

        data3.add("Ahd");
        data3.add("Bangaloore");
        data3.add("Calicut");
        data3.add("Delhi");
        data3.add("Farida, Bad");
        data3.add("Gaziabad");


        ArrayList<Date> data1 = new ArrayList<Date>();

        DateFormat dateFormatter = new SimpleDateFormat("dd/MM/yyyy");

        try {
            data1.add(dateFormatter.parse("08/17/1991"));
            data1.add(dateFormatter.parse("08/17/1992"));
            data1.add(dateFormatter.parse("08/17/1993"));
            data1.add(dateFormatter.parse("08/17/1994"));
            data1.add(dateFormatter.parse("08/17/1995"));
            data1.add(dateFormatter.parse("08/17/1996"));
            data1.add(dateFormatter.parse("08/17/1997"));

        } catch (ParseException ex) {
            System.err.print(ex);
        }

        System.out.println("Before sorting: " + data1);

        List<Date> tempdata = data1;

        Collections.sort(data1);

        System.out.println("After sorting: " + data1);

        if(tempdata==data1) {
            System.out.println("sorted properly");
        }


        List<String> list = new ArrayList<String>(5);

        list.add("Venkat");
        list.add("Sai");
        list.add("Ratan");
        list.add("Kumar");
        list.add("Parpelli");

        ArrayList<String> collectedData = new ArrayList<>();

        for(String we: list) {
            collectedData.add(we);
        }

        ArrayList<String> sortedData = new ArrayList<>();
        for(String s1 : collectedData) {
            sortedData.add(s1);
        }

        Collections.sort(list);
//		Collections.reverse(list);
        for(String str:list) {
            System.out.println(str);
        }



//
//		 String dateArray[]={
////		            "2019-01-02",
////		            "2019-01-02",
////		            "2019-01-02",
////		            "2019-01-02",
////		            "2019-01-01",
////		            "2018-05-05",
////		            "2020-04-03",
////		            "2020-02-01"
//		            "08/12/2021",
//		            "08/13/2021",
//		            "08/17/2021",
//		            "04/14/2020",
//		            "03/14/2020",
//		            "08/14/2020",
//		            "08/14/1990"
//		        };
//		        SimpleDateFormat f=new SimpleDateFormat("MM/dd/yyyy");//SimpleDateFormat("yyyy-MM-dd");
//
//		        Set<Long> s=new TreeSet<Long>();
//
//		        for(int i=0;i<dateArray.length;i++)
//		        {
//		            s.add(f.parse(dateArray[i]).getTime());
//		        }
//
//		        for(Long l:s)
//		        {
//		            System.out.println(f.format(l));
//		        }
//
//


//		List<String> datestring=new ArrayList<String>();
//		datestring.add("01/21/2013 @03:13 PM");
//		datestring.add("01/21/2013 @04:37 PM");
//		datestring.add("01/21/2013 @10:41 AM");
//		datestring.add("01/21/2013 @10:48 AM");
//		datestring.add("01/22/2013 @06:16 AM");
//		datestring.add("01/22/2013 @06:19 AM");
//		datestring.add("01/21/2013 @05:19 PM");
//		datestring.add("01/21/2013 @05:19 PM");
//
//
//
//		Collections.sort(datestring, new Comparator<String>() {
//	        DateFormat f = new SimpleDateFormat("MM/dd/yyyy '@'hh:mm a");
//	        public int compare(String o1, String o2) {
//	            try {
//	                return f.parse(o1).compareTo(f.parse(o2));
//	            } catch (ParseException e) {
//	                throw new IllegalArgumentException(e);
//	            }
//	        }
//	    });
//
//
//
//








    }

}

