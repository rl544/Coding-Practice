// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/68936

import java.util.*;
class Solution {
    public int[] solution(int[][] arr) {
        return div(arr,0,0,arr.length,arr.length);
    }
    public int[] div(int[][] arr, int s, int sc, int e, int ec){
        int z = 0, o = 0, tmp = 0, cnt = 0;
        int[] ans = new int[2], tt = new int[2];
        if(s == 0 && sc == 0 && e == arr.length && ec == arr.length){
            for(int rr = 0; rr < e; rr++){
                for(int cc = 0; cc < ec; cc++){
                    tmp += arr[rr][cc];
                    cnt ++;
                }
            }
            if(cnt == 0) ;
            else if(tmp == 0) {
                ans[0] += 1;
                return ans;
            }
            else if(tmp == cnt) {
                ans[1] += 1;
                return ans;
            }            
        }
        if(e>1){
            tmp = 0;
            cnt = 0;
            for(int rr = s; rr < (s+e)/2; rr++){
                for(int cc = sc; cc < (sc+ec)/2; cc++){
                    tmp += arr[rr][cc];
                    cnt ++;
                }
            }
            if(cnt == 0) ;
            else if(tmp == 0) {
                ans[0] += 1;
            }
            else if(tmp == cnt) {
                ans[1] += 1;
            }
            else{
                tt = div(arr, s, sc, (s+e)/2, (sc+ec)/2);
                ans[0] += tt[0];
                ans[1] += tt[1];
            }
                
            tmp = 0;
            cnt = 0;
            for(int rr = s; rr < (s+e)/2; rr++){
                for(int cc = (sc+ec)/2 ; cc < ec; cc++){
                    tmp += arr[rr][cc];
                    cnt ++;
                }
            }
            if(cnt == 0) ;
            else if(tmp == 0) {
                ans[0] += 1;
            }
            else if(tmp == cnt) {
                ans[1] += 1;
            }
            else{
                tt = div(arr, s, (sc+ec)/2, (s+e)/2, ec);
                ans[0] += tt[0];
                ans[1] += tt[1];
            }
            
            tmp = 0;
            cnt = 0;
            for(int rr = (s+e)/2; rr < e; rr++){
                for(int cc = sc; cc < (sc+ec)/2; cc++){
                    tmp += arr[rr][cc];
                    cnt ++;
                }
            }
            if(cnt == 0) ;
            else if(tmp == 0) {
                ans[0] += 1;
            }
            else if(tmp == cnt) {
                ans[1] += 1;
            }
            else{
                tt = div(arr, (s+e)/2, sc, e, (sc+ec)/2);
                ans[0] += tt[0];
                ans[1] += tt[1];
            }
            tmp = 0;
            cnt = 0;
            for(int rr = (s+e)/2; rr < e; rr++){
                for(int cc = (sc+ec)/2 ; cc < ec; cc++){
                    tmp += arr[rr][cc];
                    cnt ++;
                }
            }
            if(cnt == 0) ;
            else if(tmp == 0) {
                ans[0] += 1;
            }
            else if(tmp == cnt) {
                ans[1] += 1;
            }
            else{
                tt = div(arr, (s+e)/2, (sc+ec)/2, e, ec);
                ans[0] += tt[0];
                ans[1] += tt[1];
            }
        }       
        return ans;
    }
}