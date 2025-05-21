package solution.leetcode;

public class SmallestIndexWithDigitSumEqualToIndex {
    public static void main(String[] args) {
        SmallestIndexWithDigitSumEqualToIndex s = new SmallestIndexWithDigitSumEqualToIndex();
        System.out.println(s.smallestIndex(new int[]{0,1,2,3,4,5})); // 0
        System.out.println(s.smallestIndex(new int[]{1,2,3,4,5})); // -1
        System.out.println(s.smallestIndex(new int[]{1,3,2})); // 2
        System.out.println(s.smallestIndex(new int[]{1,10,11})); // 1
        System.out.println(s.smallestIndex(new int[]{1,2,3})); // -1
    }
    public int smallestIndex(int[] nums) {
        for(int i = 0; i<nums.length; i++){
            if(i==sumOfDigits(nums[i])) return i;
        }
        return -1;
    }
    public int sumOfDigits(int k){
        int sum = 0;
        while(k>0){
            sum += k%10;
            k = k/10;
        }
        return sum;
    }
}
