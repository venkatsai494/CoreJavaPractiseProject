package solution.leetcode;

public class CountIntegersWithEvenDigitSum {
    public static void main(String[] args) {
        CountIntegersWithEvenDigitSum ci = new CountIntegersWithEvenDigitSum();
        System.out.println(ci.countEven(4));
        System.out.println(ci.countEven(30));
        System.out.println(ci.countEven(10000));
    }

    public int countEven(int num) {
        int output = 0;
        for(int i = 0; i<=num; i++){
            if(isSumEven(i)) output++;
        }
        return output;
    }

    public boolean isSumEven(int n){
        int sum = 0;
        do{
            sum = sum + (n%10);
            n = n/10;
        }while(n>0);
        return (sum%2==0);
    }
}
