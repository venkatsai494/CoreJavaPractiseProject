package solution.leetcode;

import java.util.Arrays;

public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        MedianOfTwoSortedArrays mtsa = new MedianOfTwoSortedArrays();
        System.out.println(mtsa.findMedianSortedArrays(new int[]{1, 3}, new int[]{2,4}));
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] mergedArray = new int[nums1.length + nums2.length];
        double output = 0;
        for (int i = 0; i < nums1.length; i++) {
            mergedArray[i] = nums1[i];
        }
        for (int j = nums1.length; j < mergedArray.length; j++) {
            mergedArray[j] = nums2[j - nums1.length];
        }
        Arrays.sort(mergedArray);
        if (mergedArray.length % 2 == 0) {
            output = (mergedArray[((mergedArray.length)/2)-1]+mergedArray[((mergedArray.length)/2)])/2.0;
        }
        else{
            output = mergedArray[((mergedArray.length)/2)];
        }
        return output;
    }
}
