// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/12931

import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int a : (n+"").toCharArray()){
            answer += Character.getNumericValue(a);
        }
        return answer;
    }
}