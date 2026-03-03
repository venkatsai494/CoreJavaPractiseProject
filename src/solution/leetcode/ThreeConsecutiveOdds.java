package solution.leetcode;

public class ThreeConsecutiveOdds {
    public static void main(String[] args) {
        ThreeConsecutiveOdds threeConsecutiveOdds = new ThreeConsecutiveOdds();
        System.out.println(threeConsecutiveOdds.threeConsecutiveOdds(new int[]{2,6,4,1}));
        System.out.println(threeConsecutiveOdds.threeConsecutiveOdds(new int[]{1,2,34,3,4,5,7,23,12}));
    }
    public boolean threeConsecutiveOdds(int[] arr) {
        int l = arr.length;
        if(l<3) return false;
        for(int i = 1; i<l-1; i++){
            if(arr[i-1]%2==1 && arr[i]%2==1 && arr[i+1]%2==1) return true;
        }
        return false;
    }
}
