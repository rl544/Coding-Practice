// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/12930

import java.lang.StringBuilder;
class Solution {
    public String solution(String s) {
        String[] sl = s.split(" ", -1);
        StringBuilder main = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        for(int i = 0; i < sl.length; i++){
            for(int j = 0; j < sl[i].length(); j++){
                char tc = sl[i].charAt(j);
                if(j%2==0) tc = Character.toUpperCase(tc);
                else tc = Character.toLowerCase(tc);
                if(sl[i].length()!=0) temp.append(tc);
            }
            main.append(temp.toString());
            temp.setLength(0);
            if(i != sl.length-1) main.append(" ");
        }
        return main.toString();
    }
}