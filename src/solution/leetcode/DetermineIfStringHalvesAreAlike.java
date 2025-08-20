package solution.leetcode;

public class DetermineIfStringHalvesAreAlike {
    public static void main(String[] args) {
        DetermineIfStringHalvesAreAlike di = new DetermineIfStringHalvesAreAlike();
        System.out.println(di.halvesAreAlike("book")); // true
        System.out.println(di.halvesAreAlike("textbook")); // false
        System.out.println(di.halvesAreAlike("MerryChristmas")); // false
        System.out.println(di.halvesAreAlike("AbCdEfGh")); // true
    }
    public boolean halvesAreAlike(String s) {
        String firsthalf = s.substring(0,(s.length()/2));
        String secondthalf = s.substring(s.length()/2);
        return countVowels(firsthalf)==countVowels(secondthalf);
    }
    public int countVowels(String s){
        int count = 0;
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U' || s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'){
                count++;
            }
        }
        return count;
    }
}
