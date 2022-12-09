// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/12944

import java.util.*;
class Solution {
    public double solution(int[] arr) {
        return Arrays.stream(arr).mapToDouble(num -> num).average().getAsDouble();
    }
}