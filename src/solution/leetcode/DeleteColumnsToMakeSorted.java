package solution.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DeleteColumnsToMakeSorted {
    public static void main(String[] args) {
        DeleteColumnsToMakeSorted obj = new DeleteColumnsToMakeSorted();
        System.out.println(obj.minDeletionSize(new String[]{"cba","daf","ghi"})); // 1
        System.out.println(obj.minDeletionSize(new String[]{"a","b"})); // 0
        System.out.println(obj.minDeletionSize(new String[]{"zyx","wvu","tsr"})); // 3
    }
    public int minDeletionSize(String[] strs) {
        int count = 0;
        List<List<Character>> list = new ArrayList<>();
        for(int i = 0; i<strs[0].length(); i++){
            List<Character> characterList = new ArrayList<>();
            for(String s: strs){
                characterList.add(s.charAt(i));
            }
            list.add(characterList);
        }
        for(List<Character> l: list){
            if(!l.stream().sorted().collect(Collectors.toList()).equals(l)) count++;
        }
        return count;
    }
}
