// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/131128

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
class Solution {
    public String solution(String X, String Y) {
        String answer = "";
        LinkedList<Integer> an = new LinkedList<>();
        HashMap<Integer, Integer> hash = new HashMap<>();
        HashMap<Integer, Integer> hash2 = new HashMap<>();
        char[] yy = Y.toCharArray();
        char[] xx = X.toCharArray();
        for(char cy : yy){
            int nn = Character.getNumericValue(cy);
            hash.put(nn,hash.getOrDefault(nn,0)+1);
        }
        for(char cx : xx){
            int nn = Character.getNumericValue(cx);
            hash2.put(nn,hash2.getOrDefault(nn,0)+1);
        }
        for(Integer key : hash.keySet()){
            if(hash2.getOrDefault(key,0)==0) continue;
            Integer count = Math.min(hash.get(key),hash2.get(key));
            for(int oo = 0; oo < count; oo++)
            an.add(key);
        }
        Object[] ans = an.toArray();
        answer = Arrays.stream(ans).map(String::valueOf).sorted(Comparator.reverseOrder()).collect(Collectors.joining());
        answer = (answer.equals(""))? "-1" : answer;
        answer = (answer.matches("^0+")) ? "0" : answer;
        return answer;
    }
}