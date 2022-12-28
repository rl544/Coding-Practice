// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/42586

import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        boolean[] done = new boolean[speeds.length];
        ArrayList<Integer> al = new ArrayList<>();
        Deque<Integer> dq = new LinkedList<>();
        int day = 0, check = 0, start = 0;
        while(check==0){//Day
            day++;
            for(int a = 0; a < speeds.length; a++){
                if(!done[a]){
                    if(progresses[a]<100){
                        progresses[a] += speeds[a];
                    } else {
                        done[a] = true;
                        dq.addFirst(a);
                    } 
                }
            }
            for(int a = start; a < speeds.length; a++){
                if(a == speeds.length-1 && done[a]) check = 1;
                if((!done[a] && dq.size()!= 0 )||check==1){
                    Iterator<Integer> it = dq.iterator();
                    int numb = 0;
                    while(it.hasNext()){
                        if(it.next()<=a) {
                            it.remove();
                            numb++;
                        }
                    }
                    if(numb!=0) al.add(numb);
                }
                if(done[a] && dq.size()!= 0){
                    continue;
                } else if(!done[a]){
                    start = a;
                    //System.out.println(a);
                    break;
                }
            }            
        }
        return al.stream().mapToInt(Integer::intValue).toArray();
    }
}