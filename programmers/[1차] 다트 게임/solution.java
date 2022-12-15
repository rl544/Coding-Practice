// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/17682

import java.util.HashMap;
class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        int c = 0;
        int a = 1;
        int b = 0;
        
        int ind = 0;
        int len = dartResult.length();
        int data = 0;
        HashMap<Integer,Integer> db = new HashMap<>();
        while(c < 3){
            int d = 0;
            b = Character.getNumericValue(dartResult.charAt(ind));
            if(dartResult.charAt(ind+1) == '0') {
                d = 1;
                b = 10;
            }
            switch(dartResult.charAt(ind+1+d)){
                case 'S':
                    a = 1;
                    break;
                case 'D':
                    a = 2;
                    break;
                case 'T':
                    a = 3;
                    break;
            }
            data = (int)Math.pow(b,a);
            System.out.println(data+" "+a+" "+b);
            db.put(c,data);
            if(ind+d+2 < len){
                if(dartResult.charAt(ind+d+2) == '*'){
                    if(c > 0) {
                        db.put(c-1,db.get(c-1)*2);
                    }
                    db.put(c,db.get(c)*2);
                    ind += 3+d;
                }
                else if(dartResult.charAt(ind+d+2) == '#'){
                    db.put(c,db.get(c)*(-1));
                    ind += 3+d;
                } else ind += 2+d;
            }
            c++;
            
        }
        for (int i = 0; i < 3; i++){
            answer += db.get(i);
        }
        return answer;
    }
}