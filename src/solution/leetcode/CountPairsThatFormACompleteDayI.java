package solution.leetcode;

public class CountPairsThatFormACompleteDayI {
    public static void main(String[] args) {
        CountPairsThatFormACompleteDayI cp = new CountPairsThatFormACompleteDayI();
        System.out.println(cp.countCompleteDayPairs(new int[]{12,12,30,24,24}));
        System.out.println(cp.countCompleteDayPairs(new int[]{72,48,24,3}));
    }
    public int countCompleteDayPairs(int[] hours) {
        int output = 0;
        for(int i = 0; i<hours.length; i++){
            for(int j =i+1; j<hours.length; j++){
                if((hours[i]+hours[j])%24==0) output++;
            }
        }
        return output;
    }
}
