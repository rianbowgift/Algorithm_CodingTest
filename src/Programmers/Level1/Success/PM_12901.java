package Programmers.Level1.Success;
//https://programmers.co.kr/learn/courses/30/lessons/12901
public class PM_12901 {
    public String solution(int a, int b) {
        String answer = "";
        String[] week = new String[]{"SUN","MON","TUE","WED","THU","FRI","SAT"};
        int[] mons = new int[]{31,29,31,30,31,30,31,31,30,31,30,31};
        int days=0;



        for(int i=0; i<a-1; i++){
            days+=mons[i];
        }
        days+=b;
        System.out.println(days);



        if(days%7==0){
            answer = week[4];
        }else if(days%7==1){
            answer = week[5];
        }else if(days%7==2){
            answer = week[6];
        }else if(days%7==3){
            answer = week[0];
        }else if(days%7==4){
            answer = week[1];
        }else if(days%7==5){
            answer = week[2];
        }else if(days%7==6){
            answer = week[3];
        }



        return answer;
    }

}
