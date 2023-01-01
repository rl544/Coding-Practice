// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/131127

import java.util.HashMap;
import java.util.Arrays;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        HashMap<String,Integer> hm = new HashMap<>(), hm2 = new HashMap<>();
        for(int a = 0; a < want.length; a++){
            hm2.put(want[a],number[a]);
        }
        for(int a = 0; a <= discount.length-10; a++){
            boolean ans = true;
            hm.clear();
            for(String s : want) if(!discount[a].equals(s)) continue;
            for(int b = a; b <= a + 9; b++){
                hm.put(discount[b],hm.getOrDefault(discount[b],0)+1);
            }
            for(String s : want){
                if(hm.getOrDefault(s,0)!=hm2.get(s)){
                    ans = false;
                    break;
                }
            }
            if(ans) answer++;
        }
        return answer;
    }
}