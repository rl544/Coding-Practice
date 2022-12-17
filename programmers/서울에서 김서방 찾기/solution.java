// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/12919

class Solution {
    public String solution(String[] seoul) {
        int n = 0;
        for(int a = 0; a < seoul.length; a++){
            if(seoul[a].equals("Kim")) {
                n = a;
                break;
            }
        }
        String answer = "김서방은 "+n+"에 있다";
        return answer;
    }
}