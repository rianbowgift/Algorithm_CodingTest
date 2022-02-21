package Programmers.Level2.Success;

import java.util.ArrayList;

//https://programmers.co.kr/learn/courses/30/lessons/60057
public class PM_60057 {

    public int solution(String s) {
        int answer = 0;
        int half_len = s.length()/2;    //절반이상의 길이부터는 압축이 불가능하기때문에 절반까지만 묶어봐도 충분하다.
        int this_pos = 0; // 현재 문자열의 위치를 알려준다.
        String this_st = "";
        String back_st = "";
        int st_nums = 1;    //반복되는 문자수
        String st = "";     //한번의 for문 안에서 저장되는 문자열
        ArrayList<Integer> len = new ArrayList<>();
        int small = 0;
        int check =0;

        if(s.length()==1){
            return 1;
        }


        for(int i=1; i<=half_len;i++){   // i를 늘리면서 검색길이를 늘려간다. 예를들어 i=0일경우 0부터1이전까지, 즉 1개씩검사, i=4일경우 0부터 4이전까지, 즉 4개씩검사



            while(this_pos<=s.length()){    //this_pos를 사용하여 현재문자열의 위치를 i씩 옮겨다니면서 문자열을 묶어본다. 이때 반드시 다음문자열을 검사하기전 길이가 오버플로우되지않는지 검사한다.

                if(this_pos+i>s.length() ){ //나머지처리. 예를들어 8글자라고칠때 3,3,2로 나뉘어지면 2글자가 나머지가되므로 그냥 st에 붙여주고 끝낸다
                    if(s.length()%i!=0) {
                        if (st_nums == 1) {     // 1번반복은 1이생략된다
                            st +=  back_st + s.substring(this_pos, s.length());

                        } else {
                            st += st_nums + back_st + s.substring(this_pos, s.length());
                        }

                        check = 1;
                    }
                    break;
                }else {


                    this_st = s.substring(this_pos, this_pos + i);  //현재 문자열 저장

                    if (back_st.equals("")) {
                        //이전 문자열이 없다면 1.현재 문자열을 이전 문자열로 바꾸고 2.현재문자열을 초기화한후 3.위치값 변경후 4.재반복
                        back_st = this_st;
                        this_st = "";
                        this_pos = this_pos + i;
                        continue;
                    } else {
                        //이전 문자열이 있다면 5.이전 문자열과 현재 문자열을 비교 6.이전문자열과 현재 문자열이 맞다면 7.st_num증가, 8, 2,3,4 수행
                        //  9.이전 문자열과 현재 문자열이 다르다면  10. st에 이전 문자 기록    11. 1,2,3,4 수행
                        if (this_st.equals(back_st)) {
                            st_nums++;
                            this_st = "";
                            this_pos = this_pos + i;
                            continue;
                        } else {
                            if (st_nums == 1) {     // 1번반복은 1이생략된다
                                st += back_st;

                            } else {
                                st += st_nums + back_st;
                            }
                            st_nums = 1;

                            back_st = this_st;
                            this_st = "";
                            this_pos = this_pos + i;
                            continue;
                        }

                    }
                }

            }

            //while문을 빠저나온후, 마지막 처리
            if(check==0) {
                if (this_st.equals(back_st)) {    //이전문자열과 같다면 st_num증가후 문자열에 추가해준다
                    st_nums++;
                    st += st_nums + back_st;
                } else {      //이전문자열과 다르다면 st_num+ 이전까지의문자 + 현재문자를 st에 붙여준다
                    if (st_nums == 1) {     // 1번반복은 1이생략된다
                        st += back_st;

                    } else {
                        st += st_nums + back_st;
                    }
                    st += this_st;
                }
            }

            check=0;
            len.add(st.length());
        //    System.out.println(st);
            this_pos=0;
            this_st="";
            back_st="";
            st_nums=1;
            st = "";
        }


        for(int i=0;i<len.size();i++){
            if(i==0){   //처음 반복시 첫번째 길이정보를 small에 대입
                small=len.get(i);
                continue;
            }

            if(small>len.get(i)){
                small=len.get(i);
            }
        }

        answer = small;

        return answer;
    }


}
