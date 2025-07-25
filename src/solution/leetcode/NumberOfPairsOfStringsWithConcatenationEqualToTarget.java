package solution.leetcode;

public class NumberOfPairsOfStringsWithConcatenationEqualToTarget {
    public static void main(String[] args) {
        NumberOfPairsOfStringsWithConcatenationEqualToTarget solution = new NumberOfPairsOfStringsWithConcatenationEqualToTarget();
        System.out.println(solution.numOfPairs(new String[]{"777","7","77","77"}, "7777")); // 4
        System.out.println(solution.numOfPairs(new String[]{"123","4","12","34"}, "1234")); // 2
        System.out.println(solution.numOfPairs(new String[]{"1","1","1"}, "11")); // 6
        System.out.println(solution.numOfPairs(new String[]{"1","2","3"}, "123")); // 0
    }
    public int numOfPairs(String[] nums, String target) {
        int count = 0;
        for(int i = 0; i<nums.length; i++){
            for(int j = 0; j<nums.length; j++){
                if(i != j && target.equals(nums[i]+nums[j])) count++;
            }
        }
        return count;
    }
}
