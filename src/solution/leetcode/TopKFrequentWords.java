package solution.leetcode;

import java.util.*;

public class TopKFrequentWords {
    public static void main(String[] args) {
        TopKFrequentWords tkfw = new TopKFrequentWords();
        System.out.println(tkfw.topKFrequent(new String[]{"i","love","leetcode","i","love","coding"}, 2));
        System.out.println(tkfw.topKFrequent(new String[]{"the","day","is","sunny","the","the","the","sunny","is","is"}, 4));
    }
    public List<String> topKFrequent(String[] words, int k) {
        List<String> result = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        for(String i : words){
            if(map.containsKey(i)){
                map.put(i, map.get(i)+1);
            }
            else{
                map.put(i, 1);
            }
        }
        List<String> keyList = new ArrayList<>(map.keySet());
        Collections.sort(keyList);
        keyList.sort((a,b)->map.get(b)-map.get(a));
        for(int i = 0; i<k; i++){
            result.add(keyList.get(i));
        }
        return result;
    }
}
