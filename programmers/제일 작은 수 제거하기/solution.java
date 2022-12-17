// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/12935

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length-1];
        int temp = arr[0];
        for(int a = 0; a< arr.length; a++){
            temp = Math.min(arr[a],temp);
        }
        int e = 0;
        for(int b = 0; b < arr.length-1; b++){
            if(arr[e]==temp) {
                b--;
            }
            else answer[b] = arr[e];
            e++;
        }
        int[] minus = {-1};
        return ((answer.length==0)?minus:answer);
    }
}