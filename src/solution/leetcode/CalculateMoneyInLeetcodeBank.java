package solution.leetcode;

public class CalculateMoneyInLeetcodeBank {
    public static void main(String[] args) {
        CalculateMoneyInLeetcodeBank cm = new CalculateMoneyInLeetcodeBank();
        System.out.println(cm.totalMoney(4)); // 10
        System.out.println(cm.totalMoney(10)); // 37
        System.out.println(cm.totalMoney(20)); // 96
    }
    public int totalMoney(int n) {
        int initialBonus = 0;
        int starter = 1;
        int moneyInBank = 0;
        for(int i = 1; i<=n; i++){
            int sumtobeAdded = starter + initialBonus;
            moneyInBank = moneyInBank + sumtobeAdded;
            starter++;
            if(i%7==0){
                initialBonus++;
                starter = 1;
            }
        }
        return moneyInBank;
    }
}
