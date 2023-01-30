// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/77485

import java.util.*;
class Solution {
    public int[] solution(int rows, int columns, int[][] queries) {
        int numb = 1, idx = 0;
        int[] answer = new int[queries.length];
        int[][] mA = new int[rows][columns];
        for(int a = 0; a < rows; a++){
            for(int b = 0; b < columns; b++, numb++){
                mA[a][b] = numb;
            }
        }//clone()은 1차원 배열에서만 deep copy.. 그러니 여기선 옅은 카피가 된다..
        for(int[] query : queries){
            int[][] temp = new int[rows][columns]; 
            for(int a = 0; a < rows; a++) temp[a] = mA[a].clone();
            int x1 = query[0]-1, y1 = query[1]-1, x2 = query[2]-1, y2 = query[3]-1, tg = (x2-x1+y2-y1)*2, min = numb; //numb는 위의 for문에 의해 최대값임.
            //문제가 일반적 인식과 다르게 x를 행, y를 열로 했음 주의...(일반적 인식으론 x가 열, y가 행이지)
            ArrayList<int[]> al = new ArrayList<>();
            for(int y = y1; y <= y2; y++) al.add(new int[] {x1,y}); 
            for(int x = x1+1; x < x2; x++) al.add(new int[] {x,y2});
            for(int y = y2; y >= y1; y--) al.add(new int[] {x2,y});
            for(int x = x2-1; x > x1; x--) al.add(new int[] {x,y1});
            for(int t = 0; t < tg; t++){
                int[] tp = al.get(t), tp2 = al.get((t+tg-1)%tg);
                int target = mA[tp2[0]][tp2[1]];
                temp[tp[0]][tp[1]] = target;
                if(target <  min) min = target;
            }
            mA = temp;
            answer[idx++] = min;
        }
        return answer;
    }
}