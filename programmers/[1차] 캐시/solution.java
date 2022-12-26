// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/17680

import java.util.HashMap;
class Solution {
    public int solution(int cacheSize, String[] cities) {
        HashMap<Integer,String> hs = new HashMap<>();
        HashMap<Integer,Integer> hss = new HashMap<>();
        int[] hsA = new int[cities.length];
        int answer = 0, aIdx = 0, hit = 1, miss = 5, oa = 1;
        boolean cc = false;
        for(String c : cities){
            c = c.toLowerCase();
            int ccon = 0;
            if(cacheSize == 0){
                answer += miss;
                continue;
            }
            while(cc==false){
                int bcon = 0;
                for(int cs = 1; cs <= Math.min(cacheSize, aIdx); cs ++){
                    if(hs.getOrDefault(hsA[aIdx-cs],"").equals(c)){
                        int x = hsA[aIdx-cs];
                        hs.put(x,c);
                        hss.put(x,aIdx);
                        for(int cb = aIdx-cs; cb > Math.max(aIdx - cacheSize,0); cb--)
                            hsA[cb]=hsA[cb-1];
                        hsA[aIdx++]=x;
                        answer += hit;
                        bcon = 1;
                        break;
                    }
                }
                if(bcon != 0) break;
                ccon = oa;
                hs.put(oa,c);
                hss.put(oa,aIdx);
                hsA[aIdx++]=oa;
                answer += miss;
                if(oa++==cacheSize) cc = true;
                        break;
            }
            if(ccon == 0 && cc){
                int con = 0;
                for(int cs = 1; cs <= cacheSize; cs++){
                    int a = cs;
                    if(hs.getOrDefault(hsA[aIdx-cs],"").equals(c)){
                        a = hsA[aIdx-cs];
                        con = a;
                        hs.put(a,c);
                        hss.put(a,aIdx);
                        for(int cb = aIdx-cs; cb > aIdx - cacheSize; cb--){
                            hss.put(hsA[cb-1],cb);
                            hsA[cb]=hsA[cb-1];
                        }
                        hsA[aIdx++]=a;
                        answer += hit;
                        break;
                    } 
                }
                if(con==0){
                    int min = hss.get(1), mina = 1;
                    for(int a = 1; a <= cacheSize; a++){
                        if(min > Math.min(hss.get(a),min)){
                            min = Math.min(hss.get(a),min);
                            mina = a;
                        }
                    }
                    hs.put(mina,c);
                    hss.put(mina,aIdx);
                    hsA[aIdx++]=mina;
                    answer += miss;
                }           // if not matched
            }               // if Last
        }                   //Main for
    return answer;
    }
}