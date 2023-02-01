// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/12936

import java.util.*;
class Solution {
    public int[] solution(int n, long k) {
        ArrayList<Integer> hs = new ArrayList<>();
        int[] test = new int[n];
        int pos, len = n;
        long div, tmp, fact = 1;
        for(int f = n; f >= 2; f--) fact *= f;
        for(int a = 1; a <= len; a ++) hs.add(a);
        for(int a = 0; a < len; a++, tmp = pos*div, k -= tmp, fact /= n, n--){
            div = (fact/n);
            pos = (int)((k-1)/div);
            test[a] = hs.get(pos);
            hs.remove(pos);
        }

        return test;
    }
}