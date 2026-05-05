package solution.leetcode;

import java.util.Arrays;

public class CountLargestGroup {
    public static void main(String[] args) {
        CountLargestGroup solution = new CountLargestGroup();
        System.out.println(solution.countLargestGroup(13)); // Output: 4
        System.out.println(solution.countLargestGroup(2)); // Output: 2
        System.out.println(solution.countLargestGroup(15)); // Output: 6
        System.out.println(solution.countLargestGroup(24)); // Output: 5
    }
    public int countLargestGroup(int n) {
        int [] totalSum = new int[37];
        for(int i = 1; i<=n; i++){
            totalSum[sumOfDigitsOfNumber(i)]++;
        }
        int max =  Arrays.stream(totalSum).max().getAsInt();
        int count = 0;
        for(int i: totalSum){
            if(max==i) count++;
        }
        return count;
    }
    public int sumOfDigitsOfNumber(int n){
        int sum = 0;
        while(n>0){
            sum = sum + n%10;
            n = n/10;
        }
        return sum;
    }

}
