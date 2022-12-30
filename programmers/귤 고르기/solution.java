// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/138476

import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int answer = 0;
        for(int a : tangerine) hm.put(a,hm.getOrDefault(a,0)+1);
        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(hm.entrySet());
        list.sort(((o1, o2) -> o2.getValue() - o1.getValue()));
        for(Map.Entry<Integer,Integer> m : list){
            answer++;
            if(k>m.getValue()) k -= m.getValue();
            else break;
        }
        return answer;
    }
}