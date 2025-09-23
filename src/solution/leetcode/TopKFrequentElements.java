package solution.leetcode;

import java.util.*;
import java.util.stream.Collectors;

public class TopKFrequentElements {
    public static void main(String[] args) {
        TopKFrequentElements t = new TopKFrequentElements();
        System.out.println(Arrays.toString(t.topKFrequent(new int[]{1,1,1,2,2,3}, 2))); //[1,2]
        System.out.println(Arrays.toString(t.topKFrequent(new int[]{1}, 1))); //[1]
        System.out.println(Arrays.toString(t.topKFrequent(new int[]{1,2,1,2,1,2,3,1,3,2}, 2))); //[1,2]
    }
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[k];
        int [] temp = Arrays.stream(nums).boxed().sorted(Comparator.reverseOrder()).mapToInt(Integer::intValue).toArray();
        for(int i : temp){
            if(map.containsKey(i)){
                map.put(i, map.get(i)+1);
            }
            else{
                map.put(i, 1);
            }
        }
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list = new ArrayList<>(map.keySet());
        list.sort((a, b)->(map.get(b) - map.get(a)));
        for(int c: list) {
            int temp1 = map.get(c);
            while (temp1 > 0) {
                list1.add(c);
                temp1--;
            }
        }
        List<Integer> almost = list1.stream().distinct().collect(Collectors.toList());
        for(int i = 0; i<k; i++){
            result[i] = almost.get(i);
        }
        return result;
    }

}
