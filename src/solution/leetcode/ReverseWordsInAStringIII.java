package solution.leetcode;

public class ReverseWordsInAStringIII {
    public static void main(String[] args) {
        ReverseWordsInAStringIII rw = new ReverseWordsInAStringIII();
        System.out.println(rw.reverseWords("Let's take LeetCode contest"));
    }

    public String reverseWords(String s) {
        String [] arr = s.split(" ");
        StringBuilder sb = new StringBuilder("");
        for(int i = 0; i<arr.length; i++){
            sb.append(reverse(arr[i])).append(" ");
        }
        return sb.toString().trim();
    }
    public String reverse(String s){
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }
}
