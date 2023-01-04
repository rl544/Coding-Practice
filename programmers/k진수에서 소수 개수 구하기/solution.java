// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/92335

import java.lang.StringBuilder;
class Solution {
    private String trans(int n, int k){
        StringBuilder sb = new StringBuilder();
        while(n>k){
            sb.append(n%k);
            n = n/k;
        }
        sb.append(n);
        return sb.reverse().toString();
    }
    private boolean isPrime(Double i){
        int temp = 0;
        //System.out.println(i+"가 들어왔다 체크하자.");
        for(Double a = 1D; a <= Math.sqrt(i); a++){
            if(i%a==0) temp++;
            if(temp>1) break;
        }
        return (i!=1&&temp==1);
    }
    
    private int chkPrm(String s){
        int temp, ans = 0;
        StringBuilder sb = new StringBuilder();
        for(char a : s.toCharArray()){
            temp = Character.getNumericValue(a);
            if(temp != 0) sb.append(temp);
            else {
                if(sb.length()>0 && isPrime(Double.parseDouble(sb.toString()))) ans++;
                //System.out.println(sb);
                sb.setLength(0);
            }
        }
        if(sb.length()!=0){
            if(sb.length()>0 && isPrime(Double.parseDouble(sb.toString()))) ans++;
            //System.out.println(sb);
            sb.setLength(0);
        }
        return ans;        
    }
    
    public int solution(int n, int k) {
        int answer = -1;
        String t = trans(n,k);
        //System.out.println(t);
        return chkPrm(t);
    }
}