package solution.leetcode;

public class ExcelSheetColumnNumber {
    public static void main(String[] args) {
        ExcelSheetColumnNumber escn = new ExcelSheetColumnNumber();
        System.out.println(escn.titleToNumber("A")); //1
        System.out.println(escn.titleToNumber("Z")); //26
        System.out.println(escn.titleToNumber("AA")); //27
        System.out.println(escn.titleToNumber("AB")); //28
        System.out.println(escn.titleToNumber("ZY")); //701
        System.out.println(escn.titleToNumber("AAA")); //703
        System.out.println(escn.titleToNumber("GL")); //194
        System.out.println(escn.titleToNumber("FXSHRXW")); //2147483647
    }
    public int titleToNumber(String columnTitle) {
        int result = 0;
        int l = columnTitle.length();
        if(l==1) return columnTitle.charAt(0) - 64;
        else{
            int i = 0;
            while(l>=0 && i<columnTitle.length()){
                result = result + (((int)Math.pow(26,l-1))*(columnTitle.charAt(i)-64));
                l--;
                i++;
            }
        }
        return result;
    }
}
