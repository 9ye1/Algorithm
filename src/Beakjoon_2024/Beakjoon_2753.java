//Date : 24.03.07 THU
//NAME : 구예원
//MEMO : 알고리즘 스터디 중급 테스트 문제 1

package Beakjoon_2024;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon_2753 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int year = Integer.parseInt(br.readLine());
        int output = 0;

        if(year%400==0){
            output=1;
        }else if(year%100!=0 && year%4==0){
            output=1;
        }
        System.out.println(output);
    }
}
