// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/12932

class Solution {
    public int[] solution(long n) {
        char[] ca = (n+"").toCharArray();
        int[] answer = new int[ca.length];
        for(int a = 0; a < ca.length; a++){
            answer[ca.length-a-1]=Character.getNumericValue(ca[a]);
        }
        return answer;
    }
}