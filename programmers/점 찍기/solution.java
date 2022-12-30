// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/140107

class Solution {
    public long solution(int k, int d) {
        long answer = 0;
        double dd = (double)d/k;
        for(int i = 0; (double)i <= dd; i+=1) answer += (int)Math.floor(Math.sqrt(Math.pow(dd,2)-Math.pow(i,2)));
        return answer+(long)dd+1;
    }
}