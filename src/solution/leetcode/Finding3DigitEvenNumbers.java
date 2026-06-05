package solution.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Finding3DigitEvenNumbers {
    public static void main(String[] args) {
        Finding3DigitEvenNumbers f = new Finding3DigitEvenNumbers();
        System.out.println(Arrays.toString(f.findEvenNumbers(new int[]{2,1,3,0}))); // [102,120,130,132,210,230,302,310,312, 320]
        System.out.println(Arrays.toString(f.findEvenNumbers(new int[]{2,2,8,8,2}))); // [222,228,282,288,822,828,882]
        System.out.println(Arrays.toString(f.findEvenNumbers(new int[]{3,7,5}))); // []
    }
    public int[] findEvenNumbers(int[] digits) {
        List<Integer> list = new ArrayList<>();
        int[] digitcount = new int[10];
        for (int digit : digits) {
            digitcount[digit]++;
        }
        for(int i = 100; i<999; i = i+2){
            int num = i;
            int[] temp = new int[10];
            temp[(num%10)]++;
            num = num/10;
            temp[(num%10)]++;
            num = num/10;
            temp[(num%10)]++;
            boolean flag = true;
            for(int j = 0; j<10; j++){
                if (temp[j] > digitcount[j]) {
                    flag = false;
                    break;
                }
            }
            if(flag){
                list.add(i);
            }
        }
        int[] result = new int[list.size()];
        for(int i = 0; i<list.size(); i++){
            result[i] = list.get(i);
        }
        return result;
    }
}
