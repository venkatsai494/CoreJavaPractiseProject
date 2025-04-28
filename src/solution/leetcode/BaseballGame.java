package solution.leetcode;

import java.util.ArrayList;
import java.util.List;

public class BaseballGame {
    public static void main(String[] args) {
        BaseballGame bg = new BaseballGame();
        System.out.println(bg.calPoints(new String[]{"5", "2", "C", "D", "+"})); // 30
        System.out.println(bg.calPoints(new String[]{"5", "-2", "4", "C", "D", "9", "+", "+"})); // 27
        System.out.println(bg.calPoints(new String[]{"1", "C"})); // 0

    }
    public int calPoints(String[] operations) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i<operations.length; i++){
            if(operations[i].equals("C")){
                list.remove(list.size()-1);
            }
            else if(operations[i].equals("D")){
                list.add(2*list.get(list.size()-1));
            }
            else if(operations[i].equals("+")){
                list.add((list.get(list.size()-1)) + list.get(list.size()-2));
            }
            else {
                list.add(Integer.valueOf(operations[i]));
            }
        }
        return list.stream().mapToInt(i->i).sum();
    }
}
