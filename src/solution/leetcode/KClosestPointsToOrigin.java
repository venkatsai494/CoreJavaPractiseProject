package solution.leetcode;

import java.util.*;

public class KClosestPointsToOrigin {
    public static void main(String[] args) {
        KClosestPointsToOrigin kcp = new KClosestPointsToOrigin();
        System.out.println(Arrays.deepToString(kcp.kClosest(new int[][]{{1,3},{-2,2}}, 1))); // [[-2,2]]
        System.out.println(Arrays.deepToString(kcp.kClosest(new int[][]{{3,3},{5,-1},{-2,4}}, 2))); // [[3,3],[-2,4]]
    }
    public int[][] kClosest(int[][] points, int k) {
        Map<Integer, Integer> map = new HashMap<>(); //Key is the index and value is the distance from {0,0} coordinate
        for(int i = 0; i<points.length; i++){
            map.put(i, ((points[i][0]*points[i][0])+(points[i][1]*points[i][1])));
        }
        List<Integer> index = new ArrayList<>(map.keySet());
        List<Integer> list = new ArrayList<>();
        index.sort(Comparator.comparingInt(map::get));
        int a = 0;
        while(a<k){
            list.add(index.get(a));
            a++;
        }
        int [][] result = new int[k][2];
        for(int i = 0; i<k; i++){
            result[i][0] = points[list.get(i)][0];
            result[i][1] = points[list.get(i)][1];
        }
        return result;
    }
}
