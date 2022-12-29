// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/42579

import java.util.*;
class Solution {
    public class Song{
        private int id;
        private int plays;
        public Song(){}
        public Song(int id, int plays){
            this.id = id;
            this.plays = plays;
        }
        public int getId(){
            return id;
        }
        public int getPlays(){
            return plays;
        }
        public String toString() {
            return "Song "+id+" plays"+plays;
        }
    }
    public int[] solution(String[] genres, int[] plays) {
        HashMap<String,Integer> hm = new HashMap<>();
        HashMap<String,ArrayList<Song>> hm2 = new HashMap<>();
        for(int a = 0; a < genres.length; a++){
            ArrayList<Song> al = new ArrayList<>();
            hm.put(genres[a],(Integer)(hm.getOrDefault(genres[a],0)+(Integer)plays[a]));
            al = hm2.getOrDefault(genres[a], al);
            al.add(new Song(a,plays[a]));
            hm2.put(genres[a], al);
        }
        List<Integer> answer = new ArrayList<>();
        List<Map.Entry<String, Integer>> entryList = new LinkedList<>(hm.entrySet());
        entryList.sort(((o1, o2) -> hm.get(o2.getKey()) - hm.get(o1.getKey())));
        for(Map.Entry<String, Integer> entry : entryList){
            System.out.println("key : " + entry.getKey() + ", value : " + entry.getValue());
            ArrayList<Song> al = hm2.get(entry.getKey());
            al.sort(((o1, o2) -> o2.getPlays() - o1.getPlays()));
            int idx = 0;
            for(Song s : al){
                if(idx++>1) break;
                answer.add(s.getId());
                System.out.println(s);
            }
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}