package solution.leetcode;

import java.util.HashSet;
import java.util.Set;

public class CheckIfAStringContainsAllBinaryCodesOfSizeK {
    public static void main(String[] args) {
        	CheckIfAStringContainsAllBinaryCodesOfSizeK checkIfAStringContainsAllBinaryCodesOfSizeK = new CheckIfAStringContainsAllBinaryCodesOfSizeK();
            System.out.println(checkIfAStringContainsAllBinaryCodesOfSizeK.hasAllCodes("00110110", 2));
            System.out.println(checkIfAStringContainsAllBinaryCodesOfSizeK.hasAllCodes("0110", 1));
            System.out.println(checkIfAStringContainsAllBinaryCodesOfSizeK.hasAllCodes("0110", 2));
            System.out.println(checkIfAStringContainsAllBinaryCodesOfSizeK.hasAllCodes("00110", 2));
    }
    public boolean hasAllCodes(String s, int k) {
        Set<String> set = new HashSet<>();
        for(int i = 0; i<=s.length()-k; i++){
            set.add(s.substring(i, i+k));
        }
        return set.size() == Math.pow(2, k);
    }
}
