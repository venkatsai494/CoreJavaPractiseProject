package solution.leetcode;

public class BitwiseOROfEvenNumbersInAnArray {
    public static void main(String[] args) {
        BitwiseOROfEvenNumbersInAnArray bitwiseOROfEvenNumbersInAnArray = new BitwiseOROfEvenNumbersInAnArray();
        System.out.println(bitwiseOROfEvenNumbersInAnArray.evenNumberBitwiseORs(new int[]{1,2,3,4,5,6}));
        System.out.println(bitwiseOROfEvenNumbersInAnArray.evenNumberBitwiseORs(new int[]{7,9,11}));
        System.out.println(bitwiseOROfEvenNumbersInAnArray.evenNumberBitwiseORs(new int[]{1,8,16}));
    }
    public int evenNumberBitwiseORs(int[] nums) {
        int result = 0;
        for(int n: nums){
            if(n%2==0) result = result | n;
        }
        return result;
    }
}
