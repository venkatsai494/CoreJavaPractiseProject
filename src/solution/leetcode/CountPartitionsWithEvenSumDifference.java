package solution.leetcode;

public class CountPartitionsWithEvenSumDifference {
    public static void main(String[] args) {
        CountPartitionsWithEvenSumDifference c = new CountPartitionsWithEvenSumDifference();
        System.out.println(c.countPartitions(new int[]{10,10,3,7,6})); //4
        System.out.println(c.countPartitions(new int[]{1,2,2})); //0
        System.out.println(c.countPartitions(new int[]{2,4,6,8})); //3
        System.out.println(c.countPartitions(new int[]{2,3,5,7})); //2
        System.out.println(c.countPartitions(new int[]{1,2,3,4,5})); //2
        System.out.println(c.countPartitions(new int[]{1,1,1})); //2
        System.out.println(c.countPartitions(new int[]{1,1})); //1
        System.out.println(c.countPartitions(new int[]{1})); //0
    }
    public int countPartitions(int[] nums) {
        int count = 0;
        int i = 1;
        while(i<nums.length){
            int leftSum = 0;
            int rightSum = 0;
            for(int j = 0; j<=i-1; j++){
                leftSum += nums[j];
            }
            for(int j = i; j<nums.length; j++){
                rightSum += nums[j];
            }
            if((leftSum-rightSum)%2==0) count++;
            i++;
        }
        return count;
    }
}
