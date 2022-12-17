// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/12912

class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        for(int c = Math.min(a,b); c <= Math.max(a,b); c++) answer += c;
        return answer;
    }
}