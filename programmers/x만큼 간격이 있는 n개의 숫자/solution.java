// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/12954?language=java

class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        for(int a = 0; a < n; a++){
            answer[a] = (long) x*(a+1);
        }
        return answer;
    }
}