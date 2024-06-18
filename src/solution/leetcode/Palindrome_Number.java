package solution.leetcode;

public class Palindrome_Number {
    public boolean isPalindrome(int x) {
        if(x<0)
            return false;
        int temp = x;
        int reversenum = 0;
        do{
            int rem = temp%10;
            reversenum = (reversenum*10)+rem;
            temp = temp / 10;
        }while(temp>0);
        if(x==reversenum)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Palindrome_Number pn = new Palindrome_Number();
        System.out.println(pn.isPalindrome(121));
        System.out.println(pn.isPalindrome(-121));
        System.out.println(pn.isPalindrome(10));

        String a = new String("hello there");
        System.out.println(a.compareTo("hello there"));
    }
}
