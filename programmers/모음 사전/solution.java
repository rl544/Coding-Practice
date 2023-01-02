// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/84512?language=java

import java.lang.StringBuilder;
import java.util.*;
class Solution {
    PriorityQueue<String> q = new PriorityQueue<>();
    StringBuilder sb = new StringBuilder();
    char[] oo = {'A','E','I','O','U'};
    private String[] dfs(int depth){
        String[] sa;
        ArrayList<String> al = new ArrayList<>();
        if(depth == 1){
            al.clear();
            for(char c : oo){
                al.add(c+"");
                q.add(c+"");
            }
            return al.stream().toArray(String[]::new);
        }
        if(depth >= 2){
            al.clear();            
            sa = dfs(depth-1);
            for(String s : sa){
                for(char c : oo){
                    al.add(s+c);
                    q.add(s+c);
                }
            }
            return al.stream().toArray(String[]::new);
        }
        return null;
    }
    public int solution(String word) {
        int answer = 0;
        Arrays.toString(dfs(5));
        String[] ans = q.stream().toArray(String[]::new);
        Arrays.sort(ans);
        return Arrays.asList(ans).indexOf(word)+1;
    }
}