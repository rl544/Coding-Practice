// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/49994#

import java.util.*;
import java.lang.StringBuilder;
class Solution {
    public int solution(String dirs) {
        int answer = 0;
        int[] pos = {0,0};
        char[] tt = {'L','R','U','D'};
        int[][] ppos = {{-1,0},{1,0},{0,1},{0,-1}};
        HashSet<String> hs = new HashSet<>();
        for(char a : dirs.toCharArray()){
            for(int x = 0; x < 4; x++){
                if(a == tt[x]) {
                    if(Math.abs(pos[0]+ppos[x][0])<=5&&Math.abs(pos[1]+ppos[x][1])<=5) {
                        StringBuilder sb = new StringBuilder();
                        int aa = pos[0];
                        int b = pos[1];
                        pos[0] += ppos[x][0];
                        pos[1] += ppos[x][1];
                        if(aa > pos[0] || b > pos[1]){
                            sb.append(aa);
                            sb.append(pos[0]);
                            sb.append(b);
                            sb.append(pos[1]);
                        } else{
                            sb.append(pos[0]);
                            sb.append(aa);
                            sb.append(pos[1]);
                            sb.append(b);
                        }

                        hs.add(sb.toString());
                        //System.out.println(pos[0]+" "+pos[1]);
                    }
                }
            }
        }
        return hs.size();
    }
}