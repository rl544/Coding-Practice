// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/150369

class Solution {
    public long solution(int cap, int n, int[] deliveries, int[] pickups) {
        long answer = 0;
        int len = n, lm = len-1, lm2 = lm, tmp = 0;
        while(true){
            int maxD = 0, maxP = 0, pickCap = 0, delCap = 0, pm = -2, dm = -2;
            boolean[] full = new boolean[2];
			for(int x = lm; x>=0; x--){
                int del = deliveries[x];
                if(del==0) continue;
                if(maxD == 0) maxD = x;
                if(delCap != cap && del!=0){
                    if(delCap<cap){
                        if(del > cap - delCap) {
                            tmp = cap - delCap; //더클때
                            if(dm<x) dm = x;
                        }
                        else if(del == cap - delCap) { //같을때
                            tmp = del;
                            if(dm<x) dm = x-1;
                        }
                        else tmp = del; //작을때
                        deliveries[x] -= tmp;
                        delCap += tmp;
                    }
                }
                if(delCap == cap) break;
            }
            for(int x = lm2; x>=0; x--){
                int pic = pickups[x];
                if(pic == 0) continue;
                if(maxP == 0) maxP = x;
                if(pickCap != cap && pic!=0){
                    if(pickCap<cap){
                        if(pic > cap - pickCap) {
                            tmp = cap - pickCap; //더클때
                            if(pm<x) pm = x;
                        }
                        else if(pic == cap - pickCap) { //같을때
                            tmp = pic;
                            if(pm<x) pm = x-1;
                        }
                        else tmp = pic; //작을때
                        pickups[x] -= tmp;
                        pickCap += tmp;
                    }
                }
                if(pickCap == cap) break;
            }
            lm = dm; lm2 = pm;
            if(delCap == 0 && pickCap == delCap) break;
            answer += 2*(Math.max(maxD,maxP)+1);
        }
        return answer;
    }
}