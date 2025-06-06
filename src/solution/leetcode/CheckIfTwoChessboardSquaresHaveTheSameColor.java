package solution.leetcode;

public class CheckIfTwoChessboardSquaresHaveTheSameColor {
    public static void main(String[] args) {
        CheckIfTwoChessboardSquaresHaveTheSameColor check = new CheckIfTwoChessboardSquaresHaveTheSameColor();
        System.out.println(check.checkTwoChessboards("a1", "c3")); // true
        System.out.println(check.checkTwoChessboards("h3", "a1")); // false
        System.out.println(check.checkTwoChessboards("a1", "h3")); // false
        System.out.println(check.checkTwoChessboards("b2", "e5")); // true
    }
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        int c1 = coordinate1.charAt(0) + coordinate1.charAt(1);
        int c2 = coordinate2.charAt(0) + coordinate2.charAt(1);
        return (c1%2)==(c2%2);
    }
}
