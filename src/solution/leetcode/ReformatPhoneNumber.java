package solution.leetcode;

public class ReformatPhoneNumber {
    public static void main(String[] args) {
        ReformatPhoneNumber rpn = new ReformatPhoneNumber();
        System.out.println(rpn.reformatNumber("1-23-45 6")); // "123-456"
        System.out.println(rpn.reformatNumber("123 4-567")); // "123-45-67"
        System.out.println(rpn.reformatNumber("123 4-5678")); // "123-456-78"
        System.out.println(rpn.reformatNumber("1")); // "12"
        System.out.println(rpn.reformatNumber("--17-5 229 35-39475 ")); // "175-229-35-39475"
    }
    public String reformatNumber(String number) {
        number = number.replace(" ", "").replace("-","");
        StringBuilder sb = new StringBuilder();
        for(int i =0; i<number.length(); i++){
            if(number.length()%3==0 || number.length()%3 == 2){
                if(i>0 && i%3==0) sb.append("-");
                sb.append(number.charAt(i));
            }
            else{
                if(i>0 && i%3==0 && i<number.length()-2) sb.append("-");
                else if(i == number.length()-2)  sb.append("-");
                sb.append(number.charAt(i));
            }
        }
        return sb.toString();
    }
}
