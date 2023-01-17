// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/92341

import java.text.SimpleDateFormat;
import java.util.*;
class Solution {
    SimpleDateFormat dt = new SimpleDateFormat("HH:mm");//HH는 24시간, hh는 12시간 ampm... hh로 하면 테스트케이스 틀림.
    public class Car{
        public String id;
        public Date in;
        public Date out;
        public int mn;
        public Car(String id, Date in, Date out){
            this.id = id;
            this.in = in;
            this.out = out;
        }
        public Car(String id, Date in, Date out, int mn){
            this.id = id;
            this.in = in;
            this.out = out;
            this.mn = mn;
        }
        public Car(String id){
            this.id = id;
        }
        public Car(){}
        public String getId(){
            return id;
        }
        public void setIn(Date date){
            this.in = date;
        }
        public void setOut(Date date){
            this.out = date;
        }
        public void setMn(int mn){
            this.mn = mn;
        }
        public int getMn(){
            return mn;
        }
        public Date getIn(){
            return in;
        }
        public Date getOut(){
            return out;
        }
        public String toString(){
            return id+" "+in.toString()+" "+out.toString();
        }              
    }
    public int[] solution(int[] fees, String[] records) {
        HashMap<String,Car> hm = new HashMap<>();
        TreeSet<String> ts = new TreeSet<>();
        LinkedList<Integer> al = new LinkedList<>();
        Car car;
        Date tempD = null, in, out;
        String id;
        String[] temp;
        for(String s : records){
            temp = s.split(" ");
            try{
                tempD = dt.parse(temp[0]);
            } catch(Exception e){
                System.out.println(e.getMessage());
            }
            id = temp[1];
            car = hm.getOrDefault(id,new Car(id));
            if(temp[2].equals("IN")) {
                in = tempD;
                car.setIn(tempD);
            }
            else {
                out = tempD;
                int de = car.getMn();
                de += def(car.getIn(),out);
                car.setIn(null);
                car.setMn(de);
            }
            hm.put(id,car);
            ts.add(id);
        }
        for(String s : ts){
            int res = 0;
            car = hm.get(s);
            int de = car.getMn();
            if(car.getIn()!=null) de += def(car.getIn(),null);
            res = fees[1];
            if(de>fees[0]){
                de-=fees[0];
                res += fees[3]*(int)Math.ceil((double)de/(double)fees[2]);
            }
            al.add(res);
        }
        return al.stream().mapToInt(x->x).toArray();
    }
    private int def(Date s, Date e){
        if(e==null){
            try{
                e = dt.parse("23:59");
            } catch(Exception f){
                System.out.println(f.getMessage());
            }
        }
        return (int)((e.getTime()-s.getTime())/(1000*60));
    }
}