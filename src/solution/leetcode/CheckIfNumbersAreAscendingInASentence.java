package solution.leetcode;

import java.util.ArrayList;
import java.util.List;

public class CheckIfNumbersAreAscendingInASentence {
    public static void main(String[] args) {
        CheckIfNumbersAreAscendingInASentence solution = new CheckIfNumbersAreAscendingInASentence();
        System.out.println(solution.areNumbersAscending("1 box has 3 blue 4 red 6 green and 12 yellow marbles")); // true
        System.out.println(solution.areNumbersAscending("hello world 5 x 5")); // false
        System.out.println(solution.areNumbersAscending("sunset is at 7 51 pm overnight lows will be in the low 50 and 60 s")); // false
    }
    public boolean areNumbersAscending(String s) {
        String [] strArr = s.split(" ");
        List<Integer> list = new ArrayList<>();
        for(String str: strArr){
            try{
                list.add(Integer.parseInt(str));
            }
            catch (Exception ignored){
            }
        }
        for(int i = 1; i<list.size(); i++){
            if(list.get(i)<=list.get(i-1)) return false;
        }
        return true;
    }
}
