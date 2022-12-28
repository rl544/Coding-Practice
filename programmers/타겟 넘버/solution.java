// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/43165

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
class Solution {
    //DFS
    private int dfs(int[] numbers, int target, int depth){
        int res = 0;
        if(depth == numbers.length){
            // System.out.println(Arrays.toString(numbers));
            if(Arrays.stream(numbers).sum() == target) return 1;
            else return 0;
        } else{
            res += dfs(numbers, target, depth+1);
            numbers[depth] *= -1;
            res += dfs(numbers, target, depth+1);
            return res;
        }
    }
    public int solution(int[] numbers, int target) {
        return dfs(numbers, target,0);
    }
}