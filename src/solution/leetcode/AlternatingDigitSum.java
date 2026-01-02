package solution.leetcode;

public class AlternatingDigitSum {
    public static void main(String[] args) {
        AlternatingDigitSum ads = new AlternatingDigitSum();
        System.out.println(ads.alternateDigitSum(521)); // Output: 4
        System.out.println(ads.alternateDigitSum(111)); // Output: 1
        System.out.println(ads.alternateDigitSum(886996)); // Output: 0
    }
    public int alternateDigitSum(int n) {
        int sum = 0;
        int space = String.valueOf(n).length()+1;
        while(n>0){
            if(space%2==0){
                sum = sum + n%10;
            }
            else{
                sum = sum - n%10;
            }
            space++;
            n = n/10;
        }
        return sum;
    }
}
