// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/42576

import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        Arrays.sort(participant);
        Arrays.sort(completion);

        for(int i=0; i<participant.length; i++) {
            if(!participant[i].equals(completion[i])) {
                answer = participant[i];
                break;
            }
            if(i == completion.length) {
                answer = participant[i];
                break;
            } 
        }

        return answer;
    }
}