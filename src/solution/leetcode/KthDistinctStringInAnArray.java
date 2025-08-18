package solution.leetcode;


public class KthDistinctStringInAnArray {
    public static void main(String[] args) {
        KthDistinctStringInAnArray k = new KthDistinctStringInAnArray();
        System.out.println(k.kthDistinct(new String[]{"d","b","c","b","c","a"}, 2));//a
        System.out.println(k.kthDistinct(new String[]{"aaa","aa","a"}, 1));//aaa
        System.out.println(k.kthDistinct(new String[]{"a","b","a"}, 3));//""
    }
    public String kthDistinct(String[] arr, int k) {
        for(String i : arr){
            if(isDistinct(arr, i)){
                k--;
                if(k==0) return i;
            }
        }
        return "";
    }
    public boolean isDistinct(String[] arr, String a){
        int count = 0;
        for(String k: arr){
            if(k.equals(a)) count++;
        }
        return count==1;
    }
}
