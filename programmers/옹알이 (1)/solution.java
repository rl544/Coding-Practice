// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/120956#

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        for(String b : babbling){
           if(b.matches("^(aya(?!aya)|ye(?!ye)|woo(?!woo)|ma(?!ma))+$")) answer ++;
        }
        return answer;
    }
}