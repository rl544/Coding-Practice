// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/81301?language=java

class Solution {
    public int solution(String s) {
        int[] na = {0,1,2,3,4,5,6,7,8,9};
        String[] sa = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        for(int a = 0; a < 10; a++){
            s = s.replaceAll(sa[a],na[a]+"");
        }
        return Integer.valueOf(s);
    }
}