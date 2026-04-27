package solution.leetcode;

public class ProjectionAreaOf3DShapes {
    public static void main(String[] args) {
        ProjectionAreaOf3DShapes projectionAreaOf3DShapes = new ProjectionAreaOf3DShapes();
        System.out.println(projectionAreaOf3DShapes.projectionArea(new int[][]{{1,2},{3,4}}));
        System.out.println(projectionAreaOf3DShapes.projectionArea(new int[][]{{2}}));
        System.out.println(projectionAreaOf3DShapes.projectionArea(new int[][]{{1,0},{0,2}}));
    }
    public int projectionArea(int[][] grid) {
        int xy = 0;
        int yz = 0;
        int zx = 0;
        for(int [] a: grid){
            for(int i: a){
                if(i>0) xy++;
            }
        }
        for(int j = 0; j<grid[0].length; j++){
            int max = 0;
            for (int[] ints : grid) {
                max = Math.max(max, ints[j]);
            }
            zx = zx + max;
        }
        for (int[] ints : grid) {
            int max = 0;
            for (int j = 0; j < grid[0].length; j++) {
                max = Math.max(max, ints[j]);
            }
            yz = yz + max;
        }
        return xy+yz+zx;
    }
}
