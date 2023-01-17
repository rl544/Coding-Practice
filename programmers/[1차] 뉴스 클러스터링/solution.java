// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/17677#qna

import java.util.*;
import java.lang.StringBuilder;
class Solution {
    ArrayList<String> hs = new ArrayList<>();
    HashSet<String> hs2 = new HashSet<>();
    HashMap<String,Integer> hm2 = new HashMap<>(), hm3 = new HashMap<>();
    StringBuilder sb = new StringBuilder();
    private double inter(){
        int in = 0, inM = 0;
        System.out.println(hs2.size());
        Iterator<String> it = hs2.iterator();
        while(it.hasNext()){
            String ob = it.next();
            it.remove();
            in += Math.min(hm2.getOrDefault(ob,0),hm3.getOrDefault(ob,0));
            inM += Math.max(hm2.getOrDefault(ob,0),hm3.getOrDefault(ob,0));
        }
        //System.out.println(in+"in inM"+inM);
        return (double)in/(double)inM;
    }
    private int st(String b, Integer x){
        hs.clear();
        System.out.println(b);
        for(int a = 0; a < b.length()-1; a++){
            int c = a+1;
            if(Character.isAlphabetic(b.charAt(a))&&Character.isAlphabetic(b.charAt(c))){
                sb.append(b.charAt(a));
                sb.append(b.charAt(c));
                String temp = sb.toString();
                //System.out.println(temp);
                hs.add(temp);
                hs2.add(temp);
                if(x == 2) hm2.put(temp,hm2.getOrDefault(temp,0)+1);
                else hm3.put(temp,hm3.getOrDefault(temp,0)+1);
                sb.setLength(0);
            }
        }
        //test += hs.size();
        return hs.size();
    }
    public int solution(String str1, String str2) {
        int a = st(str1.toLowerCase(),2), b = st(str2.toLowerCase(),3);
        if(a == 0 && b == 0) return 65536;
        // int c = inter();//hs2.size();
        //System.out.println(a+" "+b);
        // System.out.println(c);
        return (int)(inter()*65536);
    }
}