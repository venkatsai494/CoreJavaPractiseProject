package solution.leetcode;

import java.util.Arrays;

public class DecodeXORedArray {
    public static void main(String[] args) {
        DecodeXORedArray decodeXORedArray = new DecodeXORedArray();
        System.out.println(Arrays.toString(decodeXORedArray.decode(new int[]{1,2,3}, 1)));
        System.out.println(Arrays.toString(decodeXORedArray.decode(new int[]{6,2,7,3}, 4)));
    }
    public int[] decode(int[] encoded, int first) {
        int[] result = new int[encoded.length+1];
        result[0] = first;
        for(int i=1;i<=encoded.length;i++){
            result[i] = result[i-1]^encoded[i-1];
        }
        return result;
    }
}
