package solution.leetcode;

public class MirrorDistanceOfAnInteger {
    public static void main(String[] args) {
        MirrorDistanceOfAnInteger md = new MirrorDistanceOfAnInteger();
        System.out.println(md.mirrorDistance(25));
        System.out.println(md.mirrorDistance(10));
        System.out.println(md.mirrorDistance(7));
    }
    public int mirrorDistance(int n) {
        if(n<10) return 0;
        int originalum = n;
        int reverse = 0;
        while(n>0){
            reverse = (reverse*10) + n%10;
            n = n/10;
        }
        return Math.abs(originalum-reverse);
    }
}
