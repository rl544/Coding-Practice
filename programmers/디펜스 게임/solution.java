// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/142085

import java.util.PriorityQueue;
class Solution {
    public int solution(int n, int k, int[] enemy) {
        int answer = 0, min = enemy[0]; // k = defence
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int a = 0; a < Math.min(k,enemy.length); a++) {
            pq.add(enemy[a]);
            answer++;
        }
        for(int a = k; a < enemy.length; a++){
            if(n==0) break;
            if(enemy[a]>pq.peek()){
                if(n >= pq.peek()){
                    n -= pq.poll();
                    pq.add(enemy[a]);
                    answer++;
                    continue;
                } else break;
            }
            if(n >= enemy[a]){
                n -= enemy[a];
                answer++;
            } else break;
        }
        return answer;
    }
}