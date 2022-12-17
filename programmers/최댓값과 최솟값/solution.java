// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/12939?language=java

class Solution {
    public String solution(String s) {
        String[] ss = s.split(" ");
        int a = Integer.parseInt(ss[0]), min = a, max = a;
        for(String sc : ss){
            a = Integer.parseInt(sc);
            min = Math.min(min,a);
            max = Math.max(max,a);
        }
        return min+" "+max;
    }
}