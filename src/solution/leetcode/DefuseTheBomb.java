package solution.leetcode;

import java.util.Arrays;

public class DefuseTheBomb {
    public static void main(String[] args) {
        DefuseTheBomb dtb = new DefuseTheBomb();
        System.out.println(Arrays.toString(dtb.decrypt(new int[]{5, 7, 1, 4}, 3)));
        System.out.println(Arrays.toString(dtb.decrypt(new int[]{1,2,3,4}, 0)));
        System.out.println(Arrays.toString(dtb.decrypt(new int[]{2,4,9,3}, -2)));
    }
    public int[] decrypt(int[] code, int k) {
        int [] output = new int[code.length];
        for(int i = 0; i<code.length; i++){
            int sum = 0;
            int temp = k;
            while(temp!=0){
                int j = i+temp;
                if(j>=code.length)   j = j - code.length;
                if(j<0) j = code.length + j;
                sum = sum + code[j];
                if(temp>0) temp--;
                else if(temp<0) temp++;
            }
            output[i] = sum;
        }
        return output;
    }
}
