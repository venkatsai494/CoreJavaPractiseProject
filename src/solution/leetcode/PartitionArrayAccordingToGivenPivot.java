package solution.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PartitionArrayAccordingToGivenPivot {
    public static void main(String[] args) {
        PartitionArrayAccordingToGivenPivot partition = new PartitionArrayAccordingToGivenPivot();
        System.out.println(Arrays.toString(partition.pivotArray(new int[]{9,12,5,10,14,3,10}, 10)));
        System.out.println(Arrays.toString(partition.pivotArray(new int[]{-3,4,3,2}, 2)));

    }
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> tempList = new ArrayList<>();
        int [] result = new int[nums.length];
        for(int num: nums){
            if(num<pivot) tempList.add(num);
        }
        for(int num: nums){
            if(num==pivot) tempList.add(num);
        }
        for(int num: nums){
            if(num>pivot) tempList.add(num);
        }
        for(int i = 0; i<tempList.size(); i++){
            result[i] = tempList.get(i);
        }
        return result;
    }
}
