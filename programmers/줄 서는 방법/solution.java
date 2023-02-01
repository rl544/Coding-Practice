// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/12936

import java.util.ArrayList;
class Solution {
    public int[] solution(int n, long k) {
        ArrayList<Integer> al = new ArrayList<>();
        int[] answer = new int[n];
        int pos, len = n;
        long div, tmp, fact = 1;
        for(int f = n; f >= 2; f--) fact *= f;
        for(int a = 1; a <= len; a ++) al.add(a);
        for(int a = 0; a < len; div = fact/n, pos = (int)((k-1)/div), answer[a] = al.remove(pos), k -= pos*div, fact /= n, n--, a++) continue; // 별 의미는 없지만 이런 식으로 안의 내용을 for 괄호 내에 다 때려박아서 줄일수 있다.
        return answer;
    }
}