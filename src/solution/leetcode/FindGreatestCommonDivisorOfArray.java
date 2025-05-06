package solution.leetcode;

public class FindGreatestCommonDivisorOfArray {
    public static void main(String[] args) {
        FindGreatestCommonDivisorOfArray gcd = new FindGreatestCommonDivisorOfArray();
        System.out.println(gcd.findGCD(new int[]{2,5,6,9,10})); // 2
        System.out.println(gcd.findGCD(new int[]{7,5,6,8,3})); // 1
        System.out.println(gcd.findGCD(new int[]{3, 3})); // 3
        System.out.println(gcd.findGCD(new int[]{2, 6, 3, 4, 5})); // 1
        System.out.println(gcd.findGCD(new int[]{7, 5, 6, 8, 3})); // 1
        System.out.println(gcd.findGCD(new int[]{3, 9, 6})); // 3
        System.out.println(gcd.findGCD(new int[]{12, 15, 21})); // 3
    }
    public int findGCD(int[] nums) {
        int output = 0;
        int min = nums[0];
        int max = nums[nums.length-1];
        for(int num: nums){
            if(num<min) min = num;
            if(num>max) max = num;
        }
        for(int i = 1; i<=min; i++){
            if(min%i == 0 && max%i ==0) output = i;
        }
        return output;
    }
}
