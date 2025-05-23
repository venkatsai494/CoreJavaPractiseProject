package solution.leetcode;

public class MinimumTimeVisitingAllPoints {
    public static void main(String[] args) {
        MinimumTimeVisitingAllPoints mtvp = new MinimumTimeVisitingAllPoints();
        System.out.println(mtvp.minTimeToVisitAllPoints(new int[][]{{1,1},{3,4},{-1,0}})); // 7
        System.out.println(mtvp.minTimeToVisitAllPoints(new int[][]{{3,2},{-2,2}})); // 5
        System.out.println(mtvp.minTimeToVisitAllPoints(new int[][]{{0,0},{0,0}})); // 0

    }
    public int minTimeToVisitAllPoints(int[][] points) {
        int sum = 0;
        for(int i = 1; i<points.length; i++){
            sum += Math.max(Math.abs(points[i][0]-points[i-1][0]), Math.abs(points[i][1]-points[i-1][1]));
        }
        return sum;
    }
}
