package solution.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaximumProductOfTwoDigits {
    public static void main(String[] args) {
        MaximumProductOfTwoDigits solution = new MaximumProductOfTwoDigits();
        System.out.println(solution.maxProduct(29)); // Output: 18
        System.out.println(solution.maxProduct(34)); // Output: 12
        System.out.println(solution.maxProduct(99)); // Output: 81
        System.out.println(solution.maxProduct(10)); // Output: 0
        System.out.println(solution.maxProduct(124)); // Output: 8
    }
    public int maxProduct(int n) {
        List<Integer> list = new ArrayList<>();
        while(n>0){
            list.add(n%10);
            n = n/10;
        }
        int size = list.size();
        Collections.sort(list);
        return list.get(size-1)*list.get(size-2);
    }
}
