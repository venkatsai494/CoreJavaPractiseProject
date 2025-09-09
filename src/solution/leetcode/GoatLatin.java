package solution.leetcode;

public class GoatLatin {
    public static void main(String[] args) {
        GoatLatin g = new GoatLatin();
        System.out.println(g.toGoatLatin("I speak Goat Latin")); // "Imaa peaksmaaa oatGmaaaa atinLmaaaaa"
        System.out.println(g.toGoatLatin("The quick brown fox jumped over the lazy dog")); // "heTmaa uickqmaaa ownbrmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa"
    }
    public String toGoatLatin(String sentence) {
        String[] sArray = sentence.split(" ");
        StringBuilder appender = new StringBuilder("aa");
        StringBuilder sb = new StringBuilder();
        for(String s: sArray){
            sb.append(formatted(s)).append(appender).append(" ");
            appender.append("a");
        }
        return sb.toString().trim();
    }
    public String formatted(String s){
        if(s.charAt(0) == 'a' ||
           s.charAt(0) == 'e' ||
           s.charAt(0) == 'i' ||
           s.charAt(0) == 'o' ||
           s.charAt(0) == 'u' ||
           s.charAt(0) == 'A' ||
           s.charAt(0) == 'E' ||
           s.charAt(0) == 'I' ||
           s.charAt(0) == 'O' ||
           s.charAt(0) == 'U'
        ){
            return s+"m";
        }
        else{
            return s.substring(1)+s.charAt(0)+"m";
        }
    }
}
