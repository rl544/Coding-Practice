// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/67256

import java.util.*;
class Solution {
    private int[] lp;
    private int[] rp;
    private static int[] checkin(int i, StringBuilder answer, int[] array, String aap, int[] pos){
        for (int j : array){
            if(i == j){
                answer.append(aap);
                System.out.println(aap);
                pos = position(i);
                
            }
        }
        return pos;
    }
    private static int[][] checkin(int i, StringBuilder answer, int[] array, String aap, int[] lp, int[] rp){
        for (int j : array){
            if(i == j){
                int[] goOn = position(i);
                int lv = Math.abs(lp[0]-goOn[0])+Math.abs(lp[1]-goOn[1]);
                int rv = Math.abs(rp[0]-goOn[0])+Math.abs(rp[1]-goOn[1]);
                if(lv < rv || (lv == rv && aap.equals("left"))) {
                    aap = "L";
                    lp = goOn;
                }
                else {
                    aap = "R";
                    rp = goOn;
                }
                answer.append(aap);
                System.out.println(aap);

            }
        }
        return new int[][] {lp, rp};
    }
    private static int[] position(int i){
        int[] retu = new int[2]; 
        if(i > 0){
            int r = (i-1)/3;
            int c = (i-1)%3;
            retu[0] = r;
            retu[1] = c;
        } else {
            retu[0] = 3;
            retu[1] = 1;
        }
        return retu;
    }
    public String solution(int[] numbers, String hand) {
        StringBuilder answer = new StringBuilder();
        int[] left = {1,4,7};
        int[] right = {3,6,9};
        int[] mid = {2,5,8,0};
        int[] lp = {3, 0};
        int[] rp = {3, 2};
        List leftList = Arrays.asList(left);
        for (int i : numbers){
            lp = checkin(i, answer, left, "L", lp);
            rp = checkin(i, answer, right, "R", rp);
            int[][] result = checkin(i, answer, mid, hand, lp, rp);
            lp = result[0];
            rp = result[1];
            System.out.println("Lp" + Arrays.toString(lp) +"Rp "+ Arrays.toString(rp));
        }
        return answer.toString();
    }
}