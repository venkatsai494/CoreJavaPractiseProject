package solution.leetcode;

public class ValidBoomerang {
    public static void main(String[] args) {
        ValidBoomerang vb = new ValidBoomerang();
        System.out.println(vb.isBoomerang(new int[][]{{1,1},{2,3},{3,2}})); // true
        System.out.println(vb.isBoomerang(new int[][]{{1,1},{2,2},{3,3}})); // false
        System.out.println(vb.isBoomerang(new int[][]{{0,0},{1,1},{2,2}})); // false
        System.out.println(vb.isBoomerang(new int[][]{{0,0},{1,1},{1,1}})); // false
        System.out.println(vb.isBoomerang(new int[][]{{73,31},{73,19},{73,45}})); // false
    }
    public boolean isBoomerang(int[][] points) {
        if(((points[0][1] == points[1][1])&&(points[0][0] == points[1][0]))
        || ((points[1][1] == points[2][1])&&(points[1][0] == points[2][0]))
        || ((points[0][1] == points[2][1])&&(points[0][0] == points[2][0])))return false;
        if(points[0][0] == points[1][0] && points[1][0] == points[2][0]) return false;
        double s01;
        double s12;
        double s20;
        s01 = (double)(points[0][1] - points[1][1])/((points[0][0] - points[1][0]));
        s12 = (double)(points[1][1] - points[2][1])/((points[1][0] - points[2][0]));
        s20 = (double)(points[2][1] - points[0][1])/((points[2][0] - points[0][0]));
        return (s01 != s12) || (s12 != s20) || (s20 != s01);
    }
}
