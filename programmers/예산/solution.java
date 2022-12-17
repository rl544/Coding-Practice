// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/12982?language=java

import java.util.Arrays;
class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int sum = 0;
        Arrays.sort(d);
        for(int f : d){
           sum += f;
            if(sum > budget) break;
            else answer += 1;
        }
        return answer;
    }
}