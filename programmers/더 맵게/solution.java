// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/42626

import java.util.*;
class Solution {
    private int scv(int a, int b){
        return a + (b*2); 
    }
    public int solution(int[] scoville, int K) {
        int answer = 0;
        boolean notHot = true;
        PriorityQueue<Integer> st = new PriorityQueue<>();
        for(int i = 0; i < scoville.length; i++) st.add(scoville[i]);
        while(notHot){
            if(st.size()==0 || st.peek()<K){
                if(st.size() <= 1){
                    answer = -1;
                    break;
                }
                st.add(scv(st.poll(),st.poll()));
                answer++;
            } else notHot = false;
        }
        return answer;
    }
}