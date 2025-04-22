package solution.leetcode;

public class MinimumNumberOfChairsInAWaitingRoom {
    public static void main(String[] args) {
        MinimumNumberOfChairsInAWaitingRoom mncr = new MinimumNumberOfChairsInAWaitingRoom();
        System.out.println(mncr.minimumChairs("EEEEEEE"));
        System.out.println(mncr.minimumChairs("ELELEEL"));
        System.out.println(mncr.minimumChairs("ELEELEELLL"));
        System.out.println(mncr.minimumChairs("EELLL"));
        System.out.println(mncr.minimumChairs("EEELLL"));
        System.out.println(mncr.minimumChairs("EELLEL"));
        System.out.println(mncr.minimumChairs("EELLEEE"));
    }
    public int minimumChairs(String s) {
        int output = 0;
        int temp = 0;
        for(int i =0; i<s.length(); i++){
            if(s.charAt(i)=='E')    temp++;
            else if(s.charAt(i) == 'L') temp--;
            output = Math.max(output, temp);
        }
        return output;
    }
}
