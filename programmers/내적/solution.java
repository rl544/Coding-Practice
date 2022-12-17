// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/70128

class Solution {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        for(int c = 0; c < a.length; c++)
        answer += a[c]*b[c];
        return answer;
    }
}