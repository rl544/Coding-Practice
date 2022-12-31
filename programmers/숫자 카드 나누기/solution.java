// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/135807

import java.util.*;
class Solution {
    private int cdd(int[] ar, int[] arrayB){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int a : ar) pq.add(a);
        int end = pq.peek(), answer = 0;
        pq.clear();
        for(int b = end; b >= 2; b--){
            boolean all = true;
            for(int a : ar){
                if(a%b!=0) {
                    all = false;
                    break;
                }
            }
            if(all) {
                boolean ball = true;
                for(int c : arrayB){
                    if(c%b==0){
                        ball = false;
                        break;
                    }
                }
                if(ball){
                    answer = b;
                    break;
                }
            }
        }
        return answer;
    }
    public int solution(int[] arrayA, int[] arrayB) {
        return Math.max(cdd(arrayA,arrayB),cdd(arrayB,arrayA));
    }
}