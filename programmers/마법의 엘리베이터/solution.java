// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/148653

import java.util.*;
import java.util.stream.*;
class Solution {
    public int solution(int storey) {
        int answer = 0, temp = 0;
        int max = (int)Math.round(Math.log10(storey));
        //System.out.println(max);
        temp = storey;
        boolean up = false;
        for(int a = 0; a <= max; a++){
            int target = (int)(Math.round(temp/Math.pow(10,a))*Math.pow(10,a));
            int[] ar = Stream.of(String.valueOf(target).split("")).mapToInt(Integer::parseInt).toArray();
            int tt = (ar.length-a>0)?ar[ar.length-1-a]:0;
            //System.out.println(target+"tg"+temp+" "+((tt<5)?tt:10-tt)*(int)Math.pow(10,a));
            if(ar.length-1-a > 0 && ar[ar.length-2-a]>=5 && tt == 5) up = true;
			else up = false;
            if(tt<5 || !up && tt == 5){
                temp-=tt*Math.pow(10,a);
                answer+=tt;
                //System.out.println("-");
            } else{
                temp+=(10-tt)*Math.pow(10,a);
                answer+=10-tt;
                //System.out.println("+");
            }
            if(temp == 0) break;
            //if(temp<0) System.out.println("error");
        }
        return answer;
    }
}