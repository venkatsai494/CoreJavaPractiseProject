package solution.leetcode;

public class SortingTheSentence {
    public static void main(String[] args) {
        SortingTheSentence sts = new SortingTheSentence();
        System.out.println(sts.sortSentence("is2 sentence4 This1 a3"));
    }
    public String sortSentence(String s) {
        String result = "";
        String [] arr = s.split(" ");
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr.length; j++){
                if(((arr[j].charAt((arr[j]).length()-1))-'0')==(i+1)){
                    result = result + " " +arr[j].substring(0,arr[j].length()-1);
                    break;
                }
            }
        }
        return result.trim();
    }



}
