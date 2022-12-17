// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/120875

import java.util.HashMap;
class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        HashMap<Double, Integer> hash = new HashMap<>();
        for(int a = 0; a < dots.length-1; a++){
            for(int b = a+1; b < dots.length; b++){
                hash.put((double) (dots[a][1]-dots[b][1])/(dots[a][0]-dots[b][0]),hash.getOrDefault((double) (dots[a][1]-dots[b][1])/(dots[a][0]-dots[b][0]),0)+1);
            }
        }
        for(double key : hash.keySet()){
            if(hash.get(key)>1) {
                answer = 1;
                break;
            }
        }
        return answer;
    }
}