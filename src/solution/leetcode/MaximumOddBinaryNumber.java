package solution.leetcode;

public class MaximumOddBinaryNumber {
    public static void main(String[] args) {
        MaximumOddBinaryNumber mobn = new MaximumOddBinaryNumber();
        System.out.println(mobn.maximumOddBinaryNumber("010")); // 001
        System.out.println(mobn.maximumOddBinaryNumber("0101")); // 1001
    }
    public String maximumOddBinaryNumber(String s) {
        int count = 0;
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == '1') count++;
        }
        int length = s.length();
        StringBuilder sb = new StringBuilder();
        while(length>1){
            if(count>1){
                sb.append("1");
                count--;
            }
            else{
                sb.append("0");
            }
            length--;
        }
        sb.append("1");
        return sb.toString();
    }
}
