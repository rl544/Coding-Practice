// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/42748

import java.util.*;
import java.util.stream.IntStream;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int index = 0;
        for(int[] a : commands){
            int i = a[0];
            int j = a[1];
            int k = a[2];
            int[] res = IntStream.range(i, j + 1)
                                .map(o -> array[o-1]).sorted()
                                .toArray();
            answer[index++] = res[k-1];
        }
        return answer;
    }
}