package solution.leetcode;

public class RemoveTrailingZerosFromAString {
    public static void main(String[] args) {
        RemoveTrailingZerosFromAString solution = new RemoveTrailingZerosFromAString();
        System.out.println(solution.removeTrailingZeros("51230100")); // Output: "512301"
        System.out.println(solution.removeTrailingZeros("123")); // Output: "123"
    }
    public String removeTrailingZeros(String num) {
        while(num.charAt(num.length()-1) == '0')
        {
            num = num.substring(0, num.length()-1);
        }
        return num;
    }
}
