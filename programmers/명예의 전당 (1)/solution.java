// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/138477

import java.util.ArrayList;
import java.util.Collections;
class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer2 = {};
        ArrayList <Integer> answer = new ArrayList();
        ArrayList <Integer> hall = new ArrayList();
        for(int i = 0; i < score.length; i++){
            if(i > k-1){
                if(score[i] > hall.get(0)){
                    hall.add(score[i]);
                    hall.remove(hall.get(0));
                }
            }
            else hall.add(score[i]);
            Collections.sort(hall);
            answer.add(hall.get(0));
        }
        answer2 = new int[answer.size()];
        for (int i = 0; i < answer.size(); i++) {
            answer2[i] = answer.get(i);
        }
        return answer2;
    }
}