// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/1845

import java.util.HashMap;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        HashMap<Integer, Integer> hash = new HashMap<>();
        for(int a : nums){
            hash.put(a,hash.getOrDefault(a,0)+1);
        }
        for(Integer b : hash.keySet()){
            answer += 1;
        }
        return (answer > nums.length/2) ? nums.length/2 : answer;
    }
}