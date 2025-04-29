package solution.leetcode;

public class ReverseDegreeOfAString {
    public static void main(String[] args) {
        ReverseDegreeOfAString rds = new ReverseDegreeOfAString();
        System.out.println(rds.reverseDegree("abc"));
        System.out.println(rds.reverseDegree("zaza"));
        System.out.println(rds.reverseDegree("aabbcc"));
        System.out.println(rds.reverseDegree("abcde"));
    }
    public int reverseDegree(String s) {
        int output = 0;
        for(int i = 0; i<s.length(); i++){
            output = output + ((i+1)*(123-s.charAt(i)));
        }
        return output;
    }
}
