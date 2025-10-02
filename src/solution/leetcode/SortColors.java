package solution.leetcode;

public class SortColors {
    public static void main(String[] args) {
        SortColors sc = new SortColors();
        int[] nums1 = new int[]{2,0,2,1,1,0};
        sc.sortColors(nums1);
        for(int num : nums1){
            System.out.print(num + " ");
        }
        System.out.println();
        int[] nums2 = new int[]{2,0,1};
        sc.sortColors(nums2);
        for(int num : nums2){
            System.out.print(num + " ");
        }
        System.out.println();
        int[] nums3 = new int[]{0};
        sc.sortColors(nums3);
        for(int num : nums3){
            System.out.print(num + " ");
        }
        System.out.println();
        int[] nums4 = new int[]{1};
        sc.sortColors(nums4);
        for(int num : nums4){
            System.out.print(num + " ");
        }
    }
    public void sortColors(int[] nums) {
        for(int i = 0; i<nums.length; i++){
            for(int j = i+1; j <nums.length; j++){
                int temp = 0;
                if(nums[i]>nums[j]){
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }
}
