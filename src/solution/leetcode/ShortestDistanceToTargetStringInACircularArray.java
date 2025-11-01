package solution.leetcode;

import java.util.Arrays;

public class ShortestDistanceToTargetStringInACircularArray {
    public static void main(String[] args) {
        ShortestDistanceToTargetStringInACircularArray obj = new ShortestDistanceToTargetStringInACircularArray();
        System.out.println(obj.closestTarget(new String[]{"hello","i","am","leetcode","hello"}, "hello", 1)); // 1
        System.out.println(obj.closestTarget(new String[]{"a","b","c","d","e"}, "c", 0)); // 2
        System.out.println(obj.closestTarget(new String[]{"a","b","c","d","e"}, "f", 0)); // -1
        System.out.println(obj.closestTarget(new String[]{"a","b","leetcode"}, "leetcode", 0)); // 1
        System.out.println(obj.closestTarget(new String[]{"hsdqinnoha","mqhskgeqzr","zemkwvqrww","zemkwvqrww","daljcrktje","fghofclnwp","djwdworyka","cxfpybanhd","fghofclnwp","fghofclnwp"}, "zemkwvqrww", 8)); //4
        System.out.println(obj.closestTarget(new String[]{"a","b","c","c","d","e","f","g","e","e"}, "c", 8)); //4
    }
    public int closestTarget(String[] words, String target, int startIndex) {
        if(!Arrays.asList(words).contains(target)) return -1;
        int min = words.length;
        for(int i = 0; i<words.length; i++){
            if(words[i].equals(target)){
                min = Math.min(min, Math.min(words.length-i+startIndex,Math.abs(startIndex-i)));
                min = Math.min(min, words.length-startIndex+i);
            }
        }
        return min;
    }
}
