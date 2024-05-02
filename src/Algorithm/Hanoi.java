package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//DATE : 2024.04.07
//NAME : 구예원
//CONTENT : 알고리즘 과제 - 하노이탑

public class Hanoi {

    static int count;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("몇개의 원반이 있습니캉? : ");
        int n = Integer.parseInt(br.readLine());

        long beforeTime = System.currentTimeMillis(); //시간측정

        move(n,1,3);

        long afterTime = System.currentTimeMillis(); //시간측정
        long secDiffTime = afterTime - beforeTime;   //시간계산

        System.out.println(secDiffTime + "밀리초");

    }

    static void move(int n, int start, int end){
        if(n>1){
            move(n-1, start, 6-start-end);
        }
        if(n>1){
            move(n-1, 6-start-end, end);
        }
    }
}


