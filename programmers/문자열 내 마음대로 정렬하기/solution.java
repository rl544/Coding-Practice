// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/12915

import java.util.Arrays;

class Solution {
  public String[] solution(String[] strings, int n) {
      Arrays.sort(strings, new Comparator<String>(){
          @Override
          public int compare(String s1, String s2){
              if(s1.charAt(n) > s2.charAt(n)) return 1;
              else if(s1.charAt(n) == s2.charAt(n)) return s1.compareTo(s2);
              else if(s1.charAt(n) < s2.charAt(n)) return -1;
              else return 0;
          }
      });
      return strings;
  }
}