// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/60058

import java.lang.StringBuilder;
class Solution {
    public String solution(String w) {
        StringBuilder sb = new StringBuilder();
        String answer = "";
        if(w.equals("")) return "";
        if(good(w)){
            answer = w;
        } else {
            int sp = balP(w)+1;
            String u = w.substring(0,sp);
            String v = w.substring(sp,w.length());
            if(good(u)){
                sb.setLength(0);
                sb.append(u);
                sb.append(solution(v));
                return sb.toString();
            } else {
                sb.setLength(0);
                sb.append('(');
                sb.append(solution(v));
                sb.append(')');
                sb.append(del(u));
                return sb.toString();
            }
        }
        return answer;
    }
    private String del(String u){
        StringBuilder sb = new StringBuilder();
        for(int a = 1; a < u.length()-1; a++){
            if(u.charAt(a)=='(') sb.append(')');
            else sb.append('(');
        }
        return sb.toString();
    }
    private int balP(String s){
        int c1 = 0, ans = s.length()-1;
        for(int a = 0; a < s.length(); a ++){
            if(s.charAt(a)=='(') c1++;
            else c1--;
            if(c1==0) {
                ans = a;
                break;
            }
        }
        return ans;
    }   
    private boolean bal(String s){
        int c1 = 0;
        for(int a = 0; a < s.length(); a ++){
            if(s.charAt(a)=='(') c1++;
            else c1--;
        }
        return c1==0;
    }
    private boolean good(String s){
        int c1 = 0;
        boolean ans = true;
        for(int a = 0; a < s.length(); a ++){
            if(s.charAt(a)=='(') c1++;
            else c1--;
            if(c1<0) {
                ans = false;
                break;
            }
        }
        return ans;
    }
}