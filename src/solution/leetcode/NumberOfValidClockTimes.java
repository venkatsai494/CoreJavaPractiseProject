package solution.leetcode;

public class NumberOfValidClockTimes {

    public static void main(String[] args) {
        NumberOfValidClockTimes nvct = new NumberOfValidClockTimes();
        System.out.println(nvct.countTime("?5:00")); // 2
        System.out.println(nvct.countTime("0?:0?")); // 100
        System.out.println(nvct.countTime("??:??")); // 1440
        System.out.println(nvct.countTime("??:3?")); // 240
        System.out.println(nvct.countTime("1?:3?")); // 100
        System.out.println(nvct.countTime("2?:3?")); // 40
        System.out.println(nvct.countTime("?2:16")); // 3
        System.out.println(nvct.countTime("?4:22")); // 2
    }

    public int countTime(String time) {
        int result = 1;
            if(time.charAt(4) == '?'){
                result = result * 10;
            }
            if(time.charAt(3) == '?'){
                result = result * 6;
            }
            if(time.charAt(0) == '?' && time.charAt(1) == '?'){
                result = result * 24;
            }
            else{
                if(time.charAt(1) == '?'){
                    if(time.charAt(0) == '0' || time.charAt(0) == '1') result = result * 10;
                    else if(time.charAt(0) == '2') result = result * 4;
                }
                else if(time.charAt(0) == '?'){
                    if(time.charAt(1)=='0' || time.charAt(1)=='1' || time.charAt(1)=='2' || time.charAt(1)=='3') result = result*3;
                    else result = result * 2;
                }
            }
        return result;
    }
}
