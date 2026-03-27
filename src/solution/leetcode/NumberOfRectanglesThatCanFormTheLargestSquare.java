package solution.leetcode;

import java.util.*;

public class NumberOfRectanglesThatCanFormTheLargestSquare {
    public static void main(String[] args) {
        NumberOfRectanglesThatCanFormTheLargestSquare obj = new NumberOfRectanglesThatCanFormTheLargestSquare();
        System.out.println(obj.countGoodRectangles(new int[][]{{5,8},{3,9},{5,12},{16,5}}));
        System.out.println(obj.countGoodRectangles(new int[][]{{2,3},{3,7},{4,3},{3,7}}));
    }
    public int countGoodRectangles(int[][] rectangles) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int[] rectangle : rectangles) {
            int min = Math.min(rectangle[0], rectangle[1]);
            if (map.containsKey(min)) {
                map.put(min, map.get(min) + 1);
            } else {
                map.put(min, 1);
            }
        }
        List<Integer> list = new ArrayList<>(map.keySet());
        list.sort(Collections.reverseOrder());
        return map.get(list.getFirst());
    }
}
