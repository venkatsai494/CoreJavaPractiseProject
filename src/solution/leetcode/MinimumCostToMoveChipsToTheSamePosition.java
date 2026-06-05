package solution.leetcode;

public class MinimumCostToMoveChipsToTheSamePosition {
    public static void main(String[] args) {
        MinimumCostToMoveChipsToTheSamePosition solution = new MinimumCostToMoveChipsToTheSamePosition();
        System.out.println(solution.minCostToMoveChips(new int[]{1,2,3}));
        System.out.println(solution.minCostToMoveChips(new int[]{2,2,2,3,3}));
        System.out.println(solution.minCostToMoveChips(new int[]{1,1000000000}));
    }
    public int minCostToMoveChips(int[] position) {
        int len=position.length;
        int [] parityArr = new int[len];
        for(int i=0;i<len;i++){
            parityArr[i]=position[i]%2;
        }
        int diff = 0;
        for(int i: parityArr){
            diff+=i;
        }
        return Math.min(diff,len-diff);
    }
}
