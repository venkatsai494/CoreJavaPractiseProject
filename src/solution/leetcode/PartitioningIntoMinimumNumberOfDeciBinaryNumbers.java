package solution.leetcode;

public class PartitioningIntoMinimumNumberOfDeciBinaryNumbers {
    public static void main(String[] args) {
        PartitioningIntoMinimumNumberOfDeciBinaryNumbers solution = new PartitioningIntoMinimumNumberOfDeciBinaryNumbers();
        System.out.println(solution.minPartitions("32")); // 3
        System.out.println(solution.minPartitions("82734")); // 8
        System.out.println(solution.minPartitions("27346209830709182346")); // 9
    }
    public int minPartitions(String n) {
        int result = 0;
        for(int i = 0; i<n.length(); i++){
            result = Math.max(result, n.charAt(i) - '0');
            if(result==9) break;
        }
        return result;
    }
}
