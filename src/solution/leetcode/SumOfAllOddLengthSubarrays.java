package solution.leetcode;

public class SumOfAllOddLengthSubarrays {
    public static void main(String[] args) {
        SumOfAllOddLengthSubarrays sumOfAllOddLengthSubarrays = new SumOfAllOddLengthSubarrays();
        System.out.println(sumOfAllOddLengthSubarrays.sumOddLengthSubarrays(new int[]{1,4,2,5,3}));
        System.out.println(sumOfAllOddLengthSubarrays.sumOddLengthSubarrays(new int[]{1,2}));
        System.out.println(sumOfAllOddLengthSubarrays.sumOddLengthSubarrays(new int[]{10,11,12}));
    }
    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        for(int i = 0; i<arr.length; i++){
            for(int j = i; j<arr.length; j++){
                if((j-i)%2==0) {
                    sum = sum + sumOfFromTo(arr, i, j);
                }
            }
        }
        return sum;
    }
    public int sumOfFromTo(int [] arr, int start, int end){
        int sum = 0;
        for(int i = start; i<=end; i++){
            sum = sum + arr[i];
        }
        return sum;
    }
}
