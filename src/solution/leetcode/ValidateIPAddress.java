package solution.leetcode;

import java.util.regex.Pattern;

public class ValidateIPAddress {
    public static void main(String[] args) {
        ValidateIPAddress solution = new ValidateIPAddress();
        System.out.println(solution.validIPAddress("192.168.1.1"));//iPv4
        System.out.println(solution.validIPAddress("192.168.1.0"));//iPv4
        System.out.println(solution.validIPAddress("192.168.01.1"));//Neither
        System.out.println(solution.validIPAddress("192.168.1.00"));//Neither
        System.out.println(solution.validIPAddress("192.168@1.1"));//Neither
        System.out.println(solution.validIPAddress("2001:0db8:85a3:0000:0000:8a2e:0370:7334"));//IPv6
        System.out.println(solution.validIPAddress("2001:db8:85a3:0:0:8A2E:0370:7334"));//IPv6
        System.out.println(solution.validIPAddress("2001:0db8:85a3::8A2E:037j:7334"));//Neither
        System.out.println(solution.validIPAddress("02001:0db8:85a3:0000:0000:8a2e:0370:7334"));//Neither
        System.out.println(solution.validIPAddress("256.256.256.256"));//Neither
        System.out.println(solution.validIPAddress("02001:0db8:85a3:0000:0000:8a2e:0370:7334"));//IPv6
        System.out.println(solution.validIPAddress("2001:0db8:85a3:0:0:8A2E:0370:7334:"));//Neither
    }
    public String validIPAddress(String queryIP) {
        if(queryIP.startsWith(".") || queryIP.endsWith(".") || queryIP.startsWith(":") || queryIP.endsWith(":")) return "Neither";
        if (queryIP.contains(".")) {
                String[] iPV4Arr = queryIP.split(Pattern.quote("."));
                if(iPV4Arr.length !=4) return "Neither";
                try{
                    for(String i: iPV4Arr){
                        if(Integer.parseInt(i)>255 || Integer.parseInt(i)<0 || (i.length()>1 && i.startsWith("0"))) return "Neither";
                    }
                }
                catch (NumberFormatException e){
                    return "Neither";
                }
                return "IPv4";
            } else if (queryIP.contains(":")) {
                String[] iPv6Arr = queryIP.split(":");
                if (iPv6Arr.length != 8) return "Neither";
                try {
                    for (String i : iPv6Arr) {
                        if(i.length()>4) return "Neither";
                        Integer.parseInt(i, 16);
                        }
                    }
                catch (NumberFormatException e){
                    return "Neither";
                }
                    return "IPv6";
            }
        return "Neither";
    }
}
