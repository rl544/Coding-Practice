// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/118666

import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        HashMap<Character,Integer> score = new HashMap<>();
        for (int i = 0; i < choices.length; i++){
            Integer ch = choices[i]-4;
            Character cc = (ch <= 0) ? survey[i].charAt(0) : survey[i].charAt(1);
            score.put(cc, score.getOrDefault(cc,0)+Math.abs(ch));
        }
        String[] typ = {"RT","CF","JM","AN"};
        for (String i : typ){
            if(score.getOrDefault(i.charAt(0),0) >= score.getOrDefault(i.charAt(1),0)) answer += i.charAt(0);
            else answer += i.charAt(1);
        }
        return answer;
    }
}