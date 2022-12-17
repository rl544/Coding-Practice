// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/70129

class Solution {
    private static int[] bin(String s, int c, int zc){
        int temp = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i)=='0') temp++;
        }
        s= Integer.toBinaryString(s.length()-temp);
        zc+=temp;
        c ++;
        return (s.length()==1)? (new int[] {c,zc}) : bin(s,c,zc);
    }
    public int[] solution(String s) {
        return bin(s,0,0);
    }
}