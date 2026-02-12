package solution.leetcode;

public class LargestTriangleArea {
    public static void main(String[] args) {
        LargestTriangleArea lta = new LargestTriangleArea();
        System.out.println(lta.largestTriangleArea(new int[][]{{0,0},{0,1},{1,0},{0,2},{2,0}}));
        System.out.println(lta.largestTriangleArea(new int[][]{{1,0},{0,0},{0,1}}));
    }
    public double largestTriangleArea(int[][] points) {
        double maxArea = 0.0;
        for(int i = 0; i<points.length; i++){
            for(int j = i+1; j<points.length; j++){
                for(int k = j+1; k<points.length; k++){
                    maxArea = Math.max(maxArea, areaOfTriangle(points[i][0], points[i][1], points[j][0], points[j][1], points[k][0], points[k][1]));
                }
            }
        }
        double factor = 1e5;
        return Math.round(maxArea*factor)/(2*factor);
    }
    public double areaOfTriangle(int x1, int y1, int x2, int y2, int x3, int y3){
        return Math.abs((x1 * (y2 - y3)) + (x2 * (y3 - y1)) + (x3 * (y1 - y2)));
    }
}
