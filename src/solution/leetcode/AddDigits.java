package solution.leetcode;

public class AddDigits {
    public static void main(String[] args) {
        AddDigits ad = new AddDigits();
        System.out.println(ad.addDigits(38)); // 2
        System.out.println(ad.addDigits(0)); // 0
        System.out.println(ad.addDigits(9)); // 9
        System.out.println(ad.addDigits(18)); // 9
        System.out.println(ad.addDigits(123)); // 6
    }
    public int addDigits(int num) {
        if (num == 0) return num;
        else if(num%9 == 0) return 9;
        else return num%9;
    }
}
