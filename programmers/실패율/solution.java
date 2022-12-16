// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/42889

import java.util.*;
import java.lang.*;
import java.util.stream.Collectors;

class Solution {
    private double lossLate(int a, int[] stages){
        int total = 0;
        int aa = 0;
        for(int b : stages){
            if(b>=a) total += 1;
            if(b == a) aa += 1;
        }
        return (aa != 0) ? (double) aa / total : 0;
    }
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        Integer istages[] = Arrays.stream(stages).boxed().toArray(Integer[]::new); 
        HashMap<Integer, Double> results = new HashMap<>();
        for (int c = 1; c <= N; c++) results.put(c,lossLate(c,stages));
        List<Map.Entry<Integer, Double>> rlist = results.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toList());
        int cc = 0;
        System.out.println(rlist);
        for(Map.Entry<Integer, Double> rs : rlist) answer[cc++] = rs.getKey();
        return answer;
    }
}