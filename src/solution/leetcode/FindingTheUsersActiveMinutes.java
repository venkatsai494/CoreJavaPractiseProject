package solution.leetcode;

import java.util.*;

public class FindingTheUsersActiveMinutes {
    public static void main(String[] args) {
        FindingTheUsersActiveMinutes solution = new FindingTheUsersActiveMinutes();
        System.out.println(Arrays.toString(solution.findingUsersActiveMinutes(new int[][]{{0,5},{1,2},{0,2},{0,5},{1,3}}, 5)));
        System.out.println(Arrays.toString(solution.findingUsersActiveMinutes(new int[][]{{1,1},{2,2},{2,3}}, 4)));
        System.out.println(Arrays.toString(solution.findingUsersActiveMinutes(new int[][]{{1,1},{2,2},{3,3},{4,4},{5,5}}, 5)));
    }
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        int [] result = new int[k];
        Map<Integer, Set<Integer>> map = new HashMap<>();
        for (int[] log : logs) {
            if (!map.containsKey(log[0])) {
                Set<Integer> set = new HashSet<>();
                set.add(log[1]);
                map.put(log[0], set);
            } else {
                Set<Integer> set = map.get(log[0]);
                set.add(log[1]);
                map.put(log[0], set);
            }
        }
        List<Integer> list = new ArrayList<>(map.keySet());
        List<Integer> uamList = new ArrayList<>();
        for (Integer integer : list) {
            uamList.add(map.get(integer).size());
        }
        for (Integer integer : uamList) {
            result[integer - 1]++;
        }
        return result;
    }
}
