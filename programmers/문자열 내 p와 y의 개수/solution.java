// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/12916

class Solution {
    boolean solution(String s) {
        int count = 0;
        for (char c : s.toLowerCase().toCharArray()){
            if(c == 'p') count += 1;
            else if(c == 'y') count -= 1;
        }
        return count == 0;
    }
}