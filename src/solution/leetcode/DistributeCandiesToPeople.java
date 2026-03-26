package solution.leetcode;

import java.util.Arrays;

public class DistributeCandiesToPeople {
    public static void main(String[] args) {
        DistributeCandiesToPeople distributeCandiesToPeople = new DistributeCandiesToPeople();
        System.out.println(Arrays.toString(distributeCandiesToPeople.distributeCandies(7, 4)));
        System.out.println(Arrays.toString(distributeCandiesToPeople.distributeCandies(10, 3)));
    }
    public int[] distributeCandies(int candies, int num_people) {
        int[] result = new int[num_people];
        int inhand = 1;
        outerwhile:
        while (candies > 0) {
            for (int i = 0; i < num_people; i++) {
                if(candies>inhand){
                    result[i] = result[i] + inhand;
                    candies = candies - inhand;
                }
                else{
                    result[i] = result[i] + candies;
                    break outerwhile;
                }
                inhand++;
            }
        }
        return result;
    }
}
