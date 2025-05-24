package solution.leetcode;

public class DetermineColorOfAChessboardSquare {
    public static void main(String[] args) {
        DetermineColorOfAChessboardSquare d = new DetermineColorOfAChessboardSquare();
        System.out.println(d.squareIsWhite("a1")); // false
        System.out.println(d.squareIsWhite("h3")); // true
        System.out.println(d.squareIsWhite("c7")); // false
        System.out.println(d.squareIsWhite("g6")); // true
    }
    public boolean squareIsWhite(String coordinates) {
        int sum = coordinates.charAt(0) + coordinates.charAt(1);
        return sum%2==1;
    }
}
