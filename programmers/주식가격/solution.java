// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/42584

import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Deque<Integer> dq = new ArrayDeque<>();
        for(int c: prices){
            dq.addLast(c);
        }
        for(int a = 0; a < prices.length; a++){
            int ck = dq.pollFirst();
            int time = 0;
            Iterator<Integer> it = dq.iterator();
            while(it.hasNext()){
                if(it.next()>=ck) time++;
                else {
                    time++;
                    break;
                }
                
            }
            answer[a]=time;
        }
        return answer;
    }
}