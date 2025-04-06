package solution.leetcode;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        ContainerWithMostWater cwmw = new ContainerWithMostWater();
        int [] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(cwmw.maxArea(height));
    }
    public int maxArea(int[] height) {
        int output = 0;
        int i = 0;
        int j = height.length - 1;
        while(i<j){
            output = Math.max((Math.min(height[i],height[j]))*(j-i), output);
            if(height[j]>height[i]) i++;
            else j--;
        }
       return output;
    }
}
