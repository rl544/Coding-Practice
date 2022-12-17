// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/12934

class Solution {
    public long solution(long n) {
        long answer = 0;
        long sqn = (long)Math.sqrt(n);
        return (n%sqn==0&&(sqn!=n&&sqn!=1||n==1))?(long)Math.pow(sqn+1,2):-1;
    }
}