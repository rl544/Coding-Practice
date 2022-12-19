// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/76502

import java.lang.StringBuilder;
import java.util.Stack;
class Solution {
    private String lm(String s, int x){
        StringBuilder ss = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            ss.append(s.charAt((i+x)%s.length()));
        }
        return ss.toString();
    }
    public long solution(String s) {
        long answer = 0;
        for(int x = 0; x < s.length(); x++){
            int[] ck = {0, 0, 0};
            Stack<Integer> st = new Stack<>();
            int temp = 0, state = 0;
            state = 0;
            for(char a : lm(s, x).toCharArray()){
                int stack = 0, ts = 0, sign = -1;
                for(int j = 0; j < 3; j++){
                    if(ck[j] > 0){
                        state = 1;
                        break;
                    }
                }
                if(a == '(') {
                    stack = 0;
                    st.push(stack);
                    sign = -1;
                }
                if(a == '[') {
                    stack = 1;
                    st.push(stack);
                    sign = -1;
                }
                if(a == '{') {
                    stack = 2;
                    st.push(stack);
                    sign = -1;
                }
                if(a == ')') {
                    ts = 0;
                    if(st.empty()||st.pop()!=ts) {
                        state = 1;
                        break;
                    }
                    stack = ts;
                    sign = 1;
                }
                if(a == ']')  {
                    ts = 1;
                    if(st.empty()||st.pop()!=ts) {
                        state = 1;
                        break;
                    }
                    stack = ts;
                    sign = 1;
                }
                if(a == '}')  {
                    ts = 2;
                    if(st.empty()||st.pop()!=ts) {
                        state = 1;
                        break;
                    }
                    stack = ts;
                    sign = 1;
                }
                ck[stack] += 1 * sign;
                if(state > 0) break;
            }
            
            if(state > 0) continue;
            for(int j = 0; j < 3; j++){
                System.out.println(ck[j]);
                if(ck[j] == 0) temp ++;
            }
            if(temp == 3) answer ++;
        }
        return answer;
    }
}