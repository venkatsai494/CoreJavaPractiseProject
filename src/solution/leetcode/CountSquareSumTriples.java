package solution.leetcode;

public class CountSquareSumTriples {
    public static void main(String[] args) {
        CountSquareSumTriples c = new CountSquareSumTriples();
        System.out.println(c.countTriples(5)); // Output: 2
        System.out.println(c.countTriples(10)); // Output: 4
        System.out.println(c.countTriples(13)); // Output: 8
    }
    public int countTriples(int n) {
        int count = 0;
        for(int i = 1; i<n; i++){
            for(int j = 1; j<n; j++){
                for(int k = Math.max(i,j); k<=n; k++){
                    if((i*i)+(j*j) == (k*k)) count++;
                }
            }
        }
        return count;
    }
}
