// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/147355

import java.lang.StringBuilder;
class Solution {
    public int solution(String t, String p) {
        StringBuilder sb = new StringBuilder();
        int answer = 0, len = p.length();
        long ip = Long.parseLong(p);
        for(int a = 0; a < t.length()-len+1; a++){
            for(int b = a; b < a+len; b++) sb.append(t.charAt(b));
            if(Long.parseLong(sb.toString())<=ip) answer++;
            sb.setLength(0);
        }
        return answer;
    }
}