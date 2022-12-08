// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/135808

import java.util.*;
import java.util.Collections;

class Solution {
    public static void reverseSort(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
    }
    
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        int len = score.length;
        int count = len / m;        
        reverseSort(score);
        for(int i = 0; i < len; i++){
            if(i%m == m-1){
                answer += score[i]*m;
            }
        }
        return answer;
    }    

}