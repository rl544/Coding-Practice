// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/133502

import java.util.*;

class Solution {
    public int solution(int[] ingr) {
        int answer = 0;
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(1);
        for (int i = 0; i < ingr.length; i++){
            list.add(ingr[i]);
            if(list.size() >= 4){
                ArrayList<Integer> list3 = new ArrayList<>();
                list3.add(list.get(list.size()-4));
                list3.add(list.get(list.size()-3));
                list3.add(list.get(list.size()-2));
                list3.add(list.get(list.size()-1));
                if(list3.equals(list2)){
                    answer++;
                    list.remove(list.size()-1);                    
                    list.remove(list.size()-1);                    
                    list.remove(list.size()-1);                
                    list.remove(list.size()-1);                    
                }
            }
        }
        
        return answer;
    }
}