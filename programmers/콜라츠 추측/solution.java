// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/12943

class Solution {
    public int solution(long num) {
        int answer = 0;
        for(int i = 0; i < 501; i++){
            if(num == 1){
                answer = i;
                break;
            }
            if(i== 500) {
                answer = -1;
                break;
            }
            if(num%2==0) num /= 2;
            else num = 3 * num + 1;
        }
        return answer;
    }
}