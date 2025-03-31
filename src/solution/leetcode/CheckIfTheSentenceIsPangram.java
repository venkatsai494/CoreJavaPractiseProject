package solution.leetcode;

public class CheckIfTheSentenceIsPangram {
    public static void main(String[] args) {
        CheckIfTheSentenceIsPangram cisp = new CheckIfTheSentenceIsPangram();
        System.out.println(cisp.checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));
        System.out.println(cisp.checkIfPangram("leetcode"));
    }
    public boolean checkIfPangram(String sentence) {
        String s1 = "abcdefghijklmnopqrstuvwxyz";
        for(int i = 0; i<s1.length(); i++){
            if(!sentence.contains(String.valueOf(s1.charAt(i)))){
                return false;
            }
        }
        return true;
    }
}
