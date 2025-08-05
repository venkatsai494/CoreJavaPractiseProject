package solution.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DecompressRunLengthEncodedList {
    public static void main(String[] args) {
        DecompressRunLengthEncodedList drle = new DecompressRunLengthEncodedList();
        System.out.println(Arrays.toString(drle.decompressRLElist(new int[]{1, 2, 3, 4})));//[2,4,4,4]
        System.out.println(Arrays.toString(drle.decompressRLElist(new int[]{1,1,2,3})));//[1,3,3]
    }
    public int[] decompressRLElist(int[] nums) {
        List<Integer> resultList = new ArrayList<>();
        for(int i = 0; i<nums.length; i=i+2){
            int freq = nums[i];
            int num = nums[i+1];
            while(freq>0){
                resultList.add(num);
                freq--;
            }
        }
        int[] result = new int[resultList.size()];
        for(int i = 0; i<resultList.size(); i++){
            result[i] = resultList.get(i);
        }
        return result;
    }
}
