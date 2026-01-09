package solution.leetcode;

public class MaximumDifferenceByRemappingADigit {
    public static void main(String[] args) {
        MaximumDifferenceByRemappingADigit solution = new MaximumDifferenceByRemappingADigit();
        System.out.println(solution.minMaxDifference(11891)); // Output: 99009
        System.out.println(solution.minMaxDifference(90)); // Output: 99
        System.out.println(solution.minMaxDifference(123456)); // Output: 900000
    }
    public int minMaxDifference(int num) {
        int min;
        int max;
        String s1 = String.valueOf(num);
        String s2 = String.valueOf(num);
        s1 = s1.replace(s1.charAt(0), '0');
        min = Integer.parseInt(s1);
        int i = 0;
        while(i<s2.length()){
            if(s2.charAt(i)!='9'){
                break;
            }
            i++;
        }
        if(i!=s2.length()) {
            s2 = s2.replace(s2.charAt(i), '9');
        }
        max = Integer.parseInt(s2);
        return max-min;
    }
}
