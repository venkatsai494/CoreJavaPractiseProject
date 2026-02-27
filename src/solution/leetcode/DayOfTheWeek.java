package solution.leetcode;

public class DayOfTheWeek {
    public static void main(String[] args) {
        DayOfTheWeek dayOfTheWeek = new DayOfTheWeek();
        System.out.println(dayOfTheWeek.dayOfTheWeek(1, 1, 1971));
        System.out.println(dayOfTheWeek.dayOfTheWeek(31, 8, 2019));
        System.out.println(dayOfTheWeek.dayOfTheWeek(18, 7, 1999));
        System.out.println(dayOfTheWeek.dayOfTheWeek(15, 8, 1993));
    }
    public String dayOfTheWeek(int day, int month, int year) {
        int extraDays = 0;
        for(int i = 1971; i<year; i++){
            if((i%4==0) && ((i%100!=0)||(i%400==0))){
                extraDays += 2;
            }
            else{
                extraDays++;
            }
        }
        int [] daysAsPerMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for(int i =0; i<month-1; i++){
            extraDays = extraDays + daysAsPerMonth[i];
        }
        if(((year%4==0) && ((year%100!=0)||(year%400==0))) && (month>2)){
            extraDays++;
        }
        extraDays = extraDays + day - 1;
        String [] daysOfWeek = {"Friday", "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday"};
        return daysOfWeek[extraDays%7];
    }
}
