package solution.leetcode;

public class SumOfSquaresOfSpecialElements {

    public static void main(String[] args) {
        SumOfSquaresOfSpecialElements sse = new SumOfSquaresOfSpecialElements();
        System.out.println(sse.sumOfSquares(new int[]{1, 2, 3, 4})); // 21
        System.out.println(sse.sumOfSquares(new int[]{2,7,1,19,18,3})); // 63
        System.out.println(sse.sumOfSquares(new int[]{2, 3, 4})); // 20
        System.out.println(sse.sumOfSquares(new int[]{1, 2, 3})); // 14
        System.out.println(sse.sumOfSquares(new int[]{1, 2})); // 5
    }

    public int sumOfSquares(int[] nums) {
        int result = 0;
        int length = nums.length;
        for(int i = 1; i<=length; i++){
            if(length%i == 0){
                result += (nums[i-1] * nums[i-1]);
            }
        }
        return result;
    }
}
