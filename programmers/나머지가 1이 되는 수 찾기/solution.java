// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/87389

class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i < n; i++){
            if(n%i==1){
                answer = i;
                break;
            }
        }
        return answer;
    }
}