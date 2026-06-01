package solution.leetcode;

public class LicenseKeyFormatting{
    public static void main(String[] args) {
        LicenseKeyFormatting solution = new LicenseKeyFormatting();
        System.out.println(solution.licenseKeyFormatting("5F3Z-2e-9-w", 4));
        System.out.println(solution.licenseKeyFormatting("2-5g-3-J", 2));
    }
    public String licenseKeyFormatting(String s, int k) {
        StringBuilder sb = new StringBuilder();
        String str = s.replace("-", "").toUpperCase();
        int len = str.length();
        for(int i = 1; i<=len; i++){
            if(i>1 && (i-1)%k==0){
                sb.append("-");
            }
            sb.append(str.charAt(len-i));
        }
        return sb.reverse().toString();
    }
}
