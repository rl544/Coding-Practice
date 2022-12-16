// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/12921

class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int a = 2; a<=n; a++){
            int t = 0;
            for(int b=2; b<=Math.sqrt(a); b++){
                if(a%b==0) {
                    t = 1;
                    break;
                }
            }
            if(t == 0) answer+= 1;
        }
        return answer;
    }
}