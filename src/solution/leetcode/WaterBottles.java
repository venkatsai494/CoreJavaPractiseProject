package solution.leetcode;

public class WaterBottles {
    public static void main(String[] args) {
        WaterBottles wb = new WaterBottles();
        System.out.println(wb.numWaterBottles(9, 3));
        System.out.println(wb.numWaterBottles(15, 4));
        System.out.println(wb.numWaterBottles(5, 5));
        System.out.println(wb.numWaterBottles(2, 3));
    }
    public int numWaterBottles(int numBottles, int numExchange) {
        if(numExchange>numBottles) return numBottles;
        int output = numBottles;
        int emptyBottles = numBottles;
        while(emptyBottles>=numExchange){
            numBottles = emptyBottles/numExchange;
            emptyBottles = numBottles + (emptyBottles%numExchange);
            output = output + numBottles;
        }
        return output;
    }
}
