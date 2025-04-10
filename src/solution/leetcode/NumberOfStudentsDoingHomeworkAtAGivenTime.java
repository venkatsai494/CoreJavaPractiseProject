package solution.leetcode;

public class NumberOfStudentsDoingHomeworkAtAGivenTime {
    public static void main(String[] args) {
        NumberOfStudentsDoingHomeworkAtAGivenTime ns = new NumberOfStudentsDoingHomeworkAtAGivenTime();
        int[] startTime = {1, 2, 3};
        int[] endTime = {3, 2, 7};
        int queryTime = 4;
        System.out.println(ns.busyStudent(startTime, endTime, queryTime));
    }
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int output = 0;
        for(int i = 0; i<startTime.length; i++){
            if(startTime[i]<=queryTime && endTime[i]>=queryTime)    output++;
        }
        return output;
    }
}
