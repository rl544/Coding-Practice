// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/87694

import java.util.*;
class Solution {
    public int solution(int[][] rectangle, int characterX, int characterY, int itemX, int itemY) {
        int sX=(characterX-1)*2, sY=(characterY-1)*2, eX=(itemX-1)*2, eY=(itemY-1)*2, cnt = 0;
        int[][] d = {{-1,0},{1,0},{0,-1},{0,1}};
        boolean[][] map= new boolean[100][100];
        ArrayList<Integer> arrayList =new ArrayList<>();
        Stack<Integer[]> st = new Stack<>();
        
        for(int[] square:rectangle){
            for(int i=(square[0]-1)*2;i<=(square[2]-1)*2;i++){
                for(int j=(square[1]-1)*2;j<=(square[3]-1)*2;j++){
                    map[i][j]=true;
                }  
            }
        }
        for(int[] square:rectangle){
            for(int i=(square[0]-1)*2+1;i<(square[2]-1)*2;i++){
                for(int j=(square[1]-1)*2+1;j<(square[3]-1)*2;j++){
                    map[i][j]=false;
                }  
            }
        }
        
        st.add(new Integer[] {sX,sY});
        
        while(!st.isEmpty()){
            Integer[] pop=st.pop();
            int x=pop[0], y=pop[1];
            if(x==eX&&y==eY) arrayList.add(cnt);   
            map[x][y]=false;
            for(int f = 0; f < 4; f++) if(x+d[f][0] >= 0 && y+d[f][1] >= 0 && y+d[f][1] < map[0].length && x+d[f][0] < map.length && map[x+d[f][0]][y+d[f][1]]==true) st.add(new Integer[] {x+d[f][0],y+d[f][1]});
            cnt++;
        }
        arrayList.add(cnt);
        return Math.min(arrayList.get(0)/2,arrayList.get(1)/2-arrayList.get(0)/2);
    }
}