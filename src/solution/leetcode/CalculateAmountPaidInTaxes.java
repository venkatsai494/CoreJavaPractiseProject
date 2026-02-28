package solution.leetcode;

public class CalculateAmountPaidInTaxes {
    public static void main(String[] args) {
        CalculateAmountPaidInTaxes calculateAmountPaidInTaxes = new CalculateAmountPaidInTaxes();
        System.out.println(calculateAmountPaidInTaxes.calculateTax(new int[][]{{3,50},{7,10},{12,25}}, 10));
        System.out.println(calculateAmountPaidInTaxes.calculateTax(new int[][]{{1,0},{4,25},{5,50}}, 2));
        System.out.println(calculateAmountPaidInTaxes.calculateTax(new int[][]{{2,50}}, 0));
    }
    public double calculateTax(int[][] brackets, int income) {
        double tax = 0.0;
        int previousTaxableIncome = 0;
        for(int[] taxrate : brackets){
            if(income > (taxrate[0]-previousTaxableIncome)){
                tax = tax + (((double)((taxrate[0]-previousTaxableIncome)*taxrate[1]))/100.0);
                income = income - taxrate[0] + previousTaxableIncome;
                previousTaxableIncome = taxrate[0];
            }
            else{
                tax = tax + (((double)(income*taxrate[1]))/100.0);
                break;
            }
        }
        return tax;
    }
}
