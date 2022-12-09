// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/12937

class Solution {
    public String solution(int num) {
        return (Math.abs(num) % 2 == 1) ? "Odd" : "Even";
    }
}