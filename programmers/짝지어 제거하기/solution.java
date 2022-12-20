// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/12973

import java.util.Stack;
class Solution{
    public int solution(String s){
        Stack<Character> stack = new Stack<>();
        for(char ss : s.toCharArray()){
            if(!stack.empty() && stack.peek() == ss) stack.pop();
            else stack.push(ss);
        }
        return (stack.empty())?1:0;
    }
}