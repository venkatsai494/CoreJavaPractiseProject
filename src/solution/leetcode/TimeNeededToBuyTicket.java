package solution.leetcode;

public class TimeNeededToBuyTicket {

    public static void main(String[] args) {
        TimeNeededToBuyTicket tn = new TimeNeededToBuyTicket();
        System.out.println(tn.timeRequiredToBuy(new int[]{2,6,3,4,5}, 2));
        System.out.println(tn.timeRequiredToBuy(new int[]{84,49,5,24,70,77,87,8}, 3));
    }

    public int timeRequiredToBuy(int[] tickets, int k) {
        int output = 0;
        while(tickets[k]>=1){
            for(int i = 0; i<tickets.length; i++){
                if(tickets[i]>0){
                    tickets[i] = tickets[i] - 1;
                    output++;
                }
                if(tickets[k]==0) break;
            }
        }
        return output;
    }
}
