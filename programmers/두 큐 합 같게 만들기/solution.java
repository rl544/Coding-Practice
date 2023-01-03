// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/118667

import java.util.*;
import java.util.stream.*;
class Solution {
    public long solution(int[] queue1, int[] queue2) {
        long answer = 0;
        Queue<Integer> q = new LinkedList<>(Arrays.stream(queue1).boxed().collect(Collectors.toList())),
         q2 = new LinkedList<>(Arrays.stream(queue2).boxed().collect(Collectors.toList()));
        long temp = 0, temp2 = 0;
        int sur = 0, tot = q.size()+q2.size();
        for(int a : queue1) temp += a;
        for(int a : queue2) temp2 += a;
        // temp = q.stream().mapToInt(i->i).sum();
        // temp2 = q2.stream().mapToInt(i->i).sum();
        while(temp!=temp2){
            if(temp>temp2){
                sur = q.poll();
                q2.add(sur);
                temp -= sur;
                temp2 += sur;
            } else {
                sur = q2.poll();
                q.add(sur);
                temp += sur;
                temp2 -= sur;
            }
            answer++;
            if(temp==0||temp2==0||answer > tot*2) {
                answer = -1;
                break;
            }
        }
        return answer;
    }
}