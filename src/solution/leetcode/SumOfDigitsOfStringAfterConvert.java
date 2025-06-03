package solution.leetcode;

public class SumOfDigitsOfStringAfterConvert {
    public static void main(String[] args) {
        SumOfDigitsOfStringAfterConvert s = new SumOfDigitsOfStringAfterConvert();
        System.out.println(s.getLucky("iiii", 1)); // 36
        System.out.println(s.getLucky("leetcode", 2)); // 6
        System.out.println(s.getLucky("zbax", 2)); // 8
        System.out.println(s.getLucky("a", 1)); // 1
        System.out.println(s.getLucky("b", 1)); // 2
    }
    public int getLucky(String s, int k) {
        int sum = 0;
        for(int i = 0; i<s.length(); i++){
            sum += sumOfNumbers(s.charAt(i) - 96);
        }
        while(k>1){
            sum = sumOfNumbers(sum);
            k--;
        }
        return sum;
    }
    public int sumOfNumbers(int k){
        int sum = 0;
        while(k>0){
            sum += k%10;
            k = k/10;
        }
        return sum;
    }
}
