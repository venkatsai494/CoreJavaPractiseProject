package solution.leetcode;

public class CircularSentence {
    public static void main(String[] args) {
        CircularSentence cs = new CircularSentence();
        System.out.println(cs.isCircularSentence("leetcode exercises sound delightful"));//true
        System.out.println(cs.isCircularSentence("Hello World"));//false
        System.out.println(cs.isCircularSentence("eetcode"));//true
        System.out.println(cs.isCircularSentence("leetcode eats soul"));//true
        System.out.println(cs.isCircularSentence("I like Leetcode"));//false
    }
    public boolean isCircularSentence(String sentence) {
        if(sentence.charAt(0) != sentence.charAt(sentence.length()-1)) return false;
        String[] strArray = sentence.split(" ");
        for(int i = 0; i<strArray.length-1; i++){
            if(strArray[i].charAt(strArray[i].length()-1)!=strArray[i+1].charAt(0)) return false;
        }
        return true;
    }
}
