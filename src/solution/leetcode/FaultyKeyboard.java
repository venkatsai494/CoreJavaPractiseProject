package solution.leetcode;

public class FaultyKeyboard {
    public static void main(String[] args) {
        FaultyKeyboard fk = new FaultyKeyboard();
        System.out.println(fk.finalString("venkat"));
        System.out.println(fk.finalString("string"));
        System.out.println(fk.finalString("poiinter"));
        System.out.println(fk.finalString("venkat sai ratan kumar parpelli"));

    }
    public String finalString(String s) {
//        if(s.indexOf('i')<0) return s;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i)=='i'){
                sb.reverse();
            }
            else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }

}
