package solution.leetcode;

public class CountOperationsToObtainZero {
    public static void main(String[] args) {
        CountOperationsToObtainZero co = new CountOperationsToObtainZero();
        System.out.println(co.countOperations(2, 3)); // 3
        System.out.println(co.countOperations(10, 10)); // 1
        System.out.println(co.countOperations(5, 0)); // 1
        System.out.println(co.countOperations(10, 5)); // 2
        System.out.println(co.countOperations(7, 3)); // 3
        System.out.println(co.countOperations(8, 4)); // 4
        System.out.println(co.countOperations(0, 0)); // 0
    }
    public int countOperations(int num1, int num2) {
        int output = 0;
        while(num1 != 0 && num2 != 0){
            if(num1>num2){
                num1 -= num2;
                output++;
            }
            else {
                num2 -= num1;
                output++;
            }
        }
        return output;
    }

}
