package solution.leetcode;

public class FindTheKthCharacterInStringGameI {
    public static void main(String[] args) {
        FindTheKthCharacterInStringGameI solution = new FindTheKthCharacterInStringGameI();
        System.out.println(solution.kthCharacter(5)); // Example usage
        System.out.println(solution.kthCharacter(10)); // Example usage
    }
    public char kthCharacter(int k) {
        StringBuilder sb = new StringBuilder("a");
        while(sb.length()<k){
            int l = sb.length();
            for(int i = 0; i<l; i++){
                sb.append((char)(sb.charAt(i)+1));
            }
        }
        return sb.toString().charAt(k-1);
    }

}
