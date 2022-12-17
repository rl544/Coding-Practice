// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/12906#

import java.util.*;
public class Solution {
    public int[] solution(int []arr) {
        LinkedList<Integer> q = new LinkedList<Integer>();
        for(int b : arr){
            if(q.peekLast() != null && b == q.peekLast()) continue;
            else q.add(b);
        }//list 상태에서도 가능하지만 array가 수요이니 array로 변환합니다.
        return q.stream().mapToInt(Integer::intValue).toArray();
    }
}