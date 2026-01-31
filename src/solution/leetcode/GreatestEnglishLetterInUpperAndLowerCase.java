package solution.leetcode;

public class GreatestEnglishLetterInUpperAndLowerCase {
    public static void main(String[] args) {
        GreatestEnglishLetterInUpperAndLowerCase obj = new GreatestEnglishLetterInUpperAndLowerCase();
        System.out.println(obj.greatestLetter("lEeTcOdE")); // Output: "E"
        System.out.println(obj.greatestLetter("arRAzFif")); // Output: "R"
        System.out.println(obj.greatestLetter("AbCdEfGhIjK")); // Output: ""
    }
    public String greatestLetter(String s) {
        char c = 0;
        int[] arr = new int[58];
        for(int i = 0; i<s.length(); i++){
            arr[s.charAt(i) - 65]++;
        }
        for(int i = 0; i<26; i++){
            if(arr[i]!=0 && arr[i+32]!=0) {
                c = (char)(i+65);
            }
        }
        return c==0?"":String.valueOf(c);
    }
}
