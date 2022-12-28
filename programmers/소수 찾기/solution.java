// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/42839

import java.util.HashSet;

class Solution {
    public int solution(String numbers) {
        HashSet<Integer> hs = new HashSet<>();
        per("",numbers,hs);
        int answer = 0;
        while(hs.iterator().hasNext()){
            int a = hs.iterator().next();
            hs.remove(a);
            if(a==2) answer++;
            if(a%2!=0 && prime(a)) answer++;
        }
        return answer;
    }
    private boolean prime(int n){
        if(n==0||n==1) return false;
        for(int i=3; i<=(int)Math.sqrt(n); i+=2){
            if(n%i==0) return false;
        }
        return true;
    }
    private void per(String pre, String str, HashSet<Integer> hs){
        int len = str.length();
        if(!pre.equals("")) hs.add(Integer.valueOf(pre));
        for (int i = 0; i < len; i++) per(pre + str.charAt(i), str.substring(0,i) + str.substring(i+1, len),hs);
    }
}