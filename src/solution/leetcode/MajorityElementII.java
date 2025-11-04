package solution.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElementII {
    public static void main(String[] args) {
        MajorityElementII obj = new MajorityElementII();
        System.out.println(obj.majorityElement(new int[]{3,2,3})); // [3]
        System.out.println(obj.majorityElement(new int[]{1})); // [1]
        System.out.println(obj.majorityElement(new int[]{1,2})); // [1,2]
        System.out.println(obj.majorityElement(new int[]{1,1,1,3,3,2,2,2})); // [1,2]
    }
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for(int n: nums){
            if(map.containsKey(n)){
                map.put(n, map.get(n)+1);
            }
            else{
                map.put(n, 1);
            }
        }
        List<Integer> list = new ArrayList<>(map.keySet());
        list.sort((a,b)->map.get(b)-map.get(a));
        int minFrequency = nums.length/3;
        for(int i = 0; i<map.size() && i<=3; i++){
            if(map.get(list.get(i))>minFrequency){
                result.add(list.get(i));
            }
        }
        return result;
    }
}
