package Programmers.Level1.Success;
//https://programmers.co.kr/learn/courses/30/lessons/92334
//코드 마음에 안듬..

public class PM_92334 {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        int[] id_report_list = new int[id_list.length]; //유저 아이디 순서대로 들어온다 가정할때, 신고된횟수(중복은제거됨)저장
        int[][] id_overlap_list = new int[id_list.length][id_list.length];      //중복검사. 순서대로 들어왔다 가정할때 0=미신고 1=신고



        for(int i=0;i<report.length;i++){
            String[] names = report[i].split(" ");
            int name_num = -1;  //신고자 int값
            int name_fe_num = -1; //신고당하는 아이디 int값
            for(int j=0;j<names.length;j++){

                if(j==0){       //신고자 아이디 처리
                    for(int x=0; x<id_list.length;x++){
                        if(names[0].equals(id_list[x])){
                            name_num = x;
                        }
                    }
                }

                if(j==1){       //신고당하는자 아이디 처리
                    for(int x=0; x<id_list.length;x++){
                        if(names[1].equals(id_list[x])){
                            name_fe_num = x;
                        }
                    }
                }

            }

            if(id_overlap_list[name_num][name_fe_num]==0){   //사용자가 첫신고하는거라면
                id_overlap_list[name_num][name_fe_num] = 1;
                id_report_list[name_fe_num]++;
            }


        }

        //지금까지 신고한 유저배열 overlap_list를 반복하며 신고했던 대상자가 k보다 많이 신고됬으면 answer을채워넣음
        int count = 0;  //answer에 넣기위한 카운트
        for(int i=0;i<id_overlap_list.length;i++){
            for(int j=0; j<id_overlap_list[i].length;j++){
                if(id_overlap_list[i][j]==1){       //특정 대상을 신고한적이 있다면 그 대상이 정지당했는지 확인

                    if(id_report_list[j]>=k){       //정지당했으면
                        count++;
                    }
                }
            }
            answer[i] = count;
            count=0;
        }







        return answer;
    }
}
