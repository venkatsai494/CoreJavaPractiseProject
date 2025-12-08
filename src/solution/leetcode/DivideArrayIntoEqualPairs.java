package solution.leetcode;

public class DivideArrayIntoEqualPairs {
    public static void main(String[] args) {
        DivideArrayIntoEqualPairs obj = new DivideArrayIntoEqualPairs();
        System.out.println(obj.divideArray(new int[]{3,2,3,2,2,2})); // true
        System.out.println(obj.divideArray(new int[]{1,2,3,4})); // false
        System.out.println(obj.divideArray(new int[]{1,1,2,2,2,2})); // true
    }
    public boolean divideArray(int[] nums) {
        int [] arr = new int[501];
        for(int num: nums){
            arr[num]++;
        }
        for(int i : arr){
            if(i%2==1) return false;
        }
        return true;
    }
}
