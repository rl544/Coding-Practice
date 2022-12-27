// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/49993

import java.lang.StringBuilder;
class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        sb3.append("[^(");
        
            for(int bb = 0; bb < skill.length(); bb++){
            char a = skill.charAt(bb);
            sb.append(a);
               
                   sb3.append(a);
                   sb3.append((bb==skill.length()-1)?"]":"|");
                   
            }
        for(String s : skill_trees){
            String temp = s.replaceAll(sb3.toString(),"");
            System.out.println(sb.toString()+" "+temp);
            if(sb.toString().matches("^"+temp+".*")) answer ++;
            }
        return answer;
    }
}