// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/43164

import java.util.*;
class Solution {
    String[] als;
    boolean done;
    public String[] solution(String[][] tickets) {
        String[] answer = {};
        boolean[] visit = new boolean[tickets.length];
        Arrays.sort(tickets, new Comparator<String[]> () {
           @Override
            public int compare(String[] o1, String o2[]) {
                return (o1[0].compareTo(o2[0])!=0)?o1[0].compareTo(o2[0]):o1[1].compareTo(o2[1]);
            }
        });
        for(int a = 0; a < tickets.length; a++) {
            if(!tickets[a][0].equals("ICN")) continue;
            ArrayList<String> al = new ArrayList<>();
            al.clear();
            al.add(tickets[a][0]);
            visit[a] = true;
            dfs(a, tickets, visit, 1, al);
            visit[a] = false;
        }
        return als;
    }
    private void dfs(int pos,String[][] tickets, boolean[] visit, int depth, ArrayList<String> al){
        int neoDepth = depth+1;
        if(!done && depth == tickets.length) {
            al.add(tickets[pos][1]);
            done = true;
            als = al.toArray(String[]::new);
        }
        else if(!done && al.size() < tickets.length){
            for(int a = 0; a < tickets.length; a++){
                if(a == pos) continue;
                if(!visit[a] && tickets[pos][1].equals(tickets[a][0])) {
                    visit[a] = true;
                    al.add(tickets[a][0]);
                    dfs(a,tickets,visit,neoDepth,al);
                    al.remove(depth);
                    visit[a] = false;
                }
            }
        }
    }
}