package solution.leetcode;

import java.util.ArrayList;
import java.util.List;

public class TwoKeysKeyboard {
    public static void main(String[] args) {
        TwoKeysKeyboard twoKeysKeyboard = new TwoKeysKeyboard();
        System.out.println(twoKeysKeyboard.minSteps(3));
        System.out.println(twoKeysKeyboard.minSteps(1));
        System.out.println(twoKeysKeyboard.minSteps(4));
        System.out.println(twoKeysKeyboard.minSteps(8));
    }
    public int minSteps(int n) {
        int sum = 0;
        List<Integer> list = new ArrayList<>();
        int divisor = 2;
        while(n>1){
            while(n%divisor==0){
                list.add(divisor);
                n = n/divisor;
                if(n==0) break;
            }
            divisor++;
        }
        for(int i : list){
            sum += i;
        }
        return sum;
    }
}
