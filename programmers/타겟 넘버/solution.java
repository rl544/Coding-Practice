// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/43165

import java.util.List;
import java.util.ArrayList;
class Solution {
    //BFS
    public int solution(int[] numbers, int target) {
        int answer = 0;
        List<Integer> leaves = List.of(0);
        for(int num : numbers){
            List<Integer> tmp = new ArrayList<>();
            for(int parent : leaves){
                tmp.add(parent + num);
                tmp.add(parent - num);
            }
            leaves = tmp;
        }
        for(int leaf : leaves){
            if(leaf==target) answer ++;
        }
        return answer;
    }
}