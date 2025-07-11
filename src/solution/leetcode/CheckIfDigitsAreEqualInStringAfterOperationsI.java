package solution.leetcode;

public class CheckIfDigitsAreEqualInStringAfterOperationsI {
    public static void main(String[] args) {
        CheckIfDigitsAreEqualInStringAfterOperationsI checker = new CheckIfDigitsAreEqualInStringAfterOperationsI();
        System.out.println(checker.hasSameDigits("3902")); // true
        System.out.println(checker.hasSameDigits("34789")); // false
        System.out.println(checker.hasSameDigits("0000")); // true
        System.out.println(checker.hasSameDigits("99")); // true
    }
    public boolean hasSameDigits(String s) {
        StringBuilder sb = new StringBuilder(s);
        while(sb.length() > 2){
            StringBuilder temp = new StringBuilder();
            for(int i = 0; i<sb.length()-1; i++){
                temp.append(((sb.charAt(i) - '0') + (sb.charAt(i+1) - '0'))%10);
            }
            sb = temp;
        }
        return (sb.charAt(0) == sb.charAt(1));
    }
}
