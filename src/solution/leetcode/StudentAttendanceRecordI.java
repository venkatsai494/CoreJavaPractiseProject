package solution.leetcode;

public class StudentAttendanceRecordI {
    public static void main(String[] args) {
        StudentAttendanceRecordI s = new StudentAttendanceRecordI();
        System.out.println(s.checkRecord("PPALLP"));
        System.out.println(s.checkRecord("PPALLL"));
    }
    public boolean checkRecord(String s) {
        int a = 0;
        int l = 0;
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == 'A'){
                a++;
                l = 0;
            }
            else if (s.charAt(i) == 'L') {
                l++;
            }
            else{
                l = 0;
            }
            if(a>=2 || l>=3)    return false;

        }
        return true;
    }
}
