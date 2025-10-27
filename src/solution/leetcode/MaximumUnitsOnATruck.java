package solution.leetcode;

import java.util.Arrays;

public class MaximumUnitsOnATruck {
    public static void main(String[] args) {
        MaximumUnitsOnATruck obj = new MaximumUnitsOnATruck();
        System.out.println(obj.maximumUnits(new int[][]{{1,3},{2,2},{3,1}}, 4)); // 8
        System.out.println(obj.maximumUnits(new int[][]{{5,10},{2,5},{4,7},{3,9}}, 10)); // 91
        System.out.println(obj.maximumUnits(new int[][]{{1,3},{2,2},{3,1}}, 3)); // 7
    }
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int totatUnits = 0;
        Arrays.sort(boxTypes, (a,b)->(b[1]-a[1]));
        for(int[] i : boxTypes){
            if(truckSize>=i[0]){
                totatUnits = totatUnits + (i[0]*i[1]);
                truckSize = truckSize - i[0];
            }
            else{
                totatUnits = totatUnits + truckSize*i[1];
                break;
            }
        }
        return totatUnits;
    }
}
