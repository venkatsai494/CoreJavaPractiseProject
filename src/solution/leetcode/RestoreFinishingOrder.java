package solution.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RestoreFinishingOrder {
    public static void main(String[] args) {
        RestoreFinishingOrder rfo = new RestoreFinishingOrder();
        System.out.println(Arrays.toString(rfo.recoverOrder(new int[]{3,1,2,5,4}, new int[]{1,3,4})));//[3, 1, 4]
        System.out.println(Arrays.toString(rfo.recoverOrder(new int[]{1,4,5,3,2}, new int[]{2,5})));//[5, 2]

    }
    public int[] recoverOrder(int[] order, int[] friends) {
        int[] result = new int[friends.length];
        List<Integer> temp = new ArrayList<>();
        List<Integer> friendsList = new ArrayList<>();
        for(int friend: friends){
            friendsList.add(friend);
        }
        for(int i : order){
            if(friendsList.contains(i)){
                temp.add(i);
            }
        }
        for(int i = 0; i<result.length; i++){
            result[i] = temp.get(i);
        }
        return result;
    }
}
