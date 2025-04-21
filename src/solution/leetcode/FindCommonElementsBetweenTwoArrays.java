package solution.leetcode;

public class FindCommonElementsBetweenTwoArrays {
    public static void main(String[] args) {
        FindCommonElementsBetweenTwoArrays fce = new FindCommonElementsBetweenTwoArrays();
        int[] output = fce.findIntersectionValues(new int[]{2,3,2}, new int[]{1,2});
        System.out.println("{" + output[0] + "," + output[1] + "}");
        int[] output2 = fce.findIntersectionValues(new int[]{4,3,2,3,1}, new int[]{2,2,5,2,3,6});
        System.out.println("{" + output2[0] + "," + output2[1] + "}");
    }
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int[] output = new int[2];
        output[0] = findNumberOfTimes(nums1, nums2);
        output[1] = findNumberOfTimes(nums2, nums1);
        return output;
    }
    public int findNumberOfTimes(int[] nums1, int[] nums2){
        int output = 0;
        for(int i = 0; i<nums1.length; i++){
            for(int j = 0; j<nums2.length; j++){
                if(nums1[i] == nums2[j]){
                    output++;
                    break;
                }
            }
        }
        return output;
    }

}
