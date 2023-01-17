// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/17684

import java.util.*;
class Solution {
    public int[] solution(String msg) {
        ArrayList<Integer> al = new ArrayList<>();
        int idx = 27;
        HashMap<String,Integer> hm = new HashMap<>();
         for(char a = 'A'; a <= 'Z'; a++){
            String t = String.valueOf(a);
            hm.put(t,a-64);
        }
        for(int a = 0; a < msg.length();){
            int i = 1, res = 0;
            while(a+i<= msg.length()){
                if(hm.containsKey(msg.substring(a,a+i))){
              res = hm.get(msg.substring(a,a+i++));
                } else{
                    hm.put( msg.substring(a,a+i--), idx++ );
                    break;
                }
            }
            al.add(res);
            a += i;
        }
        return al.stream().mapToInt(x -> x).toArray();
    }
}