// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/17679

import java.util.*;
class Solution {
    public int solution(int m, int n, String[] board) {
        int answer = 0, rlen = board.length, clen = board[0].length();
        Character[][] boa = new Character[rlen][clen];
        for(int a = 0; a < rlen; a++) boa[a] = board[a].chars().mapToObj(c -> (char)c).toArray(Character[]::new);
        while(true){
            Character[][] temp = new Character[rlen][clen]; 
            for(int a = 0; a < rlen; a++) {
                temp[a] = boa[a].clone();
                // System.out.println(Arrays.toString(temp[a])); //프린트해서 확인하기
            }
            HashSet<Integer> hs = new HashSet<>();
            boolean bigChk = false;
            for(int a = 0; a < rlen-1; a++){
                for(int b = 0; b < clen-1; b++){
                    Character me = boa[a][b];
                    boolean chk = true;
                    for(int c = 0; c < 2; c++){
                        for(int d = 0; d < 2; d++){
                            if(c == 0 && d == 0) continue;
                            if(me == ' ') {
                                chk = false;
                                break;
                            }
                            if(boa[a+c][b+d] != me) chk = false;
                        }
                    }
                    if(chk) {
                        bigChk = true;
                        for(int c = 0; c < 2; c++){
                            for(int d = 0; d < 2; d++){
                                hs.add((a+c)*clen+b+d);
                            }
                        }
                    }
                }
            } 
            if(!bigChk) break;
            
            for(int set : hs){
                int r = set/clen, c = set%clen;
                temp[r][c] = ' ';
                answer++;
            }
            boa = trans(remove(trans(temp)));
        }

        return answer;
    }
    public Character[][] trans(Character[][] ob){
        Character[][] temp = new Character[ob[0].length][ob.length];
        for(int a = 0; a < ob.length; a++){
            for(int b = 0; b < ob[0].length; b++){
                temp[b][a] = ob[a][b];
            }
        }
        return temp;
    }
    public Character[][] remove(Character[][] temp){
        for(int a = 0; a < temp.length; a++){
            Arrays.sort(temp[a], new Comparator<Character>(){
              @Override
              public int compare(Character s1, Character s2){
                  if(s1 == ' ' && s2 == ' ') return 0;
                  else if(s1 == ' ' && s2 != ' ') return -1;
                  else if(s1 != ' ' && s2 == ' ') return 1;
                  else return 0;
              }
            });
        }
        return temp;
    }
}