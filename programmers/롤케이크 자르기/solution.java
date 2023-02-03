// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/132265

import java.util.*;

class Solution {
    public int solution(int[] topping) {
        Cake cake = new Cake();
        return cake.split(topping);
    }
}

class Cake {
    private Map<Integer, Integer> myTopping = new HashMap<>();
    private Set<Integer> brothersTopping = new HashSet<>();

    private void putToppingCnt(int[] toppings) {
        for (int topping : toppings) {
            int cnt = myTopping.getOrDefault(topping, 0);
            myTopping.put(topping, cnt + 1);
        }
    }

    public int split(int[] toppings) {
        putToppingCnt(toppings);
        return toppingEqualCnt(toppings);
    }

    private int toppingEqualCnt(int[] toppings) {
        int equalCnt = 0;

        for (int topping : toppings) {
            moveTopping(topping);

            if (myTopping.size() < brothersTopping.size()) {
                break;
            }

            if (myTopping.size() == brothersTopping.size()) {
                equalCnt++;
            }
        }

        return equalCnt;
    }

    private void moveTopping(int topping) {
        brothersTopping.add(topping);
        int toppingCnt = myTopping.get(topping);

        if (toppingCnt == 1) {
            myTopping.remove(topping);
            return;
        }

        myTopping.put(topping, toppingCnt - 1);
    }
}