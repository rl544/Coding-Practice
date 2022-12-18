// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/12924

class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 1; i <= n; i++){
            int nn = n-(i*(i-1)/2);
            if (nn < 1) break;
            else if (nn%i==0) answer ++;
        }
        return answer;
    }
}