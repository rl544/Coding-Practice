// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/68645

import java.util.*;
class Solution {
    int max;
    public int[] solution(int n) {
        int cnt = 0, f = 0, idx = 0;
        max = (n*(n+1))/2;
        ArrayList<int[]> al = new ArrayList<>();
        for(int a = 0; a < n; a++) al.add(new int[a+1]);
        int a = -1, b = 0, state = 0;
        while(cnt<max){
            switch(state){
                case 0: for(a++; a < n-f; a++) job(al,a,b,cnt++); a--; f++; state++; break;
                case 1: for(b++; b < n-2*(f-1); b++) job(al,a,b,cnt++); b--; state++; break;
                case 2: for(a--,b--; b >= f; a--,b--) job(al,a,b,cnt++); a++;b++; state = 0; break;
            }
        } // for(int d = 0; d < n; d++) System.out.println(Arrays.toString(al.get(d)));
        int[] answer = new int[max];
        for(int d = 0; d < n; d++){
            int[] temp = al.get(d);
            for(int q = 0; q <= d; q++) answer[idx++] = temp[q];
        }
        return answer;
    }
    public void job(ArrayList<int[]> al, int a, int b, int data){
        int[] temp = al.get(a);
        temp[b] = data+1;
    }
}