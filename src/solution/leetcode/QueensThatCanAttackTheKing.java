package solution.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QueensThatCanAttackTheKing {
    public static void main(String[] args) {
        QueensThatCanAttackTheKing solution = new QueensThatCanAttackTheKing();
        System.out.println(solution.queensAttacktheKing(new int[][]{{0,1},{1,0},{4,0},{0,4},{3,3},{2,4}}, new int[] {0,0}));
        System.out.println(solution.queensAttacktheKing(new int[][]{{0,0},{1,1},{2,2},{3,4},{3,5},{4,4},{4,5}}, new int[] {3,3}));
    }

    public List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king) {
        List<List<Integer>> result = new ArrayList<>();
        //Going up
        int[] temp = Arrays.copyOf(king, king.length);
        while(temp[0]>=0){
            temp[0]--;
            if(arrayContains(queens, temp)){
                List<Integer> list = new ArrayList<>();
                list.add(temp[0]);
                list.add(temp[1]);
                result.add(list);
                break;
            }
        }
        //Going down
        temp = Arrays.copyOf(king, king.length);
        while(temp[0]<8){
            temp[0]++;
            if(arrayContains(queens, temp)){
                List<Integer> list = new ArrayList<>();
                list.add(temp[0]);
                list.add(temp[1]);
                result.add(list);
                break;
            }
        }
        //Going left
        temp = Arrays.copyOf(king, king.length);
        while(temp[1]>=0){
            temp[1]--;
            if(arrayContains(queens, temp)){
                List<Integer> list = new ArrayList<>();
                list.add(temp[0]);
                list.add(temp[1]);
                result.add(list);
                break;
            }
        }
        //Going right
        temp = Arrays.copyOf(king, king.length);
        while(temp[1]<8){
            temp[1]++;
            if(arrayContains(queens, temp)){
                List<Integer> list = new ArrayList<>();
                list.add(temp[0]);
                list.add(temp[1]);
                result.add(list);
                break;
            }
        }
        //Going up right
        temp = Arrays.copyOf(king, king.length);
        while(temp[0]>=0 && temp[1]<8){
            temp[0]--;
            temp[1]++;
            if(arrayContains(queens, temp)){
                List<Integer> list = new ArrayList<>();
                list.add(temp[0]);
                list.add(temp[1]);
                result.add(list);
                break;
            }
        }
        //Going up left
        temp = Arrays.copyOf(king, king.length);
        while(temp[0]>=0 && temp[1]>=0){
            temp[0]--;
            temp[1]--;
            if(arrayContains(queens, temp)){
                List<Integer> list = new ArrayList<>();
                list.add(temp[0]);
                list.add(temp[1]);
                result.add(list);
                break;
            }
        }
        //Going down left
        temp = Arrays.copyOf(king, king.length);
        while(temp[0]<8 && temp[1]>=0){
            temp[0]++;
            temp[1]--;
            if(arrayContains(queens, temp)){
                List<Integer> list = new ArrayList<>();
                list.add(temp[0]);
                list.add(temp[1]);
                result.add(list);
                break;
            }
        }
        //Going down right
        temp = Arrays.copyOf(king, king.length);
        while(temp[0]<8 && temp[1]<8){
            temp[0]++;
            temp[1]++;
            if(arrayContains(queens, temp)){
                List<Integer> list = new ArrayList<>();
                list.add(temp[0]);
                list.add(temp[1]);
                result.add(list);
                break;
            }
        }
        return result;
    }
    public boolean arrayContains(int[][] mainArray, int[] targetArr){
        for(int[] temp: mainArray){
            if(Arrays.equals(temp, targetArr)){
                return true;
            }
        }
        return false;
    }
}
