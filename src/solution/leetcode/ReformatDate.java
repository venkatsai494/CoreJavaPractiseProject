package solution.leetcode;

import java.util.HashMap;
import java.util.Map;

public class ReformatDate {
    public static void main(String[] args) {
        ReformatDate reformatDate = new ReformatDate();
        System.out.println(reformatDate.reformatDate("20th Oct 2052"));
        System.out.println(reformatDate.reformatDate("6th Jun 1933"));
        System.out.println(reformatDate.reformatDate("26th May 1960"));
    }
    public String reformatDate(String date) {
        StringBuilder sb = new StringBuilder();
        String[] arr = date.split(" ");
        Map<String, String> dateMap = new HashMap<>();
        dateMap.put("1st", "01");
        dateMap.put("2nd", "02");
        dateMap.put("3rd", "03");
        dateMap.put("4th", "04");
        dateMap.put("5th", "05");
        dateMap.put("6th", "06");
        dateMap.put("7th", "07");
        dateMap.put("8th", "08");
        dateMap.put("9th", "09");
        dateMap.put("10th", "10");
        dateMap.put("11th", "11");
        dateMap.put("12th", "12");
        dateMap.put("13th", "13");
        dateMap.put("14th", "14");
        dateMap.put("15th", "15");
        dateMap.put("16th", "16");
        dateMap.put("17th", "17");
        dateMap.put("18th", "18");
        dateMap.put("19th", "19");
        dateMap.put("20th", "20");
        dateMap.put("21st", "21");
        dateMap.put("22nd", "22");
        dateMap.put("23rd", "23");
        dateMap.put("24th", "24");
        dateMap.put("25th", "25");
        dateMap.put("26th", "26");
        dateMap.put("27th", "27");
        dateMap.put("28th", "28");
        dateMap.put("29th", "29");
        dateMap.put("30th", "30");
        dateMap.put("31st", "31");
        Map<String, String> monthMap = new HashMap<>();
        monthMap.put("Jan", "01");
        monthMap.put("Feb", "02");
        monthMap.put("Mar", "03");
        monthMap.put("Apr", "04");
        monthMap.put("May", "05");
        monthMap.put("Jun", "06");
        monthMap.put("Jul", "07");
        monthMap.put("Aug", "08");
        monthMap.put("Sep", "09");
        monthMap.put("Oct", "10");
        monthMap.put("Nov", "11");
        monthMap.put("Dec", "12");
        sb.append(arr[2]).append("-").append(monthMap.get(arr[1])).append("-").append(dateMap.get(arr[0]));
        return sb.toString();
    }
}
