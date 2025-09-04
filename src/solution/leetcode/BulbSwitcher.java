package solution.leetcode;

public class BulbSwitcher {
    public static void main(String[] args) {
        BulbSwitcher bs = new BulbSwitcher();
        System.out.println(bs.bulbSwitch(3)); // 1
        System.out.println(bs.bulbSwitch(0)); // 0
        System.out.println(bs.bulbSwitch(1)); // 1
        System.out.println(bs.bulbSwitch(4)); // 2
        System.out.println(bs.bulbSwitch(100)); // 10
        System.out.println(bs.bulbSwitch(9)); // 10
    }
    public int bulbSwitch(int n) {
        return (int)Math.sqrt(n);
    }

}
