package solution.leetcode;

import java.util.Arrays;

public class TakeGiftsFromTheRichestPile {
    public static void main(String[] args) {
        TakeGiftsFromTheRichestPile solution = new TakeGiftsFromTheRichestPile();
        System.out.println(solution.pickGifts(new int[]{25, 64, 9, 4, 100}, 4)); // Output: 29
        System.out.println(solution.pickGifts(new int[]{1, 1, 1, 1}, 4)); // Output: 4
        System.out.println(solution.pickGifts(new int[]{16, 9, 64}, 2)); // Output: 25
        System.out.println(solution.pickGifts(new int[]{56,41,27,71,62,57,67,34,8,71,2,12,52,1,64,43,32,42,9,25,73,29,31}, 52)); // Output : 32
    }
    public long pickGifts(int[] gifts, int k) {
        long sum = 0;
        while(k>0){
            int max = Arrays.stream(gifts).max().orElse(0);
            for(int i = 0; i<gifts.length; i++){
                if(gifts[i] == max) {
                    gifts[i] = (int)Math.sqrt(gifts[i]);
                    break;
                }
            }
            k--;
        }
        for(int i : gifts){
            sum += i;
        }
        return sum;
    }
}
