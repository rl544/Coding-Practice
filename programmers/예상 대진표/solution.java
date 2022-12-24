// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/12985

class Solution{
    public int solution(int n, int a, int b){
        return Integer.toBinaryString((a-1)^(b-1)).length();
    }
}