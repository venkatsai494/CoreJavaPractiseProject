package solution.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RearrangeArrayElementsBySign {
    public static void main(String[] args) {
        RearrangeArrayElementsBySign ra = new RearrangeArrayElementsBySign();
        System.out.println(Arrays.toString(ra.rearrangeArray(new int[]{3,1,-2,-5,2,-4})));// Output: 3 -2 1 -5 2 -4
        System.out.println(Arrays.toString(ra.rearrangeArray(new int[]{-1,1})));// Output: 1 -1
    }
    public int[] rearrangeArray(int[] nums) {
        int [] answer = new int[nums.length];
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();
        for(int i : nums){
            if(i>0) pos.add(i);
            else neg.add(i);
        }
        int i = 0;
        int temp = 0;
        while(i<answer.length){
            answer[i] = pos.get(temp);
            i++;
            answer[i] = neg.get(temp);
            temp++;
            i++;
        }
        return answer;
    }
}
