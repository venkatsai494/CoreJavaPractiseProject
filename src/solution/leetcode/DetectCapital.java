package solution.leetcode;

public class DetectCapital {
    public static void main(String[] args) {
        DetectCapital obj = new DetectCapital();
        System.out.println(obj.detectCapitalUse("USA")); // true
        System.out.println(obj.detectCapitalUse("FlaG")); // false
        System.out.println(obj.detectCapitalUse("leetcode")); // true
        System.out.println(obj.detectCapitalUse("Google")); // true
    }
    public boolean detectCapitalUse(String word) {
        if(word.length() == 1) return true;
        if(word.charAt(0)>96){
            for(int i = 1; i<word.length(); i++){
                if(word.charAt(i)<97) return false;
            }
        }
        else if(word.charAt(0)<91){
            if(word.charAt(1)<91){
                for(int i = 2; i<word.length(); i++){
                    if(word.charAt(i)>90) return false;
                }
            }
            else{
                for(int i = 1; i<word.length(); i++){
                    if(word.charAt(i)<97) return false;
                }
            }
        }
        return true;
    }
}
