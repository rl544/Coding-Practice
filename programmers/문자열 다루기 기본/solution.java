// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/12918

class Solution {
    public boolean solution(String s) {
        boolean ss = true;
        try{
            Integer.parseInt(s);
        }catch(Exception e){
            ss = false;
        }
        return ((s.length() == 4 || s.length() == 6) && ss);
    }
}