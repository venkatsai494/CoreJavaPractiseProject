package solution.leetcode;

import java.util.ArrayList;
import java.util.List;

public class DecodeTheMessage {
    public static void main(String[] args) {
        DecodeTheMessage solution = new DecodeTheMessage();
        System.out.println(solution.decodeMessage("the quick brown fox jumps over the lazy dog", "vkbs bs t suepuv")); // Output: "this is a secret"
    }
    public String decodeMessage(String key, String message) {
        List<Character> characterList = new ArrayList<>();
        for(char c : key.replace(" ","").toCharArray()){
            if(!characterList.contains(c)) characterList.add(c);
        }
        System.out.println(characterList);
        StringBuilder sb = new StringBuilder();
        for(char c : message.toCharArray()){
            if(c == ' ') sb.append(" ");
            else{
                sb.append((char)(97+indexInList(c,characterList)));
            }
        }
        return sb.toString();
    }
    public int indexInList(char c, List<Character> cList){
        for(int i = 0; i<cList.size(); i++){
            if(cList.get(i) == c) return i;
        }
        return -1;
    }
}
