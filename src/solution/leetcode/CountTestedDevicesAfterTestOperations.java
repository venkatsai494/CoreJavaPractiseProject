package solution.leetcode;

public class CountTestedDevicesAfterTestOperations {
    public static void main(String[] args) {
        CountTestedDevicesAfterTestOperations ctd = new CountTestedDevicesAfterTestOperations();
        System.out.println(ctd.countTestedDevices(new int[]{1,1,2,1,3})); // 3
        System.out.println(ctd.countTestedDevices(new int[]{0,1,2})); // 2
        System.out.println(ctd.countTestedDevices(new int[]{1, 2, 3, 4, 5})); // 5
        System.out.println(ctd.countTestedDevices(new int[]{1, 2, 3, 4, 5, 6})); // 6
        System.out.println(ctd.countTestedDevices(new int[]{1, 2, 3})); // 3
        System.out.println(ctd.countTestedDevices(new int[]{1})); // 1
    }
    public int countTestedDevices(int[] batteryPercentages) {
        int tested = 0;
        for(int i = 0; i < batteryPercentages.length; i++){
            if(batteryPercentages[i]>0){
                tested++;
                reduceBatteryPercentage(i, batteryPercentages);
            }
        }
        return tested;
    }
    public void reduceBatteryPercentage(int i, int [] arr){
        for(int j = i; j<arr.length; j++){
            if(arr[j]>0) arr[j] = --arr[j];
        }
    }
}
