package solution.leetcode;

import java.util.ArrayList;
import java.util.List;

public class BuildAnArrayWithStackOperations {
    public static void main(String[] args) {
        BuildAnArrayWithStackOperations buildAnArrayWithStackOperations = new BuildAnArrayWithStackOperations();
        System.out.println(buildAnArrayWithStackOperations.buildArray(new int[]{1,3}, 3));
        System.out.println(buildAnArrayWithStackOperations.buildArray(new int[]{1,2,3}, 3));
        System.out.println(buildAnArrayWithStackOperations.buildArray(new int[]{1,2}, 4));
    }
    public List<String> buildArray(int[] target, int n) {
        List<String> result = new ArrayList<>();
        int number = 1;
        for(int i = 0; i<target.length; i++){
            if(target[i] == number){
                result.add("Push");
                number++;
            }
            else{
                result.add("Push");
                result.add("Pop");
                number++;
                i--;
            }
        }
        return result;
    }
}
