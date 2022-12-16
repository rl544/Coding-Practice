// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/68644

import java.util.HashSet;
class Solution {
    public int[] solution(int[] numbers) {
        HashSet<Integer> answer = new HashSet<Integer>();
        for(int a = 0; a < numbers.length-1; a++){
            for(int b = a+1; b < numbers.length; b++){
                answer.add(numbers[a]+numbers[b]);
            }
        }
        return answer.stream().sorted().mapToInt(x->x.intValue()).toArray();
    }
}