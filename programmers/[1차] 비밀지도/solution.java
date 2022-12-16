// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/17681?language=java

import java.lang.StringBuilder;
class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        StringBuilder sb = new StringBuilder();
        for(int a = 0; a < n; a++){
            int org1 = arr1[a];
            int org2 = arr2[a];
            for(int b = n-1; b >= 0; b--){
                if(org1/(int)Math.pow(2,b) + org2/(int)Math.pow(2,b) > 0){
                    org1 -= (org1/(int)Math.pow(2,b) > 0) ? (int)Math.pow(2,b) : 0;
                    org2 -= (org2/(int)Math.pow(2,b) > 0) ? (int)Math.pow(2,b) : 0;
                    sb.append("#");   
                } 
                else sb.append(" ");
            }
            answer[a] = sb.toString();
            sb.setLength(0);
        }
        return answer;
    }
}