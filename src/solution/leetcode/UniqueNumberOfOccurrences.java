package solution.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UniqueNumberOfOccurrences {
    public static void main(String[] args) {
        UniqueNumberOfOccurrences uniqueNumberOfOccurrences = new UniqueNumberOfOccurrences();
        System.out.println(uniqueNumberOfOccurrences.uniqueOccurrences(new int[]{1,2,2,1,1,3}));
        System.out.println(uniqueNumberOfOccurrences.uniqueOccurrences(new int[]{1,2}));
        System.out.println(uniqueNumberOfOccurrences.uniqueOccurrences(new int[]{-3,0,1,-3,1,1,1,-3,10,0}));
    }
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i: arr){
            if(map.containsKey(i)){
                map.put(i, map.get(i)+1);
            }
            else {
                map.put(i, 1);
            }
        }
        List<Integer> keyList = new ArrayList<>(map.keySet());
        List<Integer> valueList = new ArrayList<>();
        for(Integer i: keyList){
            valueList.add(map.get(i));
        }
        List<Integer> list = valueList.stream().distinct().toList();
        return map.size()==list.size();
    }
}
