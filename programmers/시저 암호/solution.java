// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/12926

class Solution {
    public String solution(String s, int n) {
        String answer = "";
        char[] sol = s.toCharArray();
        for(int i = 0; i < sol.length; i++){
            if(sol[i] != ' '){
                if(sol[i] >= 'a' && sol[i] <= 'z' && sol[i] + n > 'z') sol[i] += n - 'z' + 'a' -1;
                    else if(sol[i] >= 'A' && sol[i] <= 'Z' && sol[i] + n > 'Z') sol[i] += n -'Z' + 'A' -1;
                        else sol[i] += n;
            }
        }
        return String.valueOf(sol);
    }
}