package solution.leetcode;

import java.util.Arrays;

public class NumberOfLinesToWriteString {
    public static void main(String[] args) {
        NumberOfLinesToWriteString n = new NumberOfLinesToWriteString();
        System.out.println(Arrays.toString(n.numberOfLines(new int[]{10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10}, "abcdefghijklmnopqrstuvwxyz")));
        System.out.println(Arrays.toString(n.numberOfLines(new int[]{4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10}, "bbbcccdddaaa")));
    }
    public int[] numberOfLines(int[] widths, String s) {
        int [] output = new int[2];
        int remainingwidth = 100;
        int count = 1;
        for(int i = 0 ; i<s.length(); i++){
            if(widths[s.charAt(i)-97]<=remainingwidth){
                remainingwidth -= widths[s.charAt(i)-97];
            }
            else{
                count++;
                remainingwidth = 100;
                remainingwidth -= widths[s.charAt(i)-97];
            }
        }
        output[0] = count;
        output[1] = 100 - remainingwidth;
        return output;
    }
}
