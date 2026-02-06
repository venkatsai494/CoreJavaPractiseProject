package solution.leetcode;

public class DayOfTheYear {
    public static void main(String[] args) {
        DayOfTheYear d = new DayOfTheYear();
        System.out.println(d.dayOfYear("2019-01-09"));
        System.out.println(d.dayOfYear("2019-02-10"));
        System.out.println(d.dayOfYear("2003-03-01"));
        System.out.println(d.dayOfYear("2004-03-01"));
    }
    public int dayOfYear(String date) {
        String[] dateArr = date.split("-");
        int year = Integer.parseInt(dateArr[0]);
        int month = Integer.parseInt(dateArr[1]);
        int day = Integer.parseInt(dateArr[2]);
        int sum = 0;
        boolean leapYear = (year%4==0) && ((year%100!=0)||(year%400==0));
        int [] daysAsPerMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for(int i =0; i<month-1; i++){
            sum = sum + daysAsPerMonth[i];
        }
        sum = sum + day;
        if(leapYear && month>2){
            sum++;
        }
        return sum;
    }
}
