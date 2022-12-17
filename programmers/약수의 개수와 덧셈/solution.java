// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/77884

class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        for(int a = left; a <= right; a++){
            int c = 1;
            for(int b = 1; b <= a/2; b++){
                c+=(a%b==0)?1:0;
            }
            if(c%2==0) answer+= a;
            else answer -= a;
        }
        return answer;
    }
}