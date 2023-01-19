// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/17686

import java.util.*;
class Solution {
    public String[] solution(String[] files) {
        String[] answer = {};
        Arrays.sort(files,new Comparator<String>() {
       @Override
       public int compare(String o1, String o2) {
              return 
                  ((division(o1)[0].toLowerCase().compareTo(division(o2)[0].toLowerCase())==0)?
                  (Integer.parseInt(division(o1)[1])-Integer.parseInt(division(o2)[1])):
                    division(o1)[0].toLowerCase().compareTo(division(o2)[0].toLowerCase()));
                }
        });
        return files;
    }
    private String[] division(String target){
        int b = 0, bf = 0;
        String[] tp = new String[2];
        for(int a = 0; a < target.length(); a++){
            if(b == 0 && Character.isDigit(target.charAt(a))) {
                tp[b] = target.substring(0,a);
                bf = a;
                b = 1;
            } else if(b == 1){
                if(!Character.isDigit(target.charAt(a))) {
                    tp[b] = target.substring(bf,a);
                    bf = a;
                    b = 2;
                }
                else if(a == target.length()-1 || a == bf+4) tp[b] = target.substring(bf,a+1);
            }
        }
        if(tp[1] == null) tp[b] = target.substring(bf);
        return tp;
    }
}