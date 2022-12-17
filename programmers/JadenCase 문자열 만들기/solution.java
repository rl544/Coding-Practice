// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/12951

class Solution {
    public String solution(String s) {
        char[] ss = s.toLowerCase().toCharArray();
        int index = 0;
        for(int i = 0; i < ss.length; i++){
            if(i==0||index==0&&ss[i]!=' ') ss[i] = Character.toUpperCase(ss[i]);
            if(ss[i]==' ') index=0;
            else index++;
        }
        return String.valueOf(ss);
    }
}