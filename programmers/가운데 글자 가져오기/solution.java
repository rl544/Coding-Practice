// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/12903

class Solution {
    public String solution(String s) {
        String answer = "";
        int a = s.length();
        if(a%2==0) answer = s.substring(a/2-1,a/2+1);
        else answer = String.valueOf(s.charAt(a/2));
        return answer;
    }
}