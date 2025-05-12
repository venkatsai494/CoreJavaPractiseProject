package solution.leetcode;

public class CountSymmetricIntegers {
    public static void main(String[] args) {
        CountSymmetricIntegers csi = new CountSymmetricIntegers();
        System.out.println(csi.countSymmetricIntegers(1, 100)); // 9
        System.out.println(csi.countSymmetricIntegers(1200, 1230)); // 4
        System.out.println(csi.countSymmetricIntegers(10, 1000)); // 90
        System.out.println(csi.countSymmetricIntegers(100, 10000)); // 900
        System.out.println(csi.countSymmetricIntegers(1, 9999)); // 999
    }
    public int countSymmetricIntegers(int low, int high) {
        int output = 0;
        for(int i = low; i<=high; i++){
            if(isSymmetric(i))  output++;
        }
        return output;
    }

    public boolean isSymmetric(int i){
        if(i<10 || (i>99 && i<999) || i >9999){
            return false;
        }
        if((i<=99 && (sumofDigits(i/10) == sumofDigits(i%10)))||(i>999 && (sumofDigits(i/100) == sumofDigits(i%100)))){
            return true;
        }
        return false;
    }
    public int sumofDigits(int i){
        int sum = 0;
        while(i>0){
            sum = sum + i%10;
            i = i/10;
        }
        return sum;
    }
}
