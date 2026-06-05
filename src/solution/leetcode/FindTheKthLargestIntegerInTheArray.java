package solution.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindTheKthLargestIntegerInTheArray {
    public static void main(String[] args) {
        FindTheKthLargestIntegerInTheArray solution = new FindTheKthLargestIntegerInTheArray();
        System.out.println(solution.kthLargestNumber(new String[]{"3", "6", "7", "10"}, 4));
        System.out.println(solution.kthLargestNumber(new String[]{"2","21","12","1"}, 3));
        System.out.println(solution.kthLargestNumber(new String[]{"0","0"}, 2));
        System.out.println(solution.kthLargestNumber(new String[]{"1","1"}, 1));
    }
    public String kthLargestNumber(String[] nums, int k) {
        List<String> list = new ArrayList<>();
        Collections.addAll(list, nums);
        list.sort(Collections.reverseOrder());
        list.sort((a,b)->(b.length()-a.length()));
        String x = "";
        for(int i=0;i<list.size();i++){
            if(i==(k-1)){
                x = list.get(i);
                break;
            }
        }
        for(int i=list.size()-1;i>=0;i--){
            if(list.get(i).equals(x)){
                return list.get(i);
            }
        }
        return "";
    }
}
