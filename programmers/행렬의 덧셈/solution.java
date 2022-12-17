// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/12950

class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = arr1;
        for(int a = 0; a < arr1.length; a++){
            for(int b = 0; b < arr1[0].length; b++){
                answer[a][b]+=arr2[a][b];
            }
        }
        return answer;
    }
}