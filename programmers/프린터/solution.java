// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/42587

import java.util.*;

class Solution {
    public class Print{
        public int pos;
        public int val;
        public Print(){};
        public Print(int pos, int val){
            this.pos = pos;
            this.val = val;
        }
        public int getPos(){
            return pos;
        }
        public int getVal(){
            return val;
        }
        public String toString(){
            return "pos :"+pos+" val :"+val;
        }
    }
    public int solution(int[] priorities, int location) {
        int answer = 0;
        LinkedList<Print> dq = new LinkedList();
        for(int p = 0; p < priorities.length; p++){
            dq.addLast(new Print(p,priorities[p]));
        }
        while(true){
            Print temp = dq.peekFirst();
            boolean err = false;
            for(Print p : dq) {
                if(temp.getVal()<p.getVal()) {
                    dq.addLast(dq.pollFirst());
                    err = true;
                    break;
                }
            }
            if(!err){
                dq.pollFirst();
                answer++;
                if(temp.getPos() == location) break;
            }
        }
        return answer;
    }
}