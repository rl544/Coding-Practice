// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/136798

class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        for (int i = 1; i < number+1; i++){
            int count = 0;
            for (int j = 1; j * j <= i; j++) {
                if (j * j == i) count++;
                else if (i % j == 0) count += 2;
            }
            if (count > limit) answer = answer + power;
            else answer = answer + count;
        }
        return answer;
    }
}