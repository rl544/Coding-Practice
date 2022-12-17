// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/12910

import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = new int[arr.length];
        Arrays.sort(arr);
        int b = 0;
        for(int a : arr){
            if(a%divisor==0){
                answer[b++] = a;
            }
        }
        answer=Arrays.copyOfRange(answer,0,b);
        return (answer.length==0)?(new int[] {-1}):answer;
    }
}