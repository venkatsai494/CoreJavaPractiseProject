package solution.leetcode;

public class XOROperationInAnArray {
    public static void main(String[] args) {
        XOROperationInAnArray solution = new XOROperationInAnArray();
        System.out.println(solution.xorOperation(5, 0)); // 8
        System.out.println(solution.xorOperation(4, 3)); // 8
        System.out.println(solution.xorOperation(1, 7)); // 7
        System.out.println(solution.xorOperation(10, 5)); // 2
    }
    public int xorOperation(int n, int start) {
        int [] arr = new int[n];
        arr[0] = start;
        for(int i = 0; i<n; i++){
            arr[i] = start + (2*i);
        }
        int result = 0;
        for(int k : arr){
            result = result ^ k;
        }
        return result;
    }
}
