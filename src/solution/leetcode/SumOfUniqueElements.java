package solution.leetcode;

public class SumOfUniqueElements {
    public static void main(String[] args) {
        SumOfUniqueElements sue = new SumOfUniqueElements();
        System.out.println(sue.sumOfUnique(new int[]{1,2,3,2})); // 4
        System.out.println(sue.sumOfUnique(new int[]{1,1,1,1,1})); // 0
        System.out.println(sue.sumOfUnique(new int[]{1,2,3,4,5})); // 15
        System.out.println(sue.sumOfUnique(new int[]{5,6,7,8,9})); // 35
    }
    public int sumOfUnique(int[] nums) {
        int [] arr = new int[101];
        for(int i : nums){
            arr[i]++;
        }
        int sum = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == 1) sum +=i;
        }
        return sum;
    }

}
