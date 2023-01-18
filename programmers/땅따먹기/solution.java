// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/12913

class Solution {
    public int solution(int[][] land) {
        int answer = 0;
        for(int x = 1; x < land.length; x++){
            for(int z = 0 ; z < 4; z++){
                int temp = 0, tp = 0;
                for(int v = 0 ; v < 4; v++){
                    if(v == z) continue;
                    tp = land[x-1][v];
                    if(temp<tp) temp = tp;
                }
                land[x][z] += temp;
            }
        }
        
        int temp = 0, tp = 0;
        for(int v = 0 ; v < 4; v++){
            tp = land[land.length-1][v];
            if(temp<tp) temp = tp;
        }
        answer = temp;
        
        return answer;
    }
}