// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/42746#

import java.util.*;
import java.lang.StringBuilder;
class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        Comp comp = new Comp();
        StringBuilder sb = new StringBuilder();
        String[] nb = new String[numbers.length];
        for(int a = 0; a < numbers.length; a++){
            nb[a] = String.valueOf(numbers[a]);
        }
        Arrays.sort(nb,comp);
        for(String s : nb) sb.append(s);
        return (sb.charAt(0)=='0')?"0":sb.toString();
    }
    public class Comp implements Comparator<String> {
        public int compare(String a, String b) {
            // int l, r;
            if(a.equals("0")&&b.equals("0")) return 0;
            
            int l = Integer.valueOf((a.charAt(0)=='0')?b:a+b), r = Integer.valueOf((b.charAt(0)=='0')?a:b+a);
            if(l>r) return -1;
            else return 1;
        }
    }
}