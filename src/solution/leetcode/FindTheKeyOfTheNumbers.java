package solution.leetcode;

public class FindTheKeyOfTheNumbers {
    public static void main(String[] args) {
        FindTheKeyOfTheNumbers obj = new FindTheKeyOfTheNumbers();
        System.out.println(obj.generateKey(1, 10, 1000));
        System.out.println(obj.generateKey(987, 879, 798));
        System.out.println(obj.generateKey(1, 2, 3));
    }
    public int generateKey(int num1, int num2, int num3) {
        String n1 = convertTo4DigitNum(num1);
        String n2 = convertTo4DigitNum(num2);
        String n3 = convertTo4DigitNum(num3);
        String result = "";
        for(int i = 0; i<4; i++){
            result = result + Math.min(Math.min(n1.charAt(i)-'0', n2.charAt(i)-'0'), n3.charAt(i)-'0');
        }
        return Integer.parseInt(result);
    }

    public String convertTo4DigitNum(int n){
        if(n>=1000) return ""+n;
        else if(n>=100) return "0"+n;
        else if(n>=10) return "00"+n;
        else return "000"+n;
    }
}
