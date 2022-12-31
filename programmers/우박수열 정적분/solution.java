// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/134239

import java.util.ArrayList;
import java.util.stream.*;
class Solution {
    private double cal(double[] ar, int[] ra){
        double ans = 0D;        
        if(ra[0]>ar.length+ra[1]-1){
            return -1;
        }
        for(int a = ra[0]; a < ar.length+ra[1]-1; a++) ans +=(ar[a+1]+ar[a])/2;
        return ans;
    }
    public double[] solution(int y, int[][] ranges) {
        double[] ans, answer = new double[ranges.length];
        int i = 0;
        double k = y;
        ArrayList<Double> test = new ArrayList();
        while(k>1){
            test.add(k);
            if(k%2==0) k = k/2;
            else k= 3*k+1;
            i++;
        }
        test.add(k);
        ans = test.stream().mapToDouble(x -> x).toArray();
        
        for(int c = 0; c < ranges.length; c++){
            answer[c] = cal(ans,ranges[c]);
        }
        return answer;
    }
}