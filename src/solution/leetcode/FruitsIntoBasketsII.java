package solution.leetcode;

public class FruitsIntoBasketsII {
    public static void main(String[] args) {
        FruitsIntoBasketsII fib = new FruitsIntoBasketsII();
        System.out.println(fib.numOfUnplacedFruits(new int[]{4,2,5}, new int[]{3,5,4}));//1
        System.out.println(fib.numOfUnplacedFruits(new int[]{3,6,1}, new int[]{6,4,7}));//0
    }
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int count = fruits.length;
        for (int fruit : fruits) {
            for (int j = 0; j < baskets.length; j++) {
                if (fruit <= baskets[j]) {
                    count--;
                    baskets[j] = 0;
                    break;
                }
            }
        }
        return count;
    }
}
