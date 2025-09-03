package solution.leetcode;

public class StrongPasswordCheckerII {
    public static void main(String[] args) {
        StrongPasswordCheckerII s = new StrongPasswordCheckerII();
        System.out.println(s.strongPasswordCheckerII("IloveLe3tcode!"));
        System.out.println(s.strongPasswordCheckerII("Me+You--IsMyDream"));
        System.out.println(s.strongPasswordCheckerII("1aB!"));
    }
    public boolean strongPasswordCheckerII(String password) {
        return (password.length()>=8
                && atleastOneLowerCase(password)
                && atleastOneUpperCase(password)
                && atLeastOneDigit(password)
                && atLeastOneSpecialSymbol(password)
                && doesntHasRepeatingAdjacentCharacter(password));
    }
    public boolean atleastOneLowerCase(String word){
        for(char c: word.toCharArray()){
            if(Character.isLowerCase(c)) return true;
        }
        return false;
    }
    public boolean atleastOneUpperCase(String word){
        for(char c: word.toCharArray()){
            if(Character.isUpperCase(c)) return true;
        }
        return false;
    }
    public boolean atLeastOneDigit(String word){
        for(char c: word.toCharArray()){
            if(Character.isDigit(c)) return true;
        }
        return false;
    }
    public boolean atLeastOneSpecialSymbol(String word){
        for(char c: word.toCharArray()){
            if(c=='!' || c=='@' || c=='#' || c=='$' || c=='%' || c=='^' || c=='&' || c=='*' || c=='(' || c==')' || c=='-' || c=='+') return true;
        }
        return false;
    }
    public boolean doesntHasRepeatingAdjacentCharacter(String word){
        char[] arr = word.toCharArray();
        for(int i = 1; i<arr.length; i++){
            if(arr[i] == arr[i-1]) return false;
        }
        return true;
    }

}
