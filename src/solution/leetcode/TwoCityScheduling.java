package solution.leetcode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TwoCityScheduling {
    public static void main(String[] args) {
        TwoCityScheduling twoCityScheduling = new TwoCityScheduling();
        System.out.println(twoCityScheduling.twoCitySchedCost(new int[][]{{10,20},{30,200},{400,50},{30,20}}));
        System.out.println(twoCityScheduling.twoCitySchedCost(new int[][]{{259,770},{448,54},{926,667},{184,139},{840,118},{577,469}}));
        System.out.println(twoCityScheduling.twoCitySchedCost(new int[][]{{515,563},{451,713},{537,709},{343,819},{855,779},{457,60},{650,359},{631,42}}));
    }
    public int twoCitySchedCost(int[][] costs) {
        int result = 0;
        List<List<Integer>> list = new ArrayList<>();
        for(int[] cost: costs){
            List<Integer> temp = new ArrayList<>();
            temp.add(cost[0]);
            temp.add(cost[1]);
            list.add(temp);
        }
        list.sort(Comparator.comparingInt(a -> Math.abs(a.getFirst() - a.get(1))));
        int placesRemainingInA = costs.length/2;
        int placesRemainingInB = costs.length/2;
        for(int i = list.size()-1;i>=0;i--){
            if(placesRemainingInA!=0 && placesRemainingInB!=0){
                if(list.get(i).get(0)>list.get(i).get(1)){
                    result+=list.get(i).get(1);
                    placesRemainingInB--;
                }
                else{
                    result+=list.get(i).getFirst();
                    placesRemainingInA--;
                }
            }
            else if(placesRemainingInB==0){
                result+=list.get(i).getFirst();
                placesRemainingInA--;
            }
            else{
                result+=list.get(i).get(1);
                placesRemainingInB--;
            }
        }
        return result;
    }
}
