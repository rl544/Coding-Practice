// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/43162

class Solution {
    private static boolean[] visit;
    private static int[][] com;
    public int solution(int n, int[][] computers) {
        int answer = 0;
        visit = new boolean[n];
        com = computers;
        for(int i=0; i<n; i++) {
            if(!visit[i]) {
                dfs(i);
                answer++;
            }
        }
        return answer;
    }
    private static void dfs(int i) {
        visit[i] = true;
        for(int j=0; j<com.length; j++) if(i !=j && com[i][j] == 1 && !visit[j]) dfs(j);
    }
}