// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/12933

import java.util.Arrays;
import java.util.*;
class Solution {
    public long solution(long n) {
        long answer = 0;
        String c = n+"";
        char[] ca = c.toCharArray();
        Arrays.sort(ca);
        return Long.parseLong((new StringBuilder(String.valueOf(ca))).reverse().toString());
    }
}