package solution.leetcode;

public class FindTheMaximumAchievableNumber {
    public static void main(String[] args) {
        FindTheMaximumAchievableNumber f = new FindTheMaximumAchievableNumber();
        System.out.println(f.theMaximumAchievableX(4, 1)); // 6
        System.out.println(f.theMaximumAchievableX(3, 2)); // 7
        System.out.println(f.theMaximumAchievableX(2, 3)); // 8
        System.out.println(f.theMaximumAchievableX(5, 0)); // 5
    }

    public int theMaximumAchievableX(int num, int t) {
        return (num+(2*t));
    }
}
