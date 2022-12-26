// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/42578

import java.util.HashMap;
class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String,Integer> hss = new HashMap<>();
        for(String[] sett : clothes){
            hss.put(sett[1],hss.getOrDefault(sett[1],0)+1);
       }
        for(String key : hss.keySet()){
            answer*=(hss.get(key)+1);
        }
        return answer-1;
    }
}