package solution.leetcode;

import java.util.*;

public class DestinationCity {
    public static void main(String[] args) {
        DestinationCity solution = new DestinationCity();
        System.out.println(solution.destCity(Arrays.asList(Arrays.asList("London", "New York"), Arrays.asList("New York", "Lima"), Arrays.asList("Lima", "Sao Paulo")))); // Output: Sao Paulo
        System.out.println(solution.destCity(Arrays.asList(Arrays.asList("B", "C"), Arrays.asList("D", "B"), Arrays.asList("C", "A")))); // Output: A
        System.out.println(solution.destCity(Arrays.asList(Arrays.asList("A", "Z")))); // Output: Z
    }
    public String destCity(List<List<String>> paths) {
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i<paths.size(); i++){
            map.put(paths.get(i).get(0), (map.get(paths.get(i).get(0))==null ? 0 : map.get(paths.get(i).get(0)))+1);
            map.put(paths.get(i).get(1), (map.get(paths.get(i).get(1))==null ? 0 : map.get(paths.get(i).get(1)))-1);
        }
        for(String s: map.keySet()){
            if(map.get(s) == -1){
                return s;
            }
        }
        return "";
    }
}
