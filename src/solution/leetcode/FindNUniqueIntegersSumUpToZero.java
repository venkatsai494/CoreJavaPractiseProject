package solution.leetcode;

import java.util.Arrays;

public class FindNUniqueIntegersSumUpToZero {
    public static void main(String[] args) {
        FindNUniqueIntegersSumUpToZero fn = new FindNUniqueIntegersSumUpToZero();
        System.out.println(Arrays.toString(fn.sumZero(4)));
        System.out.println(Arrays.toString(fn.sumZero(5)));
        System.out.println(Arrays.toString(fn.sumZero(6)));

    }
    public int[] sumZero(int n) {
        int [] output = new int [n];
        int start = -n/2;
        for(int i = 0; i<n; i++){
            if(start == 0 && n%2==0){
                start++;
            }
            output[i] = start;
            start++;
        }
        return output;
    }
}
