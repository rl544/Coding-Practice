// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/17683

import java.util.*;
import java.lang.StringBuilder;
import java.util.Collections;
class Solution {
    public String solution(String m, String[] musicinfos) {
        ArrayList<Object[]> al = new ArrayList<>();
        for(String mu : musicinfos){
            String[] mi = mu.split(",");
            if(match(m,mi)) {
                al.add(new Object[] {mi[2],minDif(mi[0],mi[1])});
            }
        }
        Collections.sort(al, new Comparator<Object[]>(){
          @Override
          public int compare(Object[] o1, Object[] o2){
              return (int)o2[1]-(int)o1[1];
          }
        });
        return (al.isEmpty())?"(None)":(String)al.get(0)[0];
    }
    public int minDif(String a, String b){
        String[] ai = a.split(":"), bi = b.split(":");
        int biH = Integer.parseInt(bi[0]), biM = Integer.parseInt(bi[1]), aiH = Integer.parseInt(ai[0]), aiM = Integer.parseInt(ai[1]);
        // if(biM == 0 && biH == 0) biH = 24;
        // if(aiM == 0 && aiH == 0) aiH = 24;
        return (biH-aiH)*60+biM-aiM;
    }
    private boolean match(String m, String[] mi){
        StringBuilder sb = new StringBuilder();
        String title = mi[2], me = mi[3];
        int len = minDif(mi[0],mi[1]), slen = me.length(), cnt = 0, alen, mmlen;
        for(int a = 0; a < slen; a++) if(me.charAt(a) == '#') cnt++;
        alen = slen - cnt; cnt = 0;
        for(int a = 0; a < m.length(); a++) if(m.charAt(a) == '#') cnt++;
        mmlen = m.length() - cnt;
        int myPos = 0;
        if(mmlen>len) return false;
        if(len >= alen) {
            for(int a = 0; a <= len/alen ; a++) sb.append(me); 
            len -= alen*(len/alen);
        }
        for(int a = 0; a < slen; a++){
            if(me.charAt(a) != '#') myPos++;
            if(myPos>=len) {
                sb.append(me.substring(0,a+1));
                myPos = 0;
                break;
            }
        }
        String temp = sb.toString();
        int firstChk = temp.indexOf(m), ar1Len = m.length();
        if(firstChk + ar1Len == temp.length() || temp.matches(".*"+m+"[^\\#].*")) return true;
        return false;
    }
}