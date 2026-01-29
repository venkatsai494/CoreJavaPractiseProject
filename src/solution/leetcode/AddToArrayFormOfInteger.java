package solution.leetcode;

import java.util.ArrayList;
import java.util.List;

public class AddToArrayFormOfInteger {
    public static void main(String[] args) {
        AddToArrayFormOfInteger obj = new AddToArrayFormOfInteger();
        System.out.println(obj.addToArrayForm(new int[]{1,2,0,0}, 34));
        System.out.println(obj.addToArrayForm(new int[]{2,7,4}, 181));
        System.out.println(obj.addToArrayForm(new int[]{2,1,5}, 806));
    }
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> result = new ArrayList<>();
        int carry = 0;
        int i = num.length-1;
        while (k > 0 || i >=0) {
            int temp = carry + (k%10) + num[i];
            k = k/10;
            i--;
            if(temp>=10){
                temp = temp%10;
                result.add(temp);
                carry = 1;
            }
            else{
                carry = 0;
                result.add(temp);
            }
            if(i<0 && carry>0){
                result.add(1);
            }
        }
        return result.reversed();
    }
}
