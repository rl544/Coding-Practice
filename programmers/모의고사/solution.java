// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/42840

import java.util.*;
import java.lang.*;
import java.util.stream.Collectors;
class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int[][] player = {{1,2,3,4,5},{2, 1, 2, 3, 2, 4, 2, 5},{3,3,1,1,2,2,4,4,5,5}};
        HashMap<Integer, Integer> pls = new HashMap<>();
        for(int a = 0; a < answers.length ; a++){
            for(int bb = 0; bb < player.length; bb++){
                int[] p = player[bb];
                int index = a%p.length;
                if(p[index] == answers[a]) {
                    System.out.println("b: "+bb+" index "+index+" "+p[index]+" "+answers[a]);
                    pls.put(bb+1, pls.getOrDefault(bb+1,0)+1);
                }
            }
        }
        int maxData = pls.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toList()).get(0).getValue();
        System.out.println(maxData);
        List<Integer> keyList = new ArrayList<Integer>();
        for(Map.Entry<Integer, Integer> entry : pls.entrySet()){
            if(entry.getValue()==maxData){
              keyList.add(entry.getKey());
            }
        }
        System.out.println(keyList);
        return keyList.stream().mapToInt(i->i).toArray();
    }
}