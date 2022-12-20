// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/12973

class Solution
{
    public int solution(String s)
    {
        int idx = 0;
        char[] stack = new char[s.length()];
        for(char ss : s.toCharArray()){
            if(idx > 0 && stack[idx-1] == ss){
                idx -= 1;
            } else{
                stack[idx] = ss;
                idx++;
            }
        }
        return (idx==0)?1:0;
    }
}