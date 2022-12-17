// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/12969

import java.util.Scanner;
import java.lang.StringBuilder;
class Solution {
    public static void main(String[] args) {
        StringBuilder test = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for(int c = 0; c < b; c++){
            for(int d = 0; d < a; d++){
                test.append('*');
            }
            System.out.println(test);
            test.setLength(0);
        }
    }
}