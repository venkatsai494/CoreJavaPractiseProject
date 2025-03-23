package solution.leetcode;

import java.util.ArrayList;
import java.util.List;

public class FindIndicesOfStableMountains {
    public static void main(String[] args) {
        FindIndicesOfStableMountains fp = new FindIndicesOfStableMountains();
        System.out.println(fp.stableMountains(new int[]{1,2,3,4,5}, 2));
        System.out.println(fp.stableMountains(new int[]{1,2,3,4,5,6,7,6,5,4,3,2,1}, 5));
    }
    public List<Integer> stableMountains(int[] height, int threshold) {
        List<Integer> output = new ArrayList();
        for(int i = 1; i<height.length; i++){
            if(height[i-1]>threshold) output.add(i);
        }
        return output;
    }
}
