// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/133499

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] available = {"aya", "ye", "woo", "ma"};
        for (String i : babbling){
            int index = 1;
            for(String ava : available){
                i = i.replaceAll(ava,String.valueOf(index++));
            }
            if(!(i.matches(".*[^1-4].*") || i.matches(".*1{2}.*")
              || i.matches(".*2{2}.*") || i.matches(".*3{2}.*") || i.matches(".*4{2}.*"))) answer += 1;
        }
        return answer;
    }
}