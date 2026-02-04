package solution.leetcode.quest.maths;

import java.util.Arrays;

public class CanMakeArithmeticProgressionFromSequence {
    public static void main(String[] args) {
        CanMakeArithmeticProgressionFromSequence obj = new CanMakeArithmeticProgressionFromSequence();
        System.out.println(obj.canMakeArithmeticProgression(new int[]{3,5,1}));//true
        System.out.println(obj.canMakeArithmeticProgression(new int[]{1,2,4}));//false
    }
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int diff = arr[1] - arr[0];
        for(int i = 2; i<arr.length; i++){
            if(arr[i]-arr[i-1]!=diff) return false;
        }
        return true;
    }
}
