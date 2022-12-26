// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/12949

class Solution {
    private int sol(int r, int c, int[][] arr1, int[][] arr2){
        int ans = 0, a = 0, b = 0;
        while(a < arr2.length && b < arr1[0].length){
            ans +=arr1[r][b++]*arr2[a++][c];
        }
        return ans;
    }
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int row = arr1.length, col = arr2[0].length, acol = arr1[0].length;
        int[][] answer = new int[row][col];
        for(int e = 0; e < row; e++){
            for(int f =0; f < col; f++){
                answer[e][f] = sol(e,f,arr1,arr2);
            }
        }
        
        return answer;
    }
}