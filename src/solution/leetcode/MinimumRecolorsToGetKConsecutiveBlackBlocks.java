package solution.leetcode;

public class MinimumRecolorsToGetKConsecutiveBlackBlocks {
    public static void main(String[] args) {
        MinimumRecolorsToGetKConsecutiveBlackBlocks minimumRecolorsToGetKConsecutiveBlackBlocks = new MinimumRecolorsToGetKConsecutiveBlackBlocks();
        System.out.println(minimumRecolorsToGetKConsecutiveBlackBlocks.minimumRecolors("WBBWWBBWBW", 7));//3
        System.out.println(minimumRecolorsToGetKConsecutiveBlackBlocks.minimumRecolors("WBWBBBW", 2));//0
    }
    public int minimumRecolors(String blocks, int k) {
        int min = k;
        for(int i = 0; i<=blocks.length()-k; i++){
            min = Math.min(min, numberOfRecoloringRequired(blocks.substring(i,i+k)));
        }
        return min;
    }
    public int numberOfRecoloringRequired(String s){
        int count = 0;
        for(char c:s.toCharArray()){
            if(c=='W') count++;
        }
        return count;
    }
}
