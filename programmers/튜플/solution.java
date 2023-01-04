// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/64065

import java.util.Arrays;
import java.util.LinkedHashSet;
class Solution {
    public int[] solution(String s) {
        int[] answer = {};
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        s = s.substring(2,s.length()-2);
        String[] sa = s.replaceAll("\\}\\,\\{"," ").split(" ");
        Arrays.sort(sa,((a,b)->a.length()-b.length()));
        // System.out.println(Arrays.toString(sa));
        // System.out.println(sa.length);
        for(String st : sa){
            for(String in : st.split(",")){
                lhs.add(Integer.parseInt(in));
            }
        }
     return lhs.stream().mapToInt(i->i).toArray();
    }
}