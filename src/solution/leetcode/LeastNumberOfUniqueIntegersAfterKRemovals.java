package solution.leetcode;

import java.util.*;

public class LeastNumberOfUniqueIntegersAfterKRemovals {
    public static void main(String[] args) {
        LeastNumberOfUniqueIntegersAfterKRemovals obj = new LeastNumberOfUniqueIntegersAfterKRemovals();
        System.out.println(obj.findLeastNumOfUniqueInts(new int[]{5,5,4}, 1)); // 1
        System.out.println(obj.findLeastNumOfUniqueInts(new int[]{4,3,1,1,3,3,2}, 3)); // 2
        System.out.println(obj.findLeastNumOfUniqueInts(new int[]{11,22,22,33,33,33,44,44,44,44}, 3)); // 2
    }
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        int result = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i: arr){
            if(map.containsKey(i)){
                map.put(i, map.get(i)+1);
            }
            else{
                map.put(i, 1);
            }
        }
        List<Integer> list = new ArrayList<>(map.keySet());
        list.sort(Comparator.comparingInt(map::get));
        int n = list.size();
        int count = 0;
        for(int i : list){
            while(map.get(i)>0){
                map.put(i, map.get(i)-1);
                if(k==0){
                    return n-count;
                }
                k--;
            }
            count++;
        }
        return result;
    }
}
