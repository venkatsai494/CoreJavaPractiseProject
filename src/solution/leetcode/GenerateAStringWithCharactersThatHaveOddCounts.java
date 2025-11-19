package solution.leetcode;

public class GenerateAStringWithCharactersThatHaveOddCounts {
    public static void main(String[] args) {
        GenerateAStringWithCharactersThatHaveOddCounts g = new GenerateAStringWithCharactersThatHaveOddCounts();
        System.out.println(g.generateTheString(4)); // Output: "aaab"
        System.out.println(g.generateTheString(2)); // Output: "ab"
        System.out.println(g.generateTheString(7)); // Output: "aaaaaaa"
    }
    public String generateTheString(int n) {
        if(n%2==0){
            return "a".repeat(n-1)+"b";
        }
        else{
            return "a".repeat(n);
        }
    }
}
