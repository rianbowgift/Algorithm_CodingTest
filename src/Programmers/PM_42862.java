package Programmers;

//https://programmers.co.kr/learn/courses/30/lessons/42862
public class PM_42862 {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int student[] = new int[n];     // 잃어버린학생은 0, 기본학생은1, 2벌있는학생은 2로 분류
        for (int i = 0; i < student.length; i++) {
            student[i] = 1; //기본학생설정
        }
        for (int l = 0; l < lost.length; l++) {
            student[lost[l] - 1] -= 1;    //잃어버린학생설정
        }
        for (int r = 0; r < reserve.length; r++) {
            student[reserve[r] - 1] += 1;  //2벌있는 학생 분류
        }
        //위의 작업으로 본인것을 잃어버렸지만, 여분이있는학생은 일반학생과같이 1로 분류된다


        for(int i=0; i<n; i++){





            if(i==0){       //첫번째는 왼쪽이 없으므로 동작후 무조건 컨티뉴시킨다
                if(student[i]==2){
                    if(student[i+1]==0){
                        student[i+1]=1;
                        student[i]=1;
                        continue;
                    }
                    else{
                        continue;
                    }
                }else{
                    continue;
                }
            }
            //첫번째 경우(왼쪽없음)

            if(i==n-1){
                //System.out.println(i);
                if(student[i]==2){
                    if(student[i-1]==0){
                        student[i-1]=1;
                        student[i]=1;
                        break;//마지막이므로 뭐가나오던 끝내야함
                    }else{
                        break;
                    }
                }else{
                    break;   //마지막이므로 뭐가나오던 끝내야함
                }
            }
            //마지막 경우(오른쪽없음)


            if(student[i]==2){
                if(student[i-1]==0){
                    student[i-1]=1;
                    student[i]=1;
                    continue;
                }
                if(student[i+1]==0) {
                    student[i + 1] = 1;
                    student[i] = 1;
                    continue;
                }
            }

            //중간경우(양쪽있음)

        }



        for(int i=0; i<n; i++){
            if(student[i]!=0){
                answer++;
            }
        }

        //정산


        return answer;
    }

}
