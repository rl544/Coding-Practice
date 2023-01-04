// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/12922

import java.lang.StringBuilder;
class Solution {
    public String solution(int n) {
        String wm = "수박";
        StringBuilder answer = new StringBuilder();
        for(int a = 0; a < n; a++){
            answer.append(wm.charAt(a%wm.length()));
        }
        return answer.toString();
    }
}
