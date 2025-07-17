package solution.leetcode;

public class CrawlerLogFolder {
    public static void main(String[] args) {
        CrawlerLogFolder clf = new CrawlerLogFolder();
        System.out.println(clf.minOperations(new String[]{"d1/","d2/","../","d21/","./"})); // Output: 2
        System.out.println(clf.minOperations(new String[]{"d1/","d2/","./","d3/","../","d31/"})); // Output: 3
        System.out.println(clf.minOperations(new String[]{"d1/","../","../","../"})); // Output: 0
        System.out.println(clf.minOperations(new String[]{"./","wz4/","../","mj2/","../","../","ik0/","il7/"})); // Output: 2
    }
    public int minOperations(String[] logs) {
        int count = 0;
        for(String s : logs){
            if(s.equals("./")) continue;
            else if(s.equals("../")) count--;
            else count++;
            if(count<0) count = 0;
        }
        return count;
    }
}
