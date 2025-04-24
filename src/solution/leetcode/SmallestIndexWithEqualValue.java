package solution.leetcode;

public class SmallestIndexWithEqualValue {
    public static void main(String[] args) {
        SmallestIndexWithEqualValue si = new SmallestIndexWithEqualValue();
        System.out.println(si.smallestEqual(new int[]{0,1,2}));
        System.out.println(si.smallestEqual(new int[]{4,3,2,1}));
        System.out.println(si.smallestEqual(new int[]{1,2,3,4,5,6,7,8,9,0}));
        System.out.println(si.smallestEqual(new int[]{0,1,2,3}));
        System.out.println(si.smallestEqual(new int[]{4,3,2,1}));
        System.out.println(si.smallestEqual(new int[]{1,2,3,4}));
        System.out.println(si.smallestEqual(new int[]{0,0,0,0}));
        System.out.println(si.smallestEqual(new int[]{5,5,5,5}));
        System.out.println(si.smallestEqual(new int[]{7,8,3,5,2,6,3,1,1,4,5,4,8,7,2,0,9,9,0,5,7,1,6}));
    }
    public int smallestEqual(int[] nums) {
        for(int i = 0; i<nums.length; i++){
            if((i%10) == nums[i]) return i;
        }
        return -1;
    }
}
