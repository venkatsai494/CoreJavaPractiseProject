package solution.leetcode;

public class ComplexNumberMultiplication {
    public static void main(String[] args) {
        ComplexNumberMultiplication solution = new ComplexNumberMultiplication();
        System.out.println(solution.complexNumberMultiply("1+1i", "1+1i"));
        System.out.println(solution.complexNumberMultiply("1+-1i", "1+-1i"));
    }
    public String complexNumberMultiply(String num1, String num2) {
        int[] num1Arr = convertToArray(num1);
        int[] num2Arr = convertToArray(num2);
        int realPart = num1Arr[0] * num2Arr[0] - (num1Arr[1] * num2Arr[1]);
        int imgPart = num1Arr[0] * num2Arr[1] + (num1Arr[1] * num2Arr[0]);
        return realPart + "+" + imgPart + "i";
    }
    public int[] convertToArray(String s){
        int[] arr = new int[2];
        String [] strArray = s.split("\\+");
        arr[0] = Integer.parseInt(strArray[0]);
        arr[1] = Integer.parseInt(strArray[1].replace("i", ""));
        return arr;
    }
}
