package solution.leetcode;

import java.util.ArrayList;
import java.util.List;

public class IntegerToEnglishWords {
    public static void main(String[] args) {
        IntegerToEnglishWords itew = new IntegerToEnglishWords();
        System.out.println(itew.numberToWords(20));
        System.out.println(itew.numberToWords(1100));
        System.out.println(itew.numberToWords(1123143));
        System.out.println(itew.numberToWords(1200000));
        System.out.println(itew.numberToWords(123));
        System.out.println(itew.numberToWords(2147483647));
        System.out.println(itew.numberToWords(1102));
        System.out.println(itew.numberToWords(10000000));
        System.out.println(itew.numberToWords(10000));
    }
    public String numberToWords(int num) {
        if(num==0) return "Zero";
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        String [] unitArray = new String[]{"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        String [] tenArray = new String[]{"Tenty", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
        int place = 1;
        int current;
        while(num>0){
            current = num%10;

                if(place == 1 && current != 0){
                    list.add(unitArray[current-1]);
                    place++;
                }
                else if(place == 2 && current != 0){
                    list.add(tenArray[current-1]);
                    place++;
                }
                else if(place == 3 && current != 0){
                    list.add("Hundred");
                    list.add(unitArray[current-1]);
                    place++;
                }
                else if(place == 4){
                    if(num%1000!=0){
                        list.add("Thousand");
                    }
                    if(current != 0){
                        list.add(unitArray[current-1]);
                    }
                    place++;
                }
                else if(place == 5 && current != 0){
                    list.add(tenArray[current-1]);
                    place++;
                }
                else if(place == 6 && current != 0){
                    list.add("Hundred");
                    list.add(unitArray[current-1]);
                    place++;
                }
                else if(place == 7){
                    if(num%1000!=0){
                        list.add("Million");
                    }
                    if(current != 0){
                        list.add(unitArray[current-1]);
                    }
                    place++;
                }
                else if(place == 8 && current != 0){
                    list.add(tenArray[current-1]);
                    place++;
                }
                else if(place == 9 && current != 0){
                    list.add("Hundred");
                    list.add(unitArray[current-1]);
                    place++;
                }
                else if(place == 10 && current != 0){
                    list.add("Billion");
                    list.add(unitArray[current-1]);
                    place++;
                }
                else{
                    place++;
                }
            num = num/10;
        }
        for(int i = list.size()-1; i>=0; i--){
            sb.append(" ").append(list.get(i));
        }
        return sb.toString()
                .replace("Tenty One", "Eleven")
                .replace("Tenty Two", "Twelve")
                .replace("Tenty Three", "Thirteen")
                .replace("Tenty Four", "Fourteen")
                .replace("Tenty Five", "Fifteen")
                .replace("Tenty Six", "Sixteen")
                .replace("Tenty Seven", "Seventeen")
                .replace("Tenty Eight", "Eighteen")
                .replace("Tenty Nine", "Nineteen")
                .replace("Tenty", "Ten")
                .trim();
    }
}
