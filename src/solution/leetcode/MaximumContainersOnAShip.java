package solution.leetcode;

public class MaximumContainersOnAShip {
    public static void main(String[] args) {
        MaximumContainersOnAShip solution = new MaximumContainersOnAShip();
        System.out.println(solution.maxContainers(2, 3, 15)); // 4
        System.out.println(solution.maxContainers(3, 5, 20)); // 4
        System.out.println(solution.maxContainers(3, 5, 15)); // 3
        System.out.println(solution.maxContainers(4, 2, 10)); // 5
        System.out.println(solution.maxContainers(5, 3, 20)); // 6
    }
    public int maxContainers(int n, int w, int maxWeight) {
        int max = n*n;
        if((max*w)<=maxWeight) return max;
        else{
            return maxWeight/w;
        }
    }
}
