package solution.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        MajorityElement obj = new MajorityElement();
        System.out.println(obj.majorityElement(new int[]{3,2,3})); // 3
        System.out.println(obj.majorityElement(new int[]{2,2,1,1,1,2,2})); // 2
        System.out.println(obj.majorityElement(new int[]{1})); // 1
        System.out.println(obj.majorityElement(new int[]{6,5,5})); // 5
    }
    public int majorityElement(int[] nums) {
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
        return list.get(0);
    }
}
