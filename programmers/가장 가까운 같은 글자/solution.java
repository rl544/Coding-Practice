// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/142086#

class Solution {
    public int[] solution(String s) {
        char[] ca = s.toCharArray();
        int len = ca.length;
        int[] answer = new int[len];
        for(int i = 0; i < len; i++){
            answer[i] = -1;
            for(int j = 1; j <= i ; j++){
                if(ca[i-j] == ca[i]){
                    answer[i] = j;
                    break;
                }
            }
        }
        return answer;
    }
}