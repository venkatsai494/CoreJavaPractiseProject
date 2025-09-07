package solution.leetcode;

import java.util.ArrayList;
import java.util.List;

public class PathCrossing {
    public static void main(String[] args) {
        PathCrossing pc = new PathCrossing();
//        System.out.println(pc.isPathCrossing("NES")); //false
        System.out.println(pc.isPathCrossing("NESWW")); //true
    }
    public boolean isPathCrossing(String path) {
        int x = 0;
        int y = 0;
        List<String> list = new ArrayList<>();
        list.add("0,0");
        for(int i = 0; i<path.length(); i++){
            if(path.charAt(i) == 'N'){
                x++;
            }
            else if(path.charAt(i) == 'S'){
                x--;
            }
            else if(path.charAt(i) == 'E'){
                y++;
            }
            else if(path.charAt(i) == 'W'){
                y--;
            }
            if(list.contains(x+","+y)){
                return true;
            }
            else{
                list.add(x+","+y);
            }
        }
        return false;
    }
}
