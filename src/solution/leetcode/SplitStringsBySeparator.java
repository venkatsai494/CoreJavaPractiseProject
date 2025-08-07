package solution.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class SplitStringsBySeparator {
    public static void main(String[] args) {
        SplitStringsBySeparator ssbs = new SplitStringsBySeparator();
        System.out.println(ssbs.splitWordsBySeparator(List.of("one.two.three","four.five","six"), '.'));
        System.out.println(ssbs.splitWordsBySeparator(List.of("$easy$","$problem$"), '$'));
        System.out.println(ssbs.splitWordsBySeparator(List.of("|||"), '|'));
        System.out.println(ssbs.splitWordsBySeparator(List.of("Venkat Sai", "Ratan Kumar", "Parpelli"), ' '));
    }
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> result = new ArrayList<>();
        for(String s: words){
            String [] temp = s.split(Pattern.quote(String.valueOf(separator)));
            for(String k : temp){
                if(!k.isEmpty())result.add(k);
            }
        }
        return result;
    }
}
