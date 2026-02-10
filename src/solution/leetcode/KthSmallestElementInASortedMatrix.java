package solution.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KthSmallestElementInASortedMatrix {
    public static void main(String[] args) {
        KthSmallestElementInASortedMatrix solution = new KthSmallestElementInASortedMatrix();
        System.out.println(solution.kthSmallest(new int[][] {{1,5,9},{10,11,13},{12,13,15}}, 8));
        System.out.println(solution.kthSmallest(new int[][] {{-5}}, 1));
    }
    public int kthSmallest(int[][] matrix, int k) {
        List<Integer> list = new ArrayList<>();
        for (int[] ints : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                list.add(ints[j]);
            }
        }
        Collections.sort(list);
        return list.get(k-1);
    }
}
