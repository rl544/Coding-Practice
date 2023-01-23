// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/43163

class Solution {
    static String tg;
    static int tt;
    public int solution(String begin, String target, String[] words) {
        tt = 0;
        tg = target;
        boolean[] visit = new boolean[words.length];
        dfs(begin, words, 0, visit);
        return tt;
    }
    private void dfs(String from, String[] words, int depth, boolean[] visit){
        int pos = 0;
        if(!from.equals(tg)){
            for(String word : words){
                if(!visit[pos] && !from.equals(word) && diffCheck(from,word)) {
                    visit[pos] = true;
                    dfs(word, words, depth+1, visit);
                    visit[pos] = false;
                }
                pos++;
            }    
        } else{
            if(tt==0 || tt>depth) tt = depth;
        }    
    }
    private boolean diffCheck(String first, String second){
        int len = first.length(), cnt = 0;
        for(int a = 0; a < len; a++){
            if(first.charAt(a)!= second.charAt(a)) cnt ++;
            if(cnt > 1) break;
        }
        return cnt == 1;
    }
}