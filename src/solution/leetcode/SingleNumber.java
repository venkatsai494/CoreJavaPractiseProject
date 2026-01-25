package solution.leetcode;
public class SingleNumber {

    public static void main(String[] args) {
        SingleNumber sn = new SingleNumber();
        System.out.println(sn.singleNumber(new int[]{2,2,1}));
        System.out.println(sn.singleNumber(new int[]{4,1,2,1,2}));
        System.out.println(sn.singleNumber(new int[]{1}));
    }
    public int singleNumber(int[] nums) {
        int output = 0;
        for(int num : nums){
            output = output ^ num;
        }
        return output;
    }

}
