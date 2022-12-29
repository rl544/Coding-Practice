// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/148652

class Solution {
    private int bits(long index){
        String bar = "11011";
        int answer = 0, base = 1;
        if(index <= 5){
            for(int a = 0; a < index; a++) if(bar.charAt(a)=='1') answer++;
            return answer;
        }
        while(Math.pow(5,base+1)<index) base++;
        int section = (int)(index / (long)Math.pow(5,base));
        int remainder = (int)(index % (long)Math.pow(5,base));
        answer = section * (int)Math.pow(4,base);
        if(section >= 3) answer -= (int)Math.pow(4,base);
        if(section == 2) return answer;
        else return answer + bits(remainder);
    }
    public int solution(int n, long l, long r) {
        return bits(r)-bits(l-1);
    }
}