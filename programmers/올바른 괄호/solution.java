// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/12909

class Solution {
    boolean solution(String s) {
        int cc = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i)=='(') cc++;
            else cc--;
            if(cc<0) break;
        }
        return cc==0;
    }
}