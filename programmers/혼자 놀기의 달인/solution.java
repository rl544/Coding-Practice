// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/131130

import java.util.*;
import java.util.stream.*;
class Solution {
    public int solution(int[] cards) {
        int answer = 0, first = 0, temp = 0;
        HashMap<Integer,Boolean> hm = new HashMap<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b - a), ar = new PriorityQueue<>(Arrays.stream(cards).boxed().collect(Collectors.toList()));
        while(ar.size()>0){
            int fc = 0;
            if(!hm.getOrDefault(ar.peek(),false)) {
                temp = ar.peek();
                while(ar.size()>0){
                    if(!hm.getOrDefault(temp,false)) {
                        hm.put(temp,true);
                        ar.remove(temp);
                        fc++;
                    }
                    else break;
                    temp = cards[temp-1];
                }
                pq.add(fc);
            } else break;
        }
        return (pq.size()<2)?0:pq.poll()*pq.poll();
    }
}