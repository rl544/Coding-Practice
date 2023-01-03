// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/60057

import java.lang.StringBuilder;
import java.util.*;
class Solution {
    private String calc(String s, int a){
        int count = 1, tc = 0;
        String temp = "";
        StringBuilder sb = new StringBuilder(), sb2 = new StringBuilder();
        for(int i = 0; i < s.length(); i += a){
            sb.setLength(0);
            for(int x = i; x < Math.min(i+a,s.length()); x++){
                sb.append(s.charAt(x));
                if(x == s.length()-1) tc=1;
            }
            
            if(temp.equals(sb.toString())){
                count++;
                if(tc==1){
                    sb2.append((count!=1)?(count+temp):temp);
                    
                }
            } else if(temp.equals("")){
                temp = sb.toString();
                // System.out.println(temp);
            } else{
                sb2.append((count!=1)?(count+temp):temp);
                temp = sb.toString();
                count = 1;
                if(tc==1){
                    sb2.append(temp);
                }
            }
        }
        // System.out.println(sb2);
        return sb2.toString();
    }
    public int solution(String s) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        if(s.length()==1) return 1;
        for(int a = 1; a < s.length()/2+1; a++){
            // System.out.println(calc(s,a).length());
            pq.add(calc(s,a).length());
        }
        return pq.peek();
    }
}