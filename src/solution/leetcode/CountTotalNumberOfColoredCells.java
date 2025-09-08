package solution.leetcode;

public class CountTotalNumberOfColoredCells {
    public static void main(String[] args) {
        CountTotalNumberOfColoredCells c = new CountTotalNumberOfColoredCells();
        System.out.println(c.coloredCells(1)); //1
        System.out.println(c.coloredCells(2)); //5
        System.out.println(c.coloredCells(3)); //13
        System.out.println(c.coloredCells(4)); //25
        System.out.println(c.coloredCells(5)); //41
        System.out.println(c.coloredCells(6)); //61
        System.out.println(c.coloredCells(7)); //85
        System.out.println(c.coloredCells(8)); //113
        System.out.println(c.coloredCells(9)); //145
        System.out.println(c.coloredCells(10)); //181
    }
    public long coloredCells(int n) {
        return ((long)n*n)+ ((long)(n-1)*(n-1));
    }
}
