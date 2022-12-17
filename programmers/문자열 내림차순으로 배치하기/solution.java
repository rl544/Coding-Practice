// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/12917

import java.util.*;
import java.lang.StringBuilder;
class Solution {
    public String solution(String s) {
        char[] ca = s.toCharArray();
        Arrays.sort(ca);
        return (new StringBuilder(String.valueOf(ca))).reverse().toString();
    }
}