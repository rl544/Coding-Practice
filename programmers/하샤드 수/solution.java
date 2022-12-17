// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/12947

class Solution {
    public boolean solution(int x) {
        int b = 0;
        for(char a : (x+"").toCharArray()){
            b += Character.getNumericValue(a);
        }
        return (x%b==0);
    }
}