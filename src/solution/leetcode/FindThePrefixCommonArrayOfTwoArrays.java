package solution.leetcode;

import java.util.Arrays;

public class FindThePrefixCommonArrayOfTwoArrays {
    public static void main(String[] args) {
        FindThePrefixCommonArrayOfTwoArrays fpca = new FindThePrefixCommonArrayOfTwoArrays();
        System.out.println(Arrays.toString(fpca.findThePrefixCommonArray(new int[]{1,3,2,4}, new int[]{3,1,2,4})));
        System.out.println(Arrays.toString(fpca.findThePrefixCommonArray(new int[]{2,3,1}, new int[]{3,1,2})));
    }
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int [] output = new int[A.length];
        for(int i = 0; i<A.length; i++){
            output[i] = countCommon(A, B, i);
        }
        return output;
    }
    public int countCommon(int[] a, int[] b, int i){
        int count = 0;
        for(int j = 0; j<=i; j++){
            for(int k = 0; k<=i; k++){
                if(a[j] == b[k]) count++;
            }
        }
        return count;
    }
}
