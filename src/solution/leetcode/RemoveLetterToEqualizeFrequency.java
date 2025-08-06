package solution.leetcode;

import java.util.Arrays;

public class RemoveLetterToEqualizeFrequency {
    public static void main(String[] args) {
        RemoveLetterToEqualizeFrequency r = new RemoveLetterToEqualizeFrequency();
        System.out.println(r.equalFrequency("abcc")); //true
        System.out.println(r.equalFrequency("aazz")); //false
        System.out.println(r.equalFrequency("aaabbb")); //false
        System.out.println(r.equalFrequency("aabbcc")); //false
        System.out.println(r.equalFrequency("aabbcccddee")); //true
        System.out.println(r.equalFrequency("bac"));//true;
        System.out.println(r.equalFrequency("daab"));//true;
        System.out.println(r.equalFrequency("abbcc"));//true
    }
    public boolean equalFrequency(String word) {
        int [] alphabetcount = new int[26];
        for(int i = 0; i<word.length(); i++){
            alphabetcount[word.charAt(i) - 'a']++;
        }
        for(int i = 0; i<alphabetcount.length; i++){
            alphabetcount[i]--;
            if(isSameFrequency(alphabetcount)) return true;
            alphabetcount[i]++;
        }
        return false;
    }
    public boolean isSameFrequency(int [] arr){
        int maxValue = Arrays.stream(arr).max().orElse(0);
        int minValue = Arrays.stream(arr).filter(t->t!=0).min().orElse(0);
        return maxValue==minValue;
    }

}
