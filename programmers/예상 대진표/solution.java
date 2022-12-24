// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/12985

class Solution
{
    static double baseLog(double x, double base) {
        return Math.log10(x) / Math.log10(base);
    }
    private int next(int a){
        return (a+1)/2;
    }
    public int solution(int n, int a, int b)
    {
        int answer = 0;
        System.out.println(a+" "+b);
        for(int c = 1; c<= baseLog(n,2); c++){
            answer = c;
            System.out.println(a+" "+b);
            if((int)Math.abs(a-b)==1 && Math.min(a,b)%2==1) break;
            a = next(a);
            b = next(b);
        }
        return answer;
    }
}