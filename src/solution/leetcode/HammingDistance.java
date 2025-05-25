package solution.leetcode;

public class HammingDistance {
    public static void main(String[] args) {
        HammingDistance hd = new HammingDistance();
        System.out.println(hd.hammingDistance(1, 4)); // 2
        System.out.println(hd.hammingDistance(3, 1)); // 1
        System.out.println(hd.hammingDistance(0, 0)); // 0
        System.out.println(hd.hammingDistance(5, 10)); // 3
    }
    public int hammingDistance(int x, int y) {
        int max = Math.max(x,y);
        int min = Math.min(x,y);
        int count = 0;
        String maxB = Integer.toBinaryString(max);
        String temp = Integer.toBinaryString(min);
        String minB = appender(maxB.length()-temp.length()) + temp;
        for(int i = maxB.length()-1; i>=0; i--){
            if(maxB.charAt(i) != minB.charAt(i))    count++;
        }
        return count;
    }
    public String appender(int length){
        StringBuilder sb = new StringBuilder();
        while(length>0){
            sb.append("0");
            length--;
        }
        return sb.toString();
    }
}
