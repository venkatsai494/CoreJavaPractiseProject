package solution.leetcode;

import java.util.ArrayList;
import java.util.List;

public class ToggleLightBulbs {
    public static void main(String[] args) {
        ToggleLightBulbs toggleLightBulbs = new ToggleLightBulbs();
        System.out.println(toggleLightBulbs.toggleLightBulbs(List.of(10,30,20,10)));
    }
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        List<Integer> result = new ArrayList<>();
        int[] poles = new int[101];
        for(int i : bulbs){
            poles[i] = poles[i]^1;
        }
        for(int i = 0; i<poles.length; i++){
            if(poles[i]!=0){
                result.add(i);
            }
        }
        return result;
    }
}
