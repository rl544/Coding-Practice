// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/12953

import java.util.Arrays;
class Solution {
    private int lcm(int a, int b){
        return a*b/gcd(a,b);
    }
    private int gcd(int a, int b){
        int ans = 0;
        for(int c = 1; c <= Math.min(a,b); c++){
            if(a%c==0 && b%c==0) ans = c;
        }
        return ans;
    }
    public int solution(int[] arr) {
        int f = arr[0];
        Arrays.sort(arr);
        if(arr.length>0)
        f = lcm(arr[0],arr[1]);
        System.out.println(f);
        if(arr.length>1)
        for(int d = 2; d < arr.length; d++){
            f = lcm(f,arr[d]);
            System.out.println(f);
        }
        return f;
    }
}