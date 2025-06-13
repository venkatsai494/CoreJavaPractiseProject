package solution.leetcode;

public class CheckIfNumberHasEqualDigitCountAndDigitValue {
    public static void main(String[] args) {
        CheckIfNumberHasEqualDigitCountAndDigitValue cn = new CheckIfNumberHasEqualDigitCountAndDigitValue();
        System.out.println(cn.digitCount("1210")); // true
        System.out.println(cn.digitCount("030")); // false
        System.out.println(cn.digitCount("123")); // false
        System.out.println(cn.digitCount("000")); // false
        System.out.println(cn.digitCount("111")); // false
    }
    public boolean digitCount(String num) {
        for(int i = 0; i<num.length(); i++){
            if((num.charAt(i) - '0') != numberOfOccurence(i,num)){
                return false;
            }
        }
        return true;
    }
    public int numberOfOccurence(int c, String s){
        int result = 0;
        for(int i = 0;i<s.length(); i++){
            if((s.charAt(i) - '0') == c) result++;
        }
        return result;
    }
}
