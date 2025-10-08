package solution.leetcode;

public class AddingSpacesToAString {
    public static void main(String[] args) {
        AddingSpacesToAString obj = new AddingSpacesToAString();
        System.out.println(obj.addSpaces("LeetcodeHelpsMeLearn", new int[]{8,13,15})); // "Leetcode Helps Me Learn"
        System.out.println(obj.addSpaces("icodeinpython", new int[]{1,5,7,9}));
        System.out.println(obj.addSpaces("spacing", new int[]{0,1,2,3,4,5,6}));
    }
    public String addSpaces(String s, int[] spaces) {
        StringBuilder sb = new StringBuilder();
        int index = 0;
        for(int i = 0; i<s.length(); i++){
            if(index<spaces.length && i == spaces[index]){
                sb.append(" ");
                index++;
                i--;
            }
            else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
