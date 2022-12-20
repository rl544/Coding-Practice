// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/42885#

import java.util.Arrays;
class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0, ll = 0;
        Arrays.sort(people);
        for(int p = 0; p < people.length; p++){
            if(people[p] > limit - people[0]) {
                ll = p;
                break;
            }
        }
        for(int p = ll; p < people.length; p++){
            if(people[p] > limit - people[0]) answer ++;
        }
        System.out.println(ll);
        if(ll!=0){
            int x = 0;
            for(int p = ll-1; p >= 0; p --){
                if(x == p) {
                    answer++;
                    x++;
                    break;
                }
                else if(p < x) break;
                if(people[x]+people[p] <= limit) {
                    answer ++;
                    x++;
                } else answer++;
            }
        }
        return answer;
    }
}