package Programmers.Level2.Success;

import java.util.ArrayList;
import java.util.Locale;

//https://programmers.co.kr/learn/courses/30/lessons/17680
public class PM_17680 {

    public int solution(int cacheSize, String[] cities) {
        int answer = 0;

        ArrayList<String> arr =  new ArrayList<>();

        if(cacheSize==0){       //예외처리1. 캐시사이즈가0이면 모두5로 처리한다
            answer = cities.length*5;
        }

        for(int i=0;i<cacheSize;i++){   //초기화
            arr.add("");
        }




        for(int i=0;i<cities.length;i++){


            for(int j=0;j<cacheSize;j++){   //위치찾기



                if(arr.get(j).equals(cities[i].toLowerCase())){
                    arr.remove(j);
                    arr.add(cities[i].toLowerCase());
                    answer+=1;
                    break;
                }if(j+1==cacheSize){
                    arr.remove(0);
                    arr.add(cities[i].toLowerCase());
                    answer+=5;
                }
            }
        }
//	["Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul"]

        return answer;
    }

}
