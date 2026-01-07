package solution.leetcode;

import java.util.*;

public class FindTheLeastFrequentDigit {
    public static void main(String[] args) {
        FindTheLeastFrequentDigit solution = new FindTheLeastFrequentDigit();
        System.out.println(solution.getLeastFrequentDigit(12333221)); // Output: 1
        System.out.println(solution.getLeastFrequentDigit(4566677)); // Output: 4
        System.out.println(solution.getLeastFrequentDigit(1553322)); // Output: 1
        System.out.println(solution.getLeastFrequentDigit(723344511)); // Output: 2
    }
    public int getLeastFrequentDigit(int n) {
        String s = String.valueOf(n);
        Map<Integer, Integer> map = new HashMap<>();
        for(char c: s.toCharArray()){
            if(map.containsKey(c-'0')){
                map.put(c-'0', map.get(c-'0')+1);
            }
            else{
                map.put(c-'0', 1);
            }
        }
        List<Integer> keyList = new ArrayList<>(map.keySet());
        Collections.sort(keyList);
        keyList.sort(Comparator.comparingInt(map::get));
        return keyList.getFirst();
    }
}
