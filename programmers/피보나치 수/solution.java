// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/12945

class Solution {
    public long solution(int n) {
        int[] pi = new int[n+1];
        pi[0] = 0;
        pi[1] = 1;
        for(int i = 2; i <= n; i++){
            pi[i] = (pi[i-2]+pi[i-1])%1234567;
        }
        return pi[n];
    }
}