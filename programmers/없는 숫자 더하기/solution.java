// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/86051

import java.util.Arrays;
class Solution {
    public int increaseSum(){
        int first = 1;
        int last = 9;
        return (first+last)*last/2;
    }
    public int solution(int[] numbers) {
        int answer = increaseSum();
        int arrayS = Arrays.stream(numbers).sum();
        return answer-arrayS;
    }
}