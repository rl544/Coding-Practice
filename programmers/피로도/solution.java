// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/87946

class Solution {
    boolean[] visit;
    int[][] dungeons;
    int max=0;
    private void dfs(int p, int use,int depth) {
        visit[p]=true;
        use -= dungeons[p][1];
        for(int i=0;i<dungeons.length;i++) {
            if(!visit[i] && dungeons[i][0] <= use) dfs(i,use,depth+1);
        }
        max = Math.max(depth,max);
        visit[p]=false;
    }
    public int solution(int k, int[][] dungeons) {
        this.dungeons = dungeons;
        visit = new boolean[dungeons.length];
        for(int i = 0; i< dungeons.length; i++){
            if(k>=dungeons[i][0]) dfs(i,k,1);
        }
        return max;
    }
}