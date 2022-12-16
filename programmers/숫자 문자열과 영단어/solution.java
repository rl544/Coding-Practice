// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/81301

class Solution {
    public int solution(String s) {
        String[] sa = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        for(int a = 0; a < 10; a++){
            s = s.replaceAll(sa[a],a+"");
        }
        return Integer.valueOf(s);
    }
}