// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/42747

import java.util.Arrays;
class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        int mlen = citations.length;
        Arrays.sort(citations);
        for(int c = (citations.length+1)/2; c <= mlen; c++){
            if(citations[mlen-c] >= c) {
                answer =  c;
                System.out.println(c + " " + citations[mlen-c]);
            } else break;
        }
        System.out.println(Arrays.toString(citations));
        return answer;
    }
}