package solution.leetcode;

public class NumberOfChangingKeys {
    public static void main(String[] args) {
        NumberOfChangingKeys obj = new NumberOfChangingKeys();
        System.out.println(obj.countKeyChanges("aAbBcC")); // 0
        System.out.println(obj.countKeyChanges("AaAaAaaA")); // 0
        System.out.println(obj.countKeyChanges("YyYyY")); // 0
        System.out.println(obj.countKeyChanges("aAaAaA")); // 0
        System.out.println(obj.countKeyChanges("abcDEFghI")); // 8
        System.out.println(obj.countKeyChanges("ZZZzzZZZ")); // 0
        System.out.println(obj.countKeyChanges("QwErTyUiOp")); // 9
    }
    public int countKeyChanges(String s) {
        int count = 0;
        s = s.toLowerCase();
        char c = s.charAt(0);
        for(int i = 0; i<s.length(); i++){
            if(c != s.charAt(i)){
                c = s.charAt(i);
                count++;
            }
        }
        return count;
    }
}
