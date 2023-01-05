// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/42746#

import java.util.*;
import java.lang.StringBuilder;
class Solution {
    public String solution(int[] numbers) {
        StringBuilder sb = new StringBuilder();
        String[] nb = new String[numbers.length];
        for(int a = 0; a < numbers.length; a++) nb[a] = String.valueOf(numbers[a]);
        Arrays.sort(nb,((a,b)-> ((a.equals("0")&&b.equals("0"))?0:((Integer.valueOf((a.charAt(0)=='0')?b:a+b) >Integer.valueOf((b.charAt(0)=='0')?a:b+a))?-1:1))));
        for(String s : nb) sb.append(s);
        return (sb.charAt(0)=='0')?"0":sb.toString();
    }
}