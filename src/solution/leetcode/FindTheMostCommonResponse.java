package solution.leetcode;

import java.util.*;
import java.util.stream.Collectors;

public class FindTheMostCommonResponse {
    public static void main(String[] args) {
        FindTheMostCommonResponse obj = new FindTheMostCommonResponse();
        System.out.println(obj.findCommonResponse(Arrays.asList(Arrays.asList("good","ok","good","ok"), Arrays.asList("ok","bad","good","ok","ok"), Collections.singletonList("good"), Collections.singletonList("bad")))); // Output: "good"
        System.out.println(obj.findCommonResponse(Arrays.asList(Arrays.asList("good","ok","good"), Arrays.asList("ok","bad"), Arrays.asList("bad","notsure"), Arrays.asList("great","good")))); // Output: "bad"
        System.out.println(obj.findCommonResponse(Arrays.asList(Arrays.asList("Yes", "No", "Maybe"), Arrays.asList("No", "Yes"), Arrays.asList("Maybe", "Yes", "No"), Collections.singletonList("Yes")))); // Output: "Yes"
        System.out.println(obj.findCommonResponse(Arrays.asList(Arrays.asList("A", "B"), Arrays.asList("B", "C"), Arrays.asList("C", "A")))); // Output: "A"
        System.out.println(obj.findCommonResponse(Collections.singletonList(Arrays.asList("inx","inx","gv","inx"))));
    }
    public String findCommonResponse(List<List<String>> responses) {
        Map<String, Integer> map = new HashMap<>();
        for(List<String> i : responses){
            List<String> tempList = i.stream().distinct().collect(Collectors.toList());
            for(String s: tempList){
                if(map.containsKey(s)){
                    map.put(s, map.get(s)+1);
                }
                else{
                    map.put(s, 1);
                }
            }
        }
        List<String> list= new ArrayList<>(map.keySet());
        list.sort((a,b)->(map.get(b)-map.get(a)));
        int maxcount = map.get(list.get(0));
        List<String> temp = new ArrayList<>();
        for(String i : list){
            if(map.get(i)==maxcount){
                temp.add(i);
            }
            else{
                break;
            }
        }
        Collections.sort(temp);
        return temp.get(0);
    }
}
