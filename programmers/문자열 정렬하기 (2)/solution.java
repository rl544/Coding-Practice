// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/120911

import java.util.Arrays;
class Solution {
    public String solution(String m) {
        String answer = "";
        m = m.toLowerCase();
        char[] ma = m.toCharArray();
        Arrays.sort(ma);
        return String.valueOf(ma);
    }
}