// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/131128

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
class Solution {
    public String solution(String X, String Y) {
        String answer = "";
        LinkedList<Integer> linkedList = new LinkedList<>();
        HashMap<Integer, Integer> hash = new HashMap<>(), hash2 = new HashMap<>();
        for(char y : Y.toCharArray()){
            int number = Character.getNumericValue(y);
            hash.put(number,hash.getOrDefault(number,0)+1);
        }
        for(char x : X.toCharArray()){
            int number = Character.getNumericValue(x);
            hash2.put(number,hash2.getOrDefault(number,0)+1);
        }
        for(Integer key : hash.keySet()){
            if(hash2.getOrDefault(key,0)==0) continue;
            int count = Math.min(hash.get(key),hash2.get(key));
            for(int z = 0; z < count; z++)
            linkedList.add(key);
        }
        answer = Arrays.stream(linkedList.toArray()).map(String::valueOf)
            .sorted(Comparator.reverseOrder()).collect(Collectors.joining());
        return (linkedList.isEmpty())?"-1":((answer.charAt(0)=='0')?"0":answer);
    }
}