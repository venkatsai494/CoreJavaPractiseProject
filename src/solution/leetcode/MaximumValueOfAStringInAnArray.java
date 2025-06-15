package solution.leetcode;

public class MaximumValueOfAStringInAnArray {
    public static void main(String[] args) {
        MaximumValueOfAStringInAnArray solution = new MaximumValueOfAStringInAnArray();
        System.out.println(solution.maximumValue(new String[]{"alic3","bob","3","4","00000"}));
        System.out.println(solution.maximumValue(new String[]{"1","01","001","0001"}));
    }
    public int maximumValue(String[] strs) {
        int max = 0;
        for(String s: strs){
            max = Math.max(returnValueFromString(s), max);
        }
        return max;
    }
    public int returnValueFromString(String s){
        try{
            return Integer.parseInt(s, 10);
        }
        catch (Exception e){
            return s.length();
        }
    }
}
