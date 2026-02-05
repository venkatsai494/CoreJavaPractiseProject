package solution.leetcode;

import java.util.Arrays;

public class MaximumNumberOfBallsInABox {
    public static void main(String[] args) {
        MaximumNumberOfBallsInABox obj = new MaximumNumberOfBallsInABox();
        System.out.println(obj.countBalls(1, 10));//2
        System.out.println(obj.countBalls(5, 15));//2
        System.out.println(obj.countBalls(19, 28));//2
        System.out.println(obj.countBalls(11, 104));//9
    }
    public int countBalls(int lowLimit, int highLimit) {
        int len = String.valueOf(highLimit).length() * 9;
        int[] ballsArray = new int[len+1];
        for(int i = lowLimit; i<=highLimit; i++){
            ballsArray[sumOfDigits(i)-1]++;
        }
        Arrays.sort(ballsArray);
        return ballsArray[ballsArray.length-1];
    }
    public int sumOfDigits(int n){
        int sum = 0;
        while(n>0){
            sum = sum + n%10;
            n = n/10;
        }
        return sum;
    }
}
