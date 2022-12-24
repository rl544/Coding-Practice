// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/12980

public class Solution {
    public int solution(int n) {
        int ans = 0;
        String ns = Integer.toBinaryString(n);
        for(char a : ns.toCharArray()){
            ans += Character.getNumericValue(a);
        }
        return ans;
    }
}