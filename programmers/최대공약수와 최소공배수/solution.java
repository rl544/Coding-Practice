// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/12940

class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int maxCo = 1;
        int minCo = 1;
        for(int a = 1; a <= n; a++){
            if(n%a==0 && m%a==0) maxCo = a;
            else if(n/a<2 && m/a<2) break;
        }
        int d = 1;
        int e = 1;
        while(true){
            if(Math.max(n,m)*d==Math.min(n,m)*e) {
                minCo = Math.min(n,m)*e;
                break;
            }
            else if(Math.max(n,m)*d<Math.min(n,m)*e){
                d++;
                e = 1;
            }
            else e++;
        }
        answer[0] = maxCo;
        answer[1] = minCo;
        return answer;
    }
}