// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/132267

class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int c = 0;
        while(n >= a){
            c = n/a;
            n = n + c * (b - a);
            answer += c * b;
            System.out.println(answer);
        }
        return answer;
    }
}