package solution.leetcode;

public class CheckIfItIsAStraightLine {
    public static void main(String[] args) {
        CheckIfItIsAStraightLine solution = new CheckIfItIsAStraightLine();
        System.out.println(solution.checkStraightLine(new int[][]{{1,2},{2,3},{3,4},{4,5},{5,6},{6,7}})); // true
        System.out.println(solution.checkStraightLine(new int[][]{{1,1},{2,2},{3,4},{4,5},{5,6}})); // false
        System.out.println(solution.checkStraightLine(new int[][]{{0,0},{0,1},{0,-1}})); // true
        System.out.println(solution.checkStraightLine(new int[][]{{-4,-3},{1,0},{3,-1},{0,-1},{-5,2}})); // false
    }

    public boolean checkStraightLine(int[][] coordinates) {
        try{
            if(coordinates[0][0] == coordinates[1][0]){
                for(int i = 1; i<coordinates.length; i++){
                    if(coordinates[i][0] != coordinates[i-1][0]) return false;
                }
            }
            else{
                double slope = (double) (coordinates[0][1] - coordinates[1][1]) /(coordinates[0][0] - coordinates[1][0]);
                for(int i = 1; i<coordinates.length; i++){
                    if(slope != (double) (coordinates[i][1] - coordinates[i - 1][1]) /(coordinates[i][0] - coordinates[i-1][0])) return false;
                }
            }
        }
        catch (ArithmeticException e){
            return false;
        }

        return true;
    }

}
