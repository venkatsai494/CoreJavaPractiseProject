package solution.leetcode;

import java.util.List;

public class PointsThatIntersectWithCars {
    public static void main(String[] args) {
        PointsThatIntersectWithCars solution = new PointsThatIntersectWithCars();
        System.out.println(solution.numberOfPoints(List.of(List.of(3,6), List.of(1,5), List.of(4,7)))); // 7
        System.out.println(solution.numberOfPoints(List.of(List.of(1,3), List.of(5,8)))); // 7
        System.out.println(solution.numberOfPoints(List.of(List.of(1,3), List.of(2,5), List.of(3,6)))); // 6
        System.out.println(solution.numberOfPoints(List.of(List.of(0,1), List.of(2,3), List.of(4,5)))); // 6
        System.out.println(solution.numberOfPoints(List.of(List.of(1,1), List.of(3,3), List.of(5,5)))); // 3
    }
    public int numberOfPoints(List<List<Integer>> nums) {
        int[] parking = new int[101];
        for(List<Integer> l1: nums){
            for(int i = l1.get(0); i<=l1.get(1); i++){
                if(parking[i]==0) parking[i]++;
            }
        }
        int sum = 0;
        for(int i: parking){
            sum = sum + i;
        }
        return sum;
    }
}
