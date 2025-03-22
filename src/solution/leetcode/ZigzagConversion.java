package solution.leetcode;

public class ZigzagConversion {
    public static void main(String[] args) {
        ZigzagConversion zc = new ZigzagConversion();
        System.out.println(zc.convert("PAYPALISHIRING", 3));
        System.out.println(zc.convert("PAYPALISHIRING", 4));
    }
    public String convert(String s, int numRows) {
        if(numRows==1) return s;
        char [][] charArray = new char[numRows][s.length()];
        int r = 0;
        int c = 0;
        boolean goingUp = false;
        for(int i = 0; i<s.length(); i++){
            if(!goingUp){
                charArray[r][c] = s.charAt(i);
                r++;
                if(r==numRows) {
                    goingUp = true;
                    r--;
                }
            }
            if(goingUp){
                charArray[r][c] = s.charAt(i);
                r--;
                c++;
                if(r==0) goingUp = false;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<charArray.length; i++){
            for(int j = 0; j<charArray[0].length; j++){
                if(charArray[i][j] != 0)   sb.append(charArray[i][j]);
            }
        }
        return sb.toString();
    }

}
