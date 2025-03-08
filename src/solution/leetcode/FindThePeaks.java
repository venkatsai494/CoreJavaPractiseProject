package solution.leetcode;

import java.util.ArrayList;
import java.util.List;

public class FindThePeaks {
    public static void main(String[] args) {
        FindThePeaks fp = new FindThePeaks();
        System.out.println(fp.findPeaks(new int[]{1,2,3,4,5,6,7,6,5,4,3,2,1}));
    }


    public List<Integer> findPeaks(int[] mountain) {
        List<Integer> output = new ArrayList<>();
        for(int i = 1; i<mountain.length-1; i++){
            if((mountain[i]>mountain[i-1])&&(mountain[i]>mountain[i+1]))    output.add(i);
        }
        return output;
    }
}
