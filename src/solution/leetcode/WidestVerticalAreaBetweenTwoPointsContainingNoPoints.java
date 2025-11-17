package solution.leetcode;

import java.util.Arrays;

public class WidestVerticalAreaBetweenTwoPointsContainingNoPoints {
    public static void main(String[] args) {
        WidestVerticalAreaBetweenTwoPointsContainingNoPoints solution = new WidestVerticalAreaBetweenTwoPointsContainingNoPoints();
        System.out.println(solution.maxWidthOfVerticalArea(new int[][]{{8,7},{9,9},{7,4},{9,7}})); // Output: 1
        System.out.println(solution.maxWidthOfVerticalArea(new int[][]{{3,1},{9,0},{1,0},{1,4},{5,3},{8,8}})); // Output: 3
    }
    public int maxWidthOfVerticalArea(int[][] points) {
        int max = 0;
        int [] temp = new int[points.length];
        for(int i = 0; i<points.length; i++){
            temp[i] = points[i][0];
        }
        Arrays.sort(temp);
        for(int i = 1; i<temp.length; i++){
            max = Math.max(max, temp[i]-temp[i-1]);
        }
        return max;
    }
}
