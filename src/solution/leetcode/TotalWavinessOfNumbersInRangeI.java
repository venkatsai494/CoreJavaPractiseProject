package solution.leetcode;

public class TotalWavinessOfNumbersInRangeI {
    public static void main(String[] args) {
        TotalWavinessOfNumbersInRangeI totalWavinessOfNumbersInRangeI = new TotalWavinessOfNumbersInRangeI();
        System.out.println(totalWavinessOfNumbersInRangeI.totalWaviness(120, 130));
        System.out.println(totalWavinessOfNumbersInRangeI.totalWaviness(198, 202));
        System.out.println(totalWavinessOfNumbersInRangeI.totalWaviness(4848, 4848));
    }
    public int totalWaviness(int num1, int num2) {
        int result = 0;
        for(int i = num1; i<=num2; i++){
            result = result + wavinessOfNumber(i);
        }
        return result;
    }
    public int wavinessOfNumber(int x){
        String s = String.valueOf(x);
        int waviness = 0;
        if(s.length()<=2) return 0;
        for(int i = 1; i<s.length()-1; i++){
            if((((s.charAt(i-1)-'0')<(s.charAt(i)-'0'))&&((s.charAt(i+1)-'0')<(s.charAt(i)-'0')))||(((s.charAt(i-1)-'0')>(s.charAt(i)-'0'))&&((s.charAt(i+1)-'0')>(s.charAt(i)-'0')))){
                waviness++;
            }
        }
        return waviness;
    }
}
