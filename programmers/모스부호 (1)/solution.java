// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/120838

import java.util.HashMap;
import java.lang.StringBuilder;
class Solution {
    public String solution(String letter) {
        HashMap<String,String> hm = new HashMap<>(){
            {
                put(".-", "a");
                put("-...", "b");
                put("-.-.", "c");
                put("-..", "d");
                put(".", "e");
                put("..-.", "f");
                put("--.", "g");
                put("....", "h");
                put("..", "i");
                put(".---", "j");
                put("-.-", "k");
                put(".-..", "l");
                put("--", "m");
                put("-.", "n");
                put("---", "o");
                put(".--.", "p");
                put("--.-", "q");
                put(".-.", "r");
                put("...", "s");
                put("-", "t");
                put("..-", "u");
                put("...-", "v");
                put(".--", "w");
                put("-..-", "x");
                put("-.--", "y");
                put("--..", "z");
            }
        };
        
        StringBuilder answer = new StringBuilder();
        for(String s : letter.split(" ")){
            answer.append(hm.get(s));
        }
        return answer.toString();
    }
}