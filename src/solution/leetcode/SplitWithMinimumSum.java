package solution.leetcode;

import java.util.Arrays;

public class SplitWithMinimumSum {
    public static void main(String[] args) {
        SplitWithMinimumSum solution = new SplitWithMinimumSum();
        System.out.println(solution.splitNum(4325)); // 59
        System.out.println(solution.splitNum(687)); // 75
    }
    public int splitNum(int num) {
        int l = String.valueOf(num).length();
        int [] arr = new int[l];
        int i = 0;
        while(num>0){
            arr[i] = num%10;
            num = num/10;
            i++;
        }
        Arrays.sort(arr);
        int num1 = 0;
        int num2 = 0;
        for(int j = 0; j<arr.length; j=j+2){
            num1 = (num1*10) + arr[j];
        }
        for(int j = 1; j<arr.length; j=j+2){
            num2 = (num2*10) + arr[j];
        }
        return num1+num2;
    }
}
