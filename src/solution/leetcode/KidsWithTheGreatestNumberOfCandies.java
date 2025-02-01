package solution.leetcode;

import java.util.ArrayList;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int maxCandy = maxOfArray(candies);
        for(int i = 0; i<candies.length; i++){
            if((candies[i]+extraCandies)>=maxCandy)
                result.add(true);
            else
                result.add(false);
        }
        return result;
    }

    public int maxOfArray(int[] arr){
        int max = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>max) max = arr[i];
        }
        return max;
    }
}
