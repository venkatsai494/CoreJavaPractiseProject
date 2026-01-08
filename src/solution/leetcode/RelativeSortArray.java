package solution.leetcode;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RelativeSortArray {
    public static void main(String[] args) {
        RelativeSortArray rsa = new RelativeSortArray();
        System.out.println(Arrays.toString(rsa.relativeSortArray(new int[]{2,3,1,3,2,4,6,7,9,2,19}, new int[]{2,1,4,3,9,6})));
        System.out.println(Arrays.toString(rsa.relativeSortArray(new int[]{28,6,22,8,44,17}, new int[]{22,28,8,6})));
    }
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<arr2.length; i++){
            map.put(arr2[i], i);
        }
        List<Integer> list2 = Arrays.stream(arr2).boxed().toList();
        List<Integer> listContainingInArr2 = Arrays.stream(arr1).filter(list2::contains).boxed().collect(Collectors.toList());
        List<Integer> listNotContainingInArr2 = Arrays.stream(arr1).filter(a->!list2.contains(a)).boxed().collect(Collectors.toList());
        listContainingInArr2.sort(Comparator.comparingInt(map::get));
        Collections.sort(listNotContainingInArr2);
        List<Integer> mergedList = Stream.of(listContainingInArr2, listNotContainingInArr2).flatMap(Collection::stream).toList();
        int[] result = new int[arr1.length];
        for(int i = 0; i<result.length; i++){
            result[i] = mergedList.get(i);
        }
        return result;
    }
}
