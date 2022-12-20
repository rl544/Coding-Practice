// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/42842

class Solution {
    public int[] solution(int brown, int yellow) {
        int a = (brown + 4)/2; //x+y
        int b = brown + yellow; // xy
        return new int[] {(int) (Math.sqrt(a*a-4*b)+a)/2, (int)(a-(Math.sqrt(a*a-4*b)+a)/2)};
    }
}