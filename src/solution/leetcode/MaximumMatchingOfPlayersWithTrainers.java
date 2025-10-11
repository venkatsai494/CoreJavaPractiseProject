package solution.leetcode;

import java.util.Arrays;

public class MaximumMatchingOfPlayersWithTrainers {
    public static void main(String[] args) {
        MaximumMatchingOfPlayersWithTrainers obj = new MaximumMatchingOfPlayersWithTrainers();
        System.out.println(obj.matchPlayersAndTrainers(new int[]{4,7,9}, new int[]{8,2,5,8})); // 2
        System.out.println(obj.matchPlayersAndTrainers(new int[]{1,1,1}, new int[]{10})); // 1
        System.out.println(obj.matchPlayersAndTrainers(new int[]{1,2,3}, new int[]{1,1})); // 1
        System.out.println(obj.matchPlayersAndTrainers(new int[]{1,1000000000}, new int[]{1000000000,1})); // 2
    }
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        int count = 0;
        Arrays.sort(players);
        Arrays.sort(trainers);
        int i = 0;
        int j = 0;
        while(i<players.length && j<trainers.length){
            if(players[i]<=trainers[j]){
                count++;
                j++;
            }
            else{
                while(j<trainers.length && players[i]>trainers[j]){
                    j++;
                }
                if(j<trainers.length && players[i]<=trainers[j]) {
                    count++;
                    j++;
                }
            }
            i++;
        }
        return count;
    }
}
