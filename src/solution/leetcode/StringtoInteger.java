package solution.leetcode;

public class StringtoInteger {
    public static void main(String[] args) {
        StringtoInteger s = new StringtoInteger();
        System.out.println(s.myAtoi("42")); //42
        System.out.println(s.myAtoi("   -42")); //-42
        System.out.println(s.myAtoi("4193 with words")); //4193
        System.out.println(s.myAtoi("words and 987")); //0
        System.out.println(s.myAtoi("0-1")); //0
        System.out.println(s.myAtoi("1337c0d3")); //0
        System.out.println(s.myAtoi("-91283472332"));
        System.out.println(s.myAtoi("+1"));// 1
    }
    public int myAtoi(String s) {
        s = s.trim();
        long sum = 0;
        boolean isNegative = false;
        char[] arr = s.toCharArray();
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == '-' && i==0 && !isNegative){
                isNegative = true;
            }
            else if(arr[i] == '+' && i==0 && !isNegative){
                isNegative = false;
            }
            else if(Character.isDigit(arr[i])){
                sum = (sum*10) + (arr[i]-'0');
                if(sum>2147483647){
                    if(isNegative) return -2147483648;
                    else return 2147483647;
                }
            }
            else{
                break;
            }
        }
        if(isNegative) sum = sum*-1;
        return (int)sum;
    }
}
