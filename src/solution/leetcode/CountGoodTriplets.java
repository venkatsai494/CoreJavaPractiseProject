package solution.leetcode;

public class CountGoodTriplets {
    public static void main(String[] args) {
        CountGoodTriplets cgt = new CountGoodTriplets();
        System.out.println(cgt.countGoodTriplets(new int[]{3,0,1,1,9,7}, 7, 2, 3)); // Output: 4
        System.out.println(cgt.countGoodTriplets(new int[]{1,1,2,2,3}, 0, 0, 1)); // Output: 0
        System.out.println(cgt.countGoodTriplets(new int[]{4,9,9,8,9,5,3,7}, 1, 3, 0)); // Output: 3
    }
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int output = 0;
        for(int i = 0; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                for(int k = j+1; k<arr.length; k++){
                    if(Math.abs(arr[i] - arr[j])<=a && Math.abs(arr[j] - arr[k])<=b && Math.abs(arr[i] - arr[k])<=c)    output++;
                }
            }
        }
        return output;
    }
}
