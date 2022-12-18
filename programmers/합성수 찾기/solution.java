// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/120846?language=java

class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 1; i <= n; i++){
            int temp = 0;
            for(int j = 1; j <= i; j++){
               temp += (i%j==0)?1:0;
                if(temp>2) break;
                }
            if(temp>2) answer++;
            }
        return answer;
    }
}