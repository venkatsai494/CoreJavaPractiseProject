package solution.leetcode;

public class FindIfDigitGameCanBeWon {
    public static void main(String[] args) {
        FindIfDigitGameCanBeWon fd = new FindIfDigitGameCanBeWon();
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(fd.canAliceWin(nums));
    }
    public boolean canAliceWin(int[] nums) {
        int d = 0;
        int s = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i]<10) s = s + nums[i];
            else d = d + nums[i];
        }
        return (s!=d);
    }
}
