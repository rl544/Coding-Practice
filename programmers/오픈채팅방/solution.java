// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/42888

import java.util.HashMap;
import java.lang.StringBuilder;
import java.util.ArrayList;
class Solution {
    public String[] solution(String[] record) {
        HashMap<String,String> hm = new HashMap<>();
        ArrayList<String> al = new ArrayList<>(), al2 = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for(String r : record){
            String[] temp = r.split(" ");
            String job = temp[0], uid = temp[1], name = "", msg="";
            if(temp.length==3) {
                name = temp[2];
                hm.put(uid,name);
            }
            switch(job){
                case "Enter":
                    msg = "님이 들어왔습니다.";
                    break;
                case "Leave":
                    msg = "님이 나갔습니다.";
                    break;
            }
            if(!msg.equals("")) {
                al.add(uid);
                al2.add(msg);
            }
        }
        for(int a = 0; a < al.size(); a++){
            sb.append(hm.get(al.get(a)));
            sb.append(al2.get(a));
            al.set(a,sb.toString());
            sb.setLength(0);
        }
        return al.toArray(String[]::new);
    }
}