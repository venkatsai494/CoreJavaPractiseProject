package solution.leetcode;

public class EarliestTimeToFinishOneTask {
    public static void main(String[] args) {
        EarliestTimeToFinishOneTask obj = new EarliestTimeToFinishOneTask();
        System.out.println(obj.earliestTime(new int [][] {{1,6},{2,3}}));
        System.out.println(obj.earliestTime(new int [][] {{100,100},{100,100},{100,100}}));

    }
    public int earliestTime(int[][] tasks) {
        int earliestTime = timeAtEndOfTask(tasks[0]) ;
        for(int i = 1; i<tasks.length; i++){
            earliestTime = Math.min(earliestTime, timeAtEndOfTask(tasks[i]));
        }
        return earliestTime;
    }
    public int timeAtEndOfTask(int [] arr){
        int sum = 0;
        for(int a: arr){
            sum = sum + a;
        }
        return sum;
    }
}
