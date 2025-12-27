package solution.leetcode;

public class CheckIfAllAsAppearsBeforeAllBs {
    public static void main(String[] args) {
        CheckIfAllAsAppearsBeforeAllBs checkIfAllAsAppearsBeforeAllBs = new CheckIfAllAsAppearsBeforeAllBs();
        System.out.println(checkIfAllAsAppearsBeforeAllBs.checkString("aaabbb"));
        System.out.println(checkIfAllAsAppearsBeforeAllBs.checkString("abab"));
        System.out.println(checkIfAllAsAppearsBeforeAllBs.checkString("bbb"));
    }
    public boolean checkString(String s) {
        boolean bstarts = false;
        for(char c: s.toCharArray()){
            if(!bstarts && c=='b') bstarts = true;
            if(bstarts && c=='a') return false;
        }
        return true;
    }
}
