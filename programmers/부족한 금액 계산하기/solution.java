// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/82612

import java.math.*;
import java.util.*;
class Solution {
    public long solution(long price, int money, int count) {
        return Math.max(price*(count*(count+1))/2-money,0);
    }
}