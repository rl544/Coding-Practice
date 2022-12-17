// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/12901

class Solution {
    private static int date(int a, int b){
        int res = 0;
        if(a > 2){
            if(a<=7){
                res = 60 + (a-3)*30 + b + (a-2)/2;
            } else{
                res = 60 + 153 + (a-8)*30 + b + (a-7)/2;
            }
        }else{
            res = (a-1)*31 + b;
        }
        return res;
    }
    private static String name(int date){
        String[] name = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
        //시작일이 금요일이므로.
        return name[(date+4)%7];
    }
    public String solution(int a, int b) {
        return name(date(a,b));
    }
}