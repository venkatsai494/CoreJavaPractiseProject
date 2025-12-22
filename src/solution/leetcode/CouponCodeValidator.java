package solution.leetcode;

import java.util.*;

public class CouponCodeValidator {
    public static void main(String[] args) {
        CouponCodeValidator solution = new CouponCodeValidator();
        System.out.println(solution.validateCoupons(new String[]{"SAVE20","","PHARMA5","SAVE@20"}, new String[]{"restaurant","grocery","pharmacy","restaurant"}, new boolean[]{true,true,true,true})); // ["SAVE10", "WELCOME"]
        System.out.println(solution.validateCoupons(new String[]{"GROCERY15","ELECTRONICS_50","DISCOUNT10"}, new String[]{"grocery","electronics","invalid"}, new boolean[]{false,true,true})); //["ELECTRONICS_50"]
        System.out.println(solution.validateCoupons(new String[]{"Qf8NjqOTYp","w4xOTEM20C"}, new String[]{"pharmacy","pharmacy"}, new boolean[]{true,true})); // Expected: ["Qf8NjqOTYp","w4xOTEM20C"] Actual: [w4xOTEM20C]
    }
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
        List<String> result = new ArrayList<>();
        List<String> codeList = new ArrayList<>();
        List<String> businessLineList = new ArrayList<>();
        for(int i = 0; i<isActive.length; i++){
            if(isActive[i] && (businessLine[i].equalsIgnoreCase("electronics")||businessLine[i].equalsIgnoreCase("grocery")||businessLine[i].equalsIgnoreCase("pharmacy")||businessLine[i].equalsIgnoreCase("restaurant"))){
                codeList.add(code[i]);
                businessLineList.add(businessLine[i]);
            }
        }
        Map<String, List<String>> map = new HashMap<>();
        for(int i = 0; i<codeList.size(); i++){
            if(codeList.get(i).matches("^[a-zA-Z0-9_]+$")){
                if(map.containsKey(businessLineList.get(i))){
                    List<String> temp = map.get(businessLineList.get(i));
                    temp.add(codeList.get(i));
                    map.put(businessLineList.get(i), temp);
                }
                else {
                    List<String> l1 = new ArrayList<>();
                    l1.add(codeList.get(i));
                    map.put(businessLineList.get(i), l1);
                }
            }
        }
        List<String> list = new ArrayList<>(map.keySet());
        Collections.sort(list);
        for(String s: list){
            List<String> temp1 = map.get(s);
            Collections.sort(temp1);
            result.addAll(temp1);
        }
        return result;
    }
}
