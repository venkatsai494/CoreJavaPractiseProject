package solution.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinimumNumberOfOperationsToMakeArraysSimilar {
    public static void main(String[] args) {
        MinimumNumberOfOperationsToMakeArraysSimilar mnos = new MinimumNumberOfOperationsToMakeArraysSimilar();
        System.out.println(mnos.makeSimilar(new int[]{8,12,6}, new int[]{2,14,10}));
        System.out.println(mnos.makeSimilar(new int[]{1,2,5}, new int[]{4,1,3}));
        System.out.println(mnos.makeSimilar(new int[]{1,1,1,1,1}, new int[]{1,1,1,1,1}));
    }
    public long makeSimilar(int[] nums, int[] target) {
        long output = 0;
        List<Integer> numsEvenList = new ArrayList<>();
        List<Integer> numsOddList = new ArrayList<>();
        List<Integer> targetEvenList = new ArrayList<>();
        List<Integer> targetOddList = new ArrayList<>();
        for(int i : nums){
            if(i%2==0) numsEvenList.add(i);
            else numsOddList.add(i);
        }
        for(int i : target){
            if(i%2==0) targetEvenList.add(i);
            else targetOddList.add(i);
        }
        Collections.sort(numsEvenList);
        Collections.sort(targetEvenList);
        for(int i = 0; i<numsEvenList.size(); i++){
            output = output + Math.abs(numsEvenList.get(i) - targetEvenList.get(i));
        }
        Collections.sort(numsOddList);
        Collections.sort(targetOddList);
        for(int i = 0; i<numsOddList.size(); i++){
            output = output + Math.abs(numsOddList.get(i) - targetOddList.get(i));
        }
        return output/4;
    }
}
