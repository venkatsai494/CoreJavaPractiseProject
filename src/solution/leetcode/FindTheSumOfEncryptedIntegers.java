package solution.leetcode;

public class FindTheSumOfEncryptedIntegers {
    public static void main(String[] args) {
        FindTheSumOfEncryptedIntegers obj = new FindTheSumOfEncryptedIntegers();
        System.out.println(obj.sumOfEncryptedInt(new int[]{1, 2, 3})); // Output: 1 + 2 + 3 = 6
        System.out.println(obj.sumOfEncryptedInt(new int[]{10, 21, 31})); // Output: 11 + 22 + 33 = 66
        System.out.println(obj.sumOfEncryptedInt(new int[]{248, 23, 456})); // Output: 888 + 33 + 666 = 1587
        System.out.println(obj.sumOfEncryptedInt(new int[]{12, 38, 25})); // Output: 22 + 88 + 55 = 165
    }
    public int sumOfEncryptedInt(int[] nums) {
        int sum = 0;
        for(int i: nums){
            sum = sum + encryptedValue(i);
        }
        return sum;
    }

    public int encryptedValue(int n){
        String s = String.valueOf(n);
        int max = s.charAt(0)-'0';
        for(int i = 0; i<s.length(); i++){
            max = Math.max(max, s.charAt(i)-'0');
        }
        return Integer.parseInt(String.valueOf(max).repeat(s.length()));
    }
}
