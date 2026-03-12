package solution.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GroupThePeopleGivenTheGroupSizeTheyBelongTo {
    public static void main(String[] args) {
        GroupThePeopleGivenTheGroupSizeTheyBelongTo groupThePeopleGivenTheGroupSizeTheyBelongTo = new GroupThePeopleGivenTheGroupSizeTheyBelongTo();
        System.out.println(groupThePeopleGivenTheGroupSizeTheyBelongTo.groupThePeople(new int[]{3,3,3,3,3,1,3}));
        System.out.println(groupThePeopleGivenTheGroupSizeTheyBelongTo.groupThePeople(new int[]{2,1,3,3,3,2}));
    }
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> groups = Arrays.stream(groupSizes).distinct().sorted().boxed().toList();
        List<Integer> temp = new ArrayList<>();
        for (Integer group : groups) {
            for (int j = 0; j < groupSizes.length; j++) {
                if (group == groupSizes[j]) {
                    temp.add(j);
                }
                if (temp.size() == group) {
                    result.add(temp);
                    temp = new ArrayList<>();
                }
            }
        }
        return result;
    }
}
