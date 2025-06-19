package solution.leetcode;

public class FindTheDistanceValueBetweenTwoArrays {
    public static void main(String[] args) {
        FindTheDistanceValueBetweenTwoArrays solution = new FindTheDistanceValueBetweenTwoArrays();
        System.out.println(solution.findTheDistanceValue(new int[]{4,5,8}, new int[]{10,9,1,8}, 2)); // 2
        System.out.println(solution.findTheDistanceValue(new int[]{1,4,2,3}, new int[]{-4,-3,6,10,20,30}, 3)); // 2
        System.out.println(solution.findTheDistanceValue(new int[]{2,1,100,3}, new int[]{-5,-2,10,-3,7}, 6)); // 1
    }
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count = 0;
        outerloop:
        for(int i : arr1){
            for(int j : arr2){
                if(Math.abs(i - j)<=d) continue outerloop;
            }
            count++;
        }
        return count;
    }
}
