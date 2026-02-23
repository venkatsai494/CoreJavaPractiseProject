package solution.leetcode;

public class DistributeCandiesAmongChildrenI {
    public static void main(String[] args) {
        DistributeCandiesAmongChildrenI distributeCandiesAmongChildrenI = new DistributeCandiesAmongChildrenI();
        System.out.println(distributeCandiesAmongChildrenI.distributeCandies(5, 2));
        System.out.println(distributeCandiesAmongChildrenI.distributeCandies(3, 3));
        System.out.println(distributeCandiesAmongChildrenI.distributeCandies(7, 3));
        System.out.println(distributeCandiesAmongChildrenI.distributeCandies(10, 2));
    }
    public int distributeCandies(int n, int limit) {
        int count = 0;
        for(int i = 0; i<=limit; i++){
            for(int j = 0; j<=limit; j++){
                for(int k = 0; k<=limit; k++){
                    if(i+j+k == n) count++;
                }
            }
        }
        return count;
    }
}
