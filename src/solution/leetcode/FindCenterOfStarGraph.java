package solution.leetcode;

public class FindCenterOfStarGraph {
    public static void main(String[] args) {
        FindCenterOfStarGraph f = new FindCenterOfStarGraph();
        System.out.println(f.findCenter(new int[][]{{1,2},{2,3},{4,2}})); // 2
        System.out.println(f.findCenter(new int[][]{{1,2},{5,1},{1,3},{1,4}})); // 1
        System.out.println(f.findCenter(new int[][]{{1,2},{2,3}})); // 2
    }
    public int findCenter(int[][] edges) {
        if(edges[0][0] == edges[1][0]) return edges[0][0];
        else if(edges[0][0] == edges[1][1]) return edges[0][0];
        else if(edges[0][1] == edges[1][0]) return edges[0][1];
        else if(edges[0][1] == edges[1][1]) return edges[0][1];
        return 0;
    }
}
