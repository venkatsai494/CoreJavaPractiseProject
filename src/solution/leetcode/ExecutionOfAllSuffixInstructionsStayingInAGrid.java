package solution.leetcode;

import java.util.Arrays;

public class ExecutionOfAllSuffixInstructionsStayingInAGrid {
    public static void main(String[] args) {
        ExecutionOfAllSuffixInstructionsStayingInAGrid solution = new ExecutionOfAllSuffixInstructionsStayingInAGrid();
        System.out.println(Arrays.toString(solution.executeInstructions(3, new int[]{0,1}, "RRDDLU"))); // Output: [1,5,4,3,1,0]
        System.out.println(Arrays.toString(solution.executeInstructions(2, new int[]{1,1}, "LURD"))); // Output: [4,1,0,0]
        System.out.println(Arrays.toString(solution.executeInstructions(1, new int[]{0,0}, "LRUD"))); // Output: [0,0,0,0]
    }
    public int[] executeInstructions(int n, int[] startPos, String s) {
        int [] answer = new int[s.length()];
        for(int i = 0; i<s.length(); i++){
            int x = startPos[0];
            int y = startPos[1];
            int count = 0;
            for(int j = i; j<s.length(); j++){
                if(s.charAt(j) == 'U'){
                    if(x>0){
                        x--;
                        count++;
                    }
                    else{
                        break;
                    }
                }
                else if(s.charAt(j) == 'R'){
                    if(y+1<=n-1){
                        y++;
                        count++;
                    }
                    else{
                        break;
                    }
                }
                else if(s.charAt(j) == 'D'){
                    if(x+1<=n-1){
                        x++;
                        count++;
                    }
                    else{
                        break;
                    }
                }
                else if(s.charAt(j) == 'L'){
                    if(y>0){
                        y--;
                        count++;
                    }
                    else{
                        break;
                    }
                }
            }
            answer[i] = count;
        }
        return answer;
    }
}
