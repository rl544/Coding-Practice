// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/82612

import java.math.*;
import java.util.*;
class Solution {
    public long solution(int price, int money, int count) {
        BigDecimal line = new BigDecimal("0");
        BigDecimal b2 = new BigDecimal("2");
        line = new BigDecimal(count).multiply(new BigDecimal(count).add(new BigDecimal(1))).divide(b2);
        System.out.println(line);
        return (price*line.longValue()>money) ? (long)(price*line.longValue()-money) : 0;
    }
}