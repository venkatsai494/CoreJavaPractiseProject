package solution.leetcode;

public class FindNearestPointThatHasTheSameXOrYCoordinate {
    public static void main(String[] args) {
        FindNearestPointThatHasTheSameXOrYCoordinate fnpt = new FindNearestPointThatHasTheSameXOrYCoordinate();
        System.out.println(fnpt.nearestValidPoint(3,4,new int[][]{{1,2},{3,1},{2,4},{2,3},{4,4}}));//2
        System.out.println(fnpt.nearestValidPoint(3,4,new int[][]{{3,4}}));//0
        System.out.println(fnpt.nearestValidPoint(3,4,new int[][]{{2,3}}));//-1
    }
    public int nearestValidPoint(int x, int y, int[][] points) {
        int manhattanDistance = 0;
        int smallestIndex = -1;
        boolean firstTime = true;
        for(int i = 0; i<points.length; i++){
            if((x==points[i][0])||(y==points[i][1])){
                if(manhattanDistance == 0 && firstTime){
                    manhattanDistance = Math.abs(x-points[i][0])+Math.abs(y-points[i][1]);
                    firstTime = false;
                    smallestIndex = i;
                }
                if((Math.abs(x-points[i][0])+Math.abs(y-points[i][1]))<manhattanDistance){
                    manhattanDistance = Math.abs(x-points[i][0])+Math.abs(y-points[i][1]);
                    smallestIndex = i;
                }
            }
        }
        return smallestIndex;
    }

}
