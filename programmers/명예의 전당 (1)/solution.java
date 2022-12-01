// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/138477

import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int l = score.length;
        int[] answer = new int[l];
        PriorityQueue<Integer> que1 = new PriorityQueue<>();
        for (int i = 0; i < l; i++){
            que1.add(score[i]);
            if(que1.size() > k) que1.poll();
            answer[i] = que1.peek();
        }        
        return answer;
    }
}