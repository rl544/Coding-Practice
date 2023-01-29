// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/42883

import java.lang.StringBuilder;
class Solution {
    public String solution(String number, int k) {
        StringBuilder sb = new StringBuilder();
        int len = number.length(), obSize = len - k, idx = 0;
        for(int pos = 0; obSize > 0; pos++, obSize--){
            char cM = 0;
            for (int i = pos; i <= len - obSize; i++){
                if (number.charAt(i) > cM){
                    cM = number.charAt(i);
                    pos = i;
                }
            }
            sb.append(cM);
        }
        return sb.toString();
    }
}