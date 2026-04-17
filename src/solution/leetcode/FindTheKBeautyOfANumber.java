package solution.leetcode;

public class FindTheKBeautyOfANumber {
    public static void main(String[] args) {
        FindTheKBeautyOfANumber findTheKBeautyOfANumber = new FindTheKBeautyOfANumber();
        System.out.println(findTheKBeautyOfANumber.divisorSubstrings(240, 2));//2
        System.out.println(findTheKBeautyOfANumber.divisorSubstrings(430043, 2));//2
    }
    public int divisorSubstrings(int num, int k) {
        String str = ""+num;
        int div;
        int count = 0;
        for(int i = 0; i<=str.length()-k; i++){
            div = Integer.parseInt(str.substring(i,i+k));
            if(div!=0 && num % div==0){
                count++;
            }
        }
        return count;
    }
}
