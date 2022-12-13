// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/64061

import java.util.Arrays;
class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        int bRow = board.length;
        int sIndex = 0;
        int[] stack = new int[moves.length];
        for(int i : moves){
            for(int j = 0; j < bRow; j++){
                if(board[j][i-1]!=0){
                    if(sIndex > 0 && stack[sIndex-1] == board[j][i-1]){
                        answer += 2;
                        stack[sIndex--] = 0;
                    } else {
                        stack[sIndex++]=board[j][i-1];                  
                    }
                    board[j][i-1] = 0;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(stack));
        System.out.println(answer);
        return answer;
    }
}