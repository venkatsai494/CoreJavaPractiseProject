package solution.leetcode;

public class FindClosestPerson {
    public static void main(String[] args) {
        FindClosestPerson fcp = new FindClosestPerson();
        System.out.println(fcp.findClosest(2, 7, 4)); // 1
        System.out.println(fcp.findClosest(2, 5, 6)); // 2
        System.out.println(fcp.findClosest(1, 5, 3)); // 0
        System.out.println(fcp.findClosest(5, 10, 7)); // 1
    }
    public int findClosest(int x, int y, int z) {
        if(Math.abs(x-z)<Math.abs(y-z)) return 1;
        else if(Math.abs(x-z)>Math.abs(y-z)) return 2;
        else return 0;
    }
}
