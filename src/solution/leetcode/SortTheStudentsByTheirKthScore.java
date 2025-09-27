package solution.leetcode;

public class SortTheStudentsByTheirKthScore {
    public static void main(String[] args) {
        SortTheStudentsByTheirKthScore sorter = new SortTheStudentsByTheirKthScore();
        int[][] scores = {{10, 20, 30}, {20, 10, 40}, {30, 40, 50}};
        int k = 1;
        int[][] sortedScores = sorter.sortTheStudents(scores, k);
        for (int[] score : sortedScores) {
            for (int s : score) {
                System.out.print(s + " ");
            }
            System.out.println();
        }
        int[][] scores1 = {{10,6,9,1},{7,5,11,2},{4,8,3,15}};
        k = 2;
        int[][] sortedscores1 = sorter.sortTheStudents(scores1, k);
        for (int[] score : sortedscores1) {
            for (int s : score) {
                System.out.print(s + " ");
            }
            System.out.println();
        }
    }
    public int[][] sortTheStudents(int[][] score, int k) {
        int[] temp;
        for(int i = 0; i<score.length; i++){
            for(int j = 0; j<score.length; j++){
                if(score[i][k]>score[j][k]){
                    temp = score[i];
                    score[i] = score[j];
                    score[j] = temp;
                }
            }
        }
        return score;
    }
}
