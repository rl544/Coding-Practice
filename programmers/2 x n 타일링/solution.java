// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/12900

class Solution {
    public int solution(int n) {
        int[] ans = new int[n+1];
        for(int a = 0; a <= n; a++){
            int tmp = 0;
            if(a == 0) tmp = 1;
            if(a >= 1) tmp += ans[a-1];
            if(a >= 2) tmp += ans[a-2];
            ans[a] = tmp%1000000007;
        }
        return ans[n];
    }
}