package solution.leetcode;

public class CountAndSay {
    public static void main(String[] args) {
        CountAndSay countAndSay = new CountAndSay();
        System.out.println(countAndSay.countAndSay(1));
        System.out.println(countAndSay.countAndSay(2));
        System.out.println(countAndSay.countAndSay(3));
        System.out.println(countAndSay.countAndSay(4));
        System.out.println(countAndSay.countAndSay(5));
    }
    public String countAndSay(int n) {
        String s;
        if(n==1) return "1";
        else if(n==2) return "11";
        s="11";
        for(int i = 3; i<=n; i++){
            s = process(s);
        }
        return s;
    }

    public String process(String s){
        StringBuilder sb = new StringBuilder();
        int count = 0;
        char comp = s.charAt(0);
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i)==comp) {
                count++;
            }
            else{
                sb.append(count).append(s.charAt(i-1));
                comp = s.charAt(i);
                count=1;
            }
        }
        return sb.append(count).append(comp).toString();
    }
}
