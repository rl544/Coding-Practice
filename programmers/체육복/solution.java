// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/42862#

import java.util.HashMap;
import java.util.ArrayList;
class Solution {
    private static void rl(ArrayList<Integer> list, HashMap<Integer, Integer> ha, int n){
        for(int i : list){
            int c = ha.get(i);
            if(c == 0) {
                System.out.println("00"+i+" : "+c);
                if (i < n && ha.get(i+1) == 2){
                    ha.put(i+1,1);
                    System.out.println(i+1+" : "+1);
                    ha.put(i, 1);
                } else if(i > 1 && ha.get(i-1) == 2) {
                    ha.put(i-1,1);
                    System.out.println(i-1+" : "+1);
                    ha.put(i, 1);
                }
            }
        }
    }
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        HashMap<Integer, Integer> ha = new HashMap<>();
        ArrayList<Integer> laa = new ArrayList<>();
        ArrayList<Integer> lab = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            ha.put(i,1);
            System.out.println(i);
        }
        for(int i : lost){
            ha.put(i, ha.get(i)-1);
        }
        for(int i : reserve){
            int c = ha.get(i);
            ha.put(i, c+1);
        }
        for(int i : lost){
            System.out.println("TestOn");
            if(ha.get(i) == 1) {
                System.out.println("breaked by 1 and i = "+i);
                continue;
            }
            int count = 0;
            for(int j : reserve){
                if(Math.abs(i-j)==1) count += ha.get(j);
            }
            System.out.println(i+" cou"+count);
            if(count >= 4) {
                lab.add(i);
            } else if(count >= 1){
                laa.add(i);
            }
        }
        System.out.println(lab);
        System.out.println(laa);
        rl(laa, ha, n);
        rl(lab, ha, n);
        for(int i = 1; i <= n; i++){
            answer += (ha.get(i) > 0) ? 0 : 1;
            System.out.println(i+" : "+ha.get(i));
        }
        return n - answer;
    }
}