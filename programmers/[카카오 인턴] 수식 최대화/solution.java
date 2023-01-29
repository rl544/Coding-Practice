// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/67257

import java.util.*;
class Solution {
    public long solution(String expression) {
        long answer = 0;
        int idx = 0;
        int[][] arr = new int[6][3];
        char[] cArr = new char[] {'+','-','*'};
        for(int a = 0; a <= 2; a++){
            for(int b = 0; b <= 2; b++){
                if(b == a) continue;
                for(int c = 0; c <= 2; c++){
                    if(c == a || c == b) continue;
                    int[] nArr = new int[] {a,b,c};
                    for(int d = 0; d <= 2; d++) arr[idx][d] = nArr[d];
                    idx++;
                }
            }
        }
        ArrayList<Object> ob = new ArrayList<>();
        int n = 0;
        for(int a = 0; a < expression.length(); a++){
            if(!Character.isDigit(expression.charAt(a))) {
                ob.add(Long.parseLong(expression.substring(n,a)));
                ob.add(expression.charAt(a));
                n = a+1;
            }
        }
        if(expression.length()-1>=n) ob.add(Long.parseLong(expression.substring(n)));
        for(int a = 0; a < 6; a++){ //a < 6
            ArrayList<Object> tob = ob;
            for(int b = 0; b <= 2; b++){
                char p = cArr[arr[a][b]];
                ArrayList<Object> tob2 = new ArrayList<>();
                boolean occur = false, firstEncounter = true;
                int over = 0;
                for(int c = 0; c < tob.size(); c++){
                    if(tob.get(c) instanceof Long) {
                        if(!occur) tob2.add(tob.get(c)); //continue;
                        else occur = false;
                        continue;
                    }
                    if((char)tob.get(c) == p){
                        if(firstEncounter){
                            Long temp = 0L;
                            firstEncounter = false;
                            over = b-1;
                            if(tob2.size()>0) tob2.remove(tob2.size()-1);
                            switch(p){
                                case '*': temp = (Long)tob.get(c-1)*(Long)tob.get(c+1);
                                    //System.out.println((Long)tob.get(c-1)+" * "+(Long)tob.get(c+1));
                                    break;
                                case '+': temp = (Long)tob.get(c-1)+(Long)tob.get(c+1);
                                    //System.out.println((Long)tob.get(c-1)+" + "+(Long)tob.get(c+1));
                                    break;
                                case '-': temp = (Long)tob.get(c-1)-(Long)tob.get(c+1);
                                    //System.out.println((Long)tob.get(c-1)+" - "+(Long)tob.get(c+1));
                                    break;
                            }
                            tob2.add(temp);
                            occur = true;
                        } else{
                            tob2.add(tob.get(c));
                            if(b != over) b = over;
                        }
                    } else tob2.add(tob.get(c));
                }
                tob = tob2;
            }
            if(tob.size()>0){
                long temp = (Long)tob.get(0);
                if(temp < 0) temp = 0-temp;
                if(answer < temp) answer = temp;
            }
        }
        return answer;
    }    
}