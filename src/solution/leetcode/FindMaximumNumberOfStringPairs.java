package solution.leetcode;

public class FindMaximumNumberOfStringPairs {
    public static void main(String[] args) {
        FindMaximumNumberOfStringPairs f = new FindMaximumNumberOfStringPairs();
        System.out.println(f.maximumNumberOfStringPairs(new String[]{"cd", "ac", "dc", "ca", "zz"})); // 2
        System.out.println(f.maximumNumberOfStringPairs(new String[]{"ab", "ba", "cc"})); // 1
        System.out.println(f.maximumNumberOfStringPairs(new String[]{"aa", "ab"})); // 0

    }
    public int maximumNumberOfStringPairs(String[] words) {
        int output = 0;
        int temp;
        for(int i = 0; i<words.length; i++){
            temp = 0;
            for(int j = i+1; j< words.length; j++){
                if(words[i].charAt(0) == words[j].charAt(1) && words[i].charAt(1) == words[j].charAt(0)) temp++;
            }
            if(temp == 1) output++;
        }
        return output;
    }
}
