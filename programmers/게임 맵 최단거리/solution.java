// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/1844

import java.util.LinkedList;
class Solution {
    public int solution(int[][] maps) {
        boolean[][] visit = new boolean[maps.length][maps[0].length];
        Integer[][] n = new Integer[][] {{-1,0},{1,0},{0,-1},{0,1}};
        LinkedList<Integer[]> linkedList = new LinkedList<>();
        linkedList.add(new Integer[] {0,0,1});
        visit[0][0] = true;
        while(!linkedList.isEmpty()){
            Integer[] pos = linkedList.poll();
            if(pos[0] == maps.length-1 && pos[1] == maps[0].length-1) return pos[2];
            for(int x = 0; x < 4; x++){
                int cx = pos[0]+n[x][0], cy = pos[1]+n[x][1];
                if(cx >= 0 && cy >= 0 && cx < maps.length && cy < maps[0].length &&maps[cx][cy] != 0 && !visit[cx][cy]){
                    visit[cx][cy] = true;
                    linkedList.add(new Integer[] {cx,cy,pos[2]+1});
                }
            }
        }
        return -1;
    }
}