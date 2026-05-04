package solution.leetcode;

public class OptimalPartitionOfString {
    public static void main(String[] args) {
        OptimalPartitionOfString optimalPartitionOfString = new OptimalPartitionOfString();
        System.out.println(optimalPartitionOfString.partitionString("abacaba"));
        System.out.println(optimalPartitionOfString.partitionString("ssssss"));
    }
    public int partitionString(String s) {
        int count = 1;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if(sb.toString().contains(s.charAt(i)+"")){
                sb = new StringBuilder(s.charAt(i)+"");
                count++;
            }
            else{
                sb.append(s.charAt(i));
            }
        }
        return count;
    }
}
