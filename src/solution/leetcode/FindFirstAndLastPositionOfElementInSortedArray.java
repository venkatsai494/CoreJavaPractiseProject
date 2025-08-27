package solution.leetcode;

import java.util.Arrays;

public class FindFirstAndLastPositionOfElementInSortedArray {
    public static void main(String[] args) {
        FindFirstAndLastPositionOfElementInSortedArray solution = new FindFirstAndLastPositionOfElementInSortedArray();
        System.out.println(Arrays.toString(solution.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8))); // Output: [3, 4]
        System.out.println(Arrays.toString(solution.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 6))); // Output: [-1, -1]
        System.out.println(Arrays.toString(solution.searchRange(new int[]{}, 0))); // Output: [-1, -1]
    }

    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[]{-1, -1};
        for (int i = 0; i < nums.length; i++) {
            if (result[0] == -1 && nums[i] == target) {
                result[0] = i;
            }
            if (nums[i] == target) {
                result[1] = i;
            }
        }
        return result;
    }
}
