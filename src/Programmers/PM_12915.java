package Programmers;
//https://programmers.co.kr/learn/courses/30/lessons/12915
// 안되면 테스트셋         String[] a = new String[]{"abzcd","cdzab","abzfg","abzaa","abzbb","bbzaa"}; 넣어볼것
//스트링 정렬
public class PM_12915 {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        char[] order = new char[strings.length];

        for(int i=0;i<order.length;i++){        //n번째 영단어 배열생성
            order[i] = strings[i].charAt(n);
        }

        //정렬. 단 같을경우..
        for(int i=0; i<order.length;i++){
            for(int j=0; j<order.length-1;j++){
                if(order[j] > order[j+1]){
                        char temp = order[j];
                        String temp2 = strings[j];
                        order[j] = order[j+1];
                        strings[j] = strings[j+1];
                        order[j+1] = temp;
                        strings[j+1] = temp2;

                }else if(order[j]==order[j+1]){ //같을경우..


                    //더 짧은단어 기준으로 max치를 정함
                    int small = 0;
                    if(strings[j].length() > strings[j+1].length()){
                        small = strings[j+1].length();
                    }else{
                        small = strings[j].length();
                    }



                    for(int r=0; r<small; r++){
                        if(strings[j].charAt(r) > strings[j+1].charAt(r)){
                            char temp = order[j];
                            String temp2 = strings[j];
                            order[j] = order[j+1];
                            strings[j] = strings[j+1];
                            order[j+1] = temp;
                            strings[j+1] = temp2;
                            break;
                        }else if(strings[j].charAt(r) == strings[j+1].charAt(r)){
                            continue;
                        }else{
                            break;
                        }

                    }



                }
            }
        }

        for(int i=0;i<strings.length;i++){
            answer[i] = strings[i];
        }




        return answer;
    }

}
