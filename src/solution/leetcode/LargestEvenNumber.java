package solution.leetcode;

public class LargestEvenNumber {
    public static void main(String[] args) {
        LargestEvenNumber len = new LargestEvenNumber();
        System.out.println(len.largestEven("1112"));
        System.out.println(len.largestEven("221"));
        System.out.println(len.largestEven("1"));
    }
    public String largestEven(String s) {
        for(int i = s.length()-1; i>=0; i--){
            if(s.charAt(i)=='2') return s.substring(0,i+1);
        }
        return "";
    }
}
