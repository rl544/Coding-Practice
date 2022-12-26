// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/42577

import java.util.Arrays;
class Solution {
    public boolean solution(String[] pb) {
        boolean answer = true;
        Arrays.sort(pb);
        for(int a = 0; a < pb.length; a++){
            for(int b = a+1; b < a+pb.length; b++){
                if(pb[b%pb.length].replaceAll(pb[a],"s").matches("^s.+")){
                    answer = false;
                    break;
                } else break;
            }
            if(answer == false){
                break;
            }
        }
        return answer;
    }
}