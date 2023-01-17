// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/17687

import java.lang.StringBuilder;
class Solution {
    public String solution(int n, int t, int m, int p) {
        StringBuilder sb = new StringBuilder(), sb2 = new StringBuilder();
        int end = (t-1)*m+p, num = 0;
        while(sb.length() <= end){
            sb.append(trs(num++,n));
        }
        for(int a = 0; a < t; a++){
            sb2.append(sb.charAt(a*m+p-1));
        }
        //System.out.println(sb);
        return sb2.toString();
    }
    private String trs(int num,int n){
        StringBuilder tn = new StringBuilder();
        int x = num;
        
        while(num>=0){
            int temp = num%n;
            String nt;
            switch(temp){
                case 10: nt = "A";
                    break;
                case 11: nt = "B";
                    break;
                case 12: nt = "C";
                    break;
                case 13: nt = "D";
                    break;
                case 14: nt = "E";
                    break;
                case 15: nt = "F";
                    break;
                default: nt = null;
                    break;
            }
            if(nt!=null) tn.append(nt);
            else tn.append(temp);
            num=num/n;
            if(num==0) break;
        }
        return tn.reverse().toString();
    }
}