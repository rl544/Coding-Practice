// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/87390

class Solution {
    public long[] solution(int n, long left, long right) {
        long k = left/n, l = left%n, kn = (right)/n, ln = (right)%n;
        long[] temp = new long[(int)(right-left+1)];
        for(long i = k; i <= kn; i++){
            for(long j=0; j< n; j++){
                if(i==k&&j<l||i==kn&&j>ln) continue;
                else temp[(int)((i-k)*n+j-l)]=(Math.max(i,j)+1);
            }
        }
        return temp;
    }
}