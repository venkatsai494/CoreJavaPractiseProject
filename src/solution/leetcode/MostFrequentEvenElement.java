package solution.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MostFrequentEvenElement {
    public static void main(String[] args) {
        MostFrequentEvenElement obj = new MostFrequentEvenElement();
        System.out.println(obj.mostFrequentEven(new int[]{0,1,2,2,4,4,1})); // 2
        System.out.println(obj.mostFrequentEven(new int[]{4,4,4,9,2,4})); // 4
        System.out.println(obj.mostFrequentEven(new int[]{29,47,21,41,13,37,25,7})); // -1
        System.out.println(obj.mostFrequentEven(new int[]{8154,9139,8194,3346,5450,9190,133,8239,4606,8671,8412,6290})); //3364
    }
    public int mostFrequentEven(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int n: nums){
            if(n%2==0){
                if(map.containsKey(n)){
                    map.put(n, map.get(n)+1);
                }
                else{
                    map.put(n, 1);
                }
            }
        }
        if(map.isEmpty()) return -1;
        List<Integer> list = new ArrayList<>(map.keySet());
        list.sort((a,b)->map.get(b)-map.get(a));
        int maxOccurence = map.get(list.get(0));
        int minValue = list.get(0);
        for(int l: list){
            if(map.get(l)<maxOccurence){
                return minValue;
            }
            minValue = Math.min(minValue, l);
        }
        return minValue;
    }
}
