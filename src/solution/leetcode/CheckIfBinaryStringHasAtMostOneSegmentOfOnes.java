package solution.leetcode;

public class CheckIfBinaryStringHasAtMostOneSegmentOfOnes {
    public static void main(String[] args) {
        CheckIfBinaryStringHasAtMostOneSegmentOfOnes checkIfBinaryStringHasAtMostOneSegmentOfOnes = new CheckIfBinaryStringHasAtMostOneSegmentOfOnes();
        System.out.println(checkIfBinaryStringHasAtMostOneSegmentOfOnes.checkOnesSegment("1001"));
        System.out.println(checkIfBinaryStringHasAtMostOneSegmentOfOnes.checkOnesSegment("110"));
    }
    public boolean checkOnesSegment(String s) {
        return !s.contains("0") || (s.indexOf("0") >= s.lastIndexOf("1"));
    }
}