package solution.leetcode;

import java.util.Stack;

public class ClearDigits {
    public static void main(String[] args) {
        ClearDigits solution = new ClearDigits();
        System.out.println(solution.clearDigits("abc"));
        System.out.println(solution.clearDigits("cb34"));
        System.out.println(solution.clearDigits("a1b2c3d4e5f6g7h8i9j0"));
        System.out.println(solution.clearDigits("123abc456def789ghi"));
        System.out.println(solution.clearDigits("abc123def456"));
        System.out.println(solution.clearDigits("noDigitsHere"));
        System.out.println(solution.clearDigits("1a2b3c4d5e6f7g8h9i0"));
    }
    public String clearDigits(String s) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i<s.length(); i++){
            if(isDigit(s.charAt(i))){
                if(!stack.isEmpty())
                    stack.pop();
            }
            else{
                stack.push(s.charAt(i));
            }
        }
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
    public boolean isDigit(char c){
        try{
            Integer.parseInt(String.valueOf(c));
        }
        catch (NumberFormatException e){
            return false;
        }
        return true;
    }
}
