// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/120956#

import java.util.*;
import java.util.stream.IntStream;
class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] able = {"aya","ye","woo","ma"};
        int[] ablei = {2,3,4,5,6,7,8,10};
        for(String b : babbling){
            int blen = b.length();
            if(IntStream.of(ablei).anyMatch(x -> x == blen)){
                for(String c : able){
                  b = b.replaceFirst(c,"1");
                }
                if(b.matches("1+")) answer += 1;
            } else continue;
        }
        return answer;
    }
}