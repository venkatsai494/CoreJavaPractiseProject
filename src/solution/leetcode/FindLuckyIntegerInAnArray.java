package solution.leetcode;

public class FindLuckyIntegerInAnArray {
    public static void main(String[] args) {
        FindLuckyIntegerInAnArray solution = new FindLuckyIntegerInAnArray();
        System.out.println(solution.findLucky(new int[]{2, 2, 3, 4})); // 2
        System.out.println(solution.findLucky(new int[]{1, 2, 2, 3, 3, 3})); // -1
        System.out.println(solution.findLucky(new int[]{5})); // -1
        System.out.println(solution.findLucky(new int[]{7, 7, 7, 7})); // -1
    }
    public int findLucky(int[] arr) {
        int result = -1;
        int [] occurenceArray = new int[501];
        for(int i = 0; i < arr.length; i++) {
            occurenceArray[arr[i]]++;
        }
        for(int i = 1; i < occurenceArray.length; i++) {
            if(occurenceArray[i] == i) {
                result = i;
            }
        }
        return result;
    }
}
