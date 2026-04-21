package solution.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArithmeticSubarrays {
    public static void main(String[] args) {
        ArithmeticSubarrays solution = new ArithmeticSubarrays();
        System.out.println(solution.checkArithmeticSubarrays(new int[]{4,6,5,9,3,7}, new int[]{0,0,2}, new int[]{2,3,5})); // [true,false,true]
        System.out.println(solution.checkArithmeticSubarrays(new int[]{-12,-9,-3,-12,-6,15,20,-25,-20,-15,-10}, new int[]{0,1,6,4,8,7}, new int[]{4,4,9,7,9,10})); // [false,true,false,false,true,true]
    }
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> res = new ArrayList<>();
        for(int i=0; i<l.length; i++){
            boolean flag = true;
            int lenghtOfArray = r[i]-l[i]+1;
            if(lenghtOfArray==2) res.add(true);
            else{
                int[] arr = new int[lenghtOfArray];
                System.arraycopy(nums, l[i], arr, 0, lenghtOfArray);
                Arrays.sort(arr);
                int diff = arr[1]-arr[0];
                for(int j=1; j<lenghtOfArray; j++){
                    if(arr[j]-arr[j-1]!=diff){
                        flag = false;
                        break;
                    }
                }
                res.add(flag);
            }
        }
        return res;
    }
}
