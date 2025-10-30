package solution.leetcode;

public class SmallestNumberWithAllSetBits {
    public static void main(String[] args) {
        SmallestNumberWithAllSetBits obj = new SmallestNumberWithAllSetBits();
        System.out.println(obj.smallestNumber(5)); // 7
        System.out.println(obj.smallestNumber(10)); // 15
        System.out.println(obj.smallestNumber(3)); // 3
        System.out.println(obj.smallestNumber(12)); // 15
        System.out.println(obj.smallestNumber(7)); // 7
        System.out.println(obj.smallestNumber(1)); // 1
    }
    public int smallestNumber(int n) {
        int l = Integer.toBinaryString(n).length();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<l; i++){
            sb.append("1");
        }
        return Integer.parseInt(sb.toString(),2);
    }
}
