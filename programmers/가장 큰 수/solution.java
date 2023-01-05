// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/42746#

import java.util.*;
import java.lang.StringBuilder;
class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        Comp comp = new Comp();
        StringBuilder sb = new StringBuilder();
        String[] nb = new String[numbers.length];
        for(int a = 0; a < numbers.length; a++){
            nb[a] = String.valueOf(numbers[a]);
        }
        Arrays.sort(nb,comp);
        for(String s : nb) sb.append(s);
        return (sb.charAt(0)=='0')?"0":sb.toString();
    }
    public class Comp implements Comparator<String> {
        public int compare(String a, String b) {
            int temp = 0, end = Math.min(a.length(),b.length())-1;
            int l = Integer.parseInt(a+b), r = Integer.parseInt(b+a);
            while(true){
                if(a.charAt(temp) < b.charAt(temp)) return 1;
                else if(a.charAt(temp) > b.charAt(temp)) return -1;
                if(temp < end) temp++;
                else break;
            } // 이거 통과헸다는 것은 동일 길이까지 전부 같다는 것.
            if(a.length()==b.length()) return 0; // 이건 0 0 0 0 대비
            if(a.length()>b.length()){
                int tt = end+1, te = b.length(), mm = a.length();
                // System.out.println(a+" "+b);
                while(true){
                    if(a.charAt(tt)>b.charAt(tt%te)) return -1;
                    else if (a.charAt(tt)==b.charAt(tt%te)) {
                        if(tt >= mm-1){
                            if(l>r) return -1;
                            else return 1;
                        }
                        else tt++;
                    }
                    else return 1; 
                }
                
            } else {
                int tt = end+1, te = a.length(), mm = b.length();
                while(true){
                    if(b.charAt(tt)>a.charAt(tt%te)) return 1;
                    else if (b.charAt(tt)==a.charAt(tt%te)) {
                        if(tt >= mm-1) {
                            if(l<r) return 1;
                            else return -1;
                        }
                        else tt++;
                    }
                    else return -1; 
                }
            }
        }
    }
}