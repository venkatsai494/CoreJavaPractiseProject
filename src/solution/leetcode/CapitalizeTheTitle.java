package solution.leetcode;

public class CapitalizeTheTitle {
    public static void main(String[] args) {
        CapitalizeTheTitle ct = new CapitalizeTheTitle();
        System.out.println(ct.capitalizeTitle("capiTalIze tHe titLe"));
        System.out.println(ct.capitalizeTitle("First leTTeR of EACH Word"));
        System.out.println(ct.capitalizeTitle("i lOve leetcode"));
    }
    public String capitalizeTitle(String title) {
        String [] arr = title.split(" ");
        for(int i = 0; i<arr.length; i++){
            if(arr[i].length()<=2){
                arr[i] = arr[i].toLowerCase();
            }
            else{
                arr[i] = capitalizeWord(arr[i]);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(String s: arr){
            sb.append(" ").append(s);
        }
        return sb.toString().trim();
    }

    public String capitalizeWord(String s){
        return Character.toUpperCase(s.charAt(0))+s.toLowerCase().substring(1);
    }
}
