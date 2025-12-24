package solution.leetcode;

import java.util.HashMap;
import java.util.Map;

public class BullsAndCows {
    public static void main(String[] args) {
        BullsAndCows bc = new BullsAndCows();
        System.out.println(bc.getHint("1807", "7810")); // Output: "1A3B"
        System.out.println(bc.getHint("1123", "0111")); // Output: "1A1B"
    }
    public String getHint(String secret, String guess) {
        int bull = 0;
        int cow = 0;
        Map<Integer, Integer> secretMap = new HashMap<>();
        for(int i = 0; i<secret.length(); i++){
            if(secretMap.containsKey((int) secret.charAt(i))){
                secretMap.put((int) secret.charAt(i), secretMap.get((int) secret.charAt(i))+1);
            }
            else{
                secretMap.put((int) secret.charAt(i), 1);
            }
        }
        for(int i = 0; i<secret.length(); i++){
            if(secret.charAt(i)==guess.charAt(i)) {
                secretMap.put((int) secret.charAt(i), secretMap.get((int) secret.charAt(i))-1);
                bull++;
            }
        }
        for(int i = 0; i<guess.length(); i++){
            if((secret.charAt(i) != guess.charAt(i)) && (secretMap.get((int) guess.charAt(i))!=null) && (secretMap.get((int) guess.charAt(i))>0)){
                secretMap.put((int) guess.charAt(i), secretMap.get((int) guess.charAt(i))-1);
                cow++;
            }
        }
        StringBuilder sb = new StringBuilder();
        return sb.append(bull).append("A").append(cow).append("B").toString();
    }
}
