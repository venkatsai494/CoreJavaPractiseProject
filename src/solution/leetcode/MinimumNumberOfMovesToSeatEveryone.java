package solution.leetcode;

import java.util.Arrays;

public class MinimumNumberOfMovesToSeatEveryone {
    public static void main(String[] args) {
        MinimumNumberOfMovesToSeatEveryone mn = new MinimumNumberOfMovesToSeatEveryone();
        System.out.println(mn.minMovesToSeat(new int[]{3, 1, 5}, new int[]{2, 7, 4}));
        System.out.println(mn.minMovesToSeat(new int[]{4, 1, 5, 9}, new int[]{1, 3, 2, 6}));
        System.out.println(mn.minMovesToSeat(new int[]{2, 2, 6, 6}, new int[]{1, 3, 2, 6}));
    }
    public int minMovesToSeat(int[] seats, int[] students) {
        int output = 0;
        Arrays.sort(seats);
        Arrays.sort(students);
        for(int i = 0; i<seats.length; i++){
            output += Math.abs(seats[i] - students[i]);
        }
        return output;
    }
}
