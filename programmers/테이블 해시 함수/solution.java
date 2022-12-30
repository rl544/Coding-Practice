// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/147354

import java.util.*;
import java.util.stream.*;
class Solution {
    private int S_i(int[] a, int i) {return IntStream.of(a).mapToObj(b -> b%i).mapToInt(b->b).sum();}
    public int solution(int[][] data, int col, int row_begin, int row_end) {
        int answer = 0;
        List<int[]> al = Arrays.asList(data);
        al.sort((o1,o2) -> o2[0] - o1[0]);
        al.sort((o1,o2) -> o1[col-1] - o2[col-1]);
        for(int c = row_begin; c <= row_end; c++) answer ^= S_i(al.get(c-1),c);
        return answer;
    }
}