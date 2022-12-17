// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/68935

import java.util.Arrays;
class Solution {
    private static int[] to3(int n){
        int sn = 0;

        for(int a = 0; a < n; a++){
            if((int)Math.pow(3,a)>n) {
                sn = a-1;
                break;
            }
        }
        int[] ans = new int[sn+1];
        int ii = 0;
        for(int b = sn; b>=0; b--){
            int mi = n/(int)Math.pow(3,b);
            if(mi>0) {
                n -= (int)Math.pow(3,b)*mi;
                 ans[b] = mi;
            }                
        }
        System.out.println(Arrays.toString(ans));
        return ans;
    }
    public int solution(int n) {
        int answer = 0;
        int[] arr = to3(n);
        for(int d = 0; d < arr.length; d++){
            answer += arr[d]*(int)Math.pow(3,arr.length-d-1);
        }
        return answer;
    }
}