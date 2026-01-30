package solution.leetcode;

import java.util.Stack;

public class MakeTheStringGreat {
    public static void main(String[] args) {
        MakeTheStringGreat solution = new MakeTheStringGreat();
        System.out.println(solution.makeGood("leEeetcode")); // Output: "leetcode"
        System.out.println(solution.makeGood("abBAcC")); // Output: ""
        System.out.println(solution.makeGood("s")); // Output: "s"
        System.out.println(solution.makeGood("Pp"));
        System.out.println(solution.makeGood("hHcOzoC"));
    }
    public String makeGood(String s) {
        Stack<Character> stack = new Stack<>();
        stack.push(s.charAt(0));
        for(int i = 1; i<s.length(); i++){
            try{
                if(stack.isEmpty() || ((stack.peek()-32!=(int)s.charAt(i)) && (stack.peek()+32!=(int)s.charAt(i)))){
                    stack.push(s.charAt(i));
                }
                else{
                    stack.pop();
                }
            }
            catch (Exception ignored){

            }
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.empty()){
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}
