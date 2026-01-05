package solution.leetcode;

public class SumOfElementsWithFrequencyDivisibleByK {
    public static void main(String[] args) {
        SumOfElementsWithFrequencyDivisibleByK solution = new SumOfElementsWithFrequencyDivisibleByK();
        System.out.println(solution.sumDivisibleByK(new int[]{1,2,2,3,3,3,3,4}, 2)); // Output: 16
        System.out.println(solution.sumDivisibleByK(new int[]{1,2,3,4,5}, 2)); // Output: 0
        System.out.println(solution.sumDivisibleByK(new int[]{4,4,4,1,2,3}, 3)); // Output: 12
    }
    public int sumDivisibleByK(int[] nums, int k) {
        int sum = 0;
        int[] frequency = new int[101];
        for(int i : nums){
            frequency[i]++;
        }
        for(int i = 0; i<frequency.length; i++){
            if(frequency[i]%k==0){
                sum = sum + (i*frequency[i]);
            }
        }
        return sum;
    }
}
