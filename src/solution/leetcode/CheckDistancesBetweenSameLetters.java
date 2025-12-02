package solution.leetcode;

public class CheckDistancesBetweenSameLetters {
    public static void main(String[] args) {
        CheckDistancesBetweenSameLetters c = new CheckDistancesBetweenSameLetters();
        System.out.println(c.checkDistances("abaccb", new int[]{1,3,0,5,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}));
        System.out.println(c.checkDistances("aa", new int[]{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}));
    }
    public boolean checkDistances(String s, int[] distance) {
        for(int i = 0; i<distance.length; i++){
            if(s.contains(String.valueOf((char)(i+97)))){
                int firstIndex = s.indexOf((char) (i + 97));
                int secondIndex = s.indexOf((char) (i + 97), firstIndex + 1);
                if ((secondIndex - firstIndex - 1) != distance[i]) return false;
            }
        }
        return true;
    }
}
