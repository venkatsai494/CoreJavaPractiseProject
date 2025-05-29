package solution.leetcode;

public class NumberOfLaserBeamsInABank {
    public static void main(String[] args) {
        NumberOfLaserBeamsInABank solution = new NumberOfLaserBeamsInABank();
        System.out.println(solution.numberOfBeams(new String[]{"011001", "000000", "010100", "001000"})); // 8
        System.out.println(solution.numberOfBeams(new String[]{"000", "111", "000"})); // 0
    }
    public int numberOfBeams(String[] bank) {
        int result = 0;
        int previousRowDevices = 0;
        for(String s : bank){
            if(countNumberOfDevices(s)>0){
                result = result + (previousRowDevices * countNumberOfDevices(s));
                previousRowDevices = countNumberOfDevices(s);
            }
        }
        return  result;
    }
    public int countNumberOfDevices(String s){
        int count = 0;
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == '1') count++;
        }
        return count;
    }
}
