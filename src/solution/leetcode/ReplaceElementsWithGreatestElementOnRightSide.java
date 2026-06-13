package solution.leetcode;

import java.util.Arrays;

public class ReplaceElementsWithGreatestElementOnRightSide {
    public static void main(String[] args) {
        ReplaceElementsWithGreatestElementOnRightSide obj = new ReplaceElementsWithGreatestElementOnRightSide();
        System.out.println(Arrays.toString(obj.replaceElements(new int[]{17,18,5,4,6,1})));
        System.out.println(Arrays.toString(obj.replaceElements(new int[]{100})));
    }
    public int[] replaceElements(int[] arr) {
        int [] result = new int[arr.length];
        int max = -1;
        for(int i = arr.length-1; i>=0; i--){
            result[i] = max;
            max = Math.max(max, arr[i]);
        }
        return result;
    }
}
