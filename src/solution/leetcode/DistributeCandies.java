package solution.leetcode;

import java.util.Arrays;

public class DistributeCandies {
    public static void main(String[] args) {
        DistributeCandies solution = new DistributeCandies();
        System.out.println(solution.distributeCandies(new int[]{1,1,2,2,3,3})); // Output: 3
        System.out.println(solution.distributeCandies(new int[]{1,1,2,3})); // Output: 2
        System.out.println(solution.distributeCandies(new int[]{6,6,6,6})); // Output: 1
    }
    public int distributeCandies(int[] candyType) {
        int numberOfCandies = candyType.length;
        int diffTypeOfCandies = (int)Arrays.stream(candyType).distinct().count();
        return Math.min(diffTypeOfCandies, (numberOfCandies/2));
    }
}
