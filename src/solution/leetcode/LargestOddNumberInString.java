package solution.leetcode;

public class LargestOddNumberInString {
    public static void main(String[] args) {
        LargestOddNumberInString largestOddNumberInString = new LargestOddNumberInString();
        System.out.println(largestOddNumberInString.largestOddNumber("52"));
        System.out.println(largestOddNumberInString.largestOddNumber("4206"));
        System.out.println(largestOddNumberInString.largestOddNumber("35427"));
    }
    public String largestOddNumber(String num) {
        for(int i = num.length()-1; i>=0; i--){
            if((num.charAt(i)-'0')%2==1){
                return num.substring(0,i+1);
            }
        }
        return "";
    }
}
