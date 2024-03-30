package Beakjoon_2024;

// DATE : 2024.03.28
// WRITER : 구예원
// CONTENT : DFS 공부 - Do it! 알고리즘 코딩테스트 자바편

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Math;
import java.util.zip.DataFormatException;

public class Beakjoon_2023 {

    //소수 찾는 함수
    static boolean IsPrime(int n){
        for(int i=2; i<Math.sqrt(n); i++){
            if(n%i==0) return false;
        }
        return true;
    }

    static int N;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine()); // n : 자릿수


        DFS(2,1);
        DFS(3,1);
        DFS(5,1);
        DFS(7,1);

    }

    static void DFS(int number, int jarisu){
        if(jarisu==N){
            if(IsPrime(number)) {
                System.out.println(number);
            }
            return;
        }

        for(int i =1; i<10; i++){
            if(IsPrime(number*10+i)){
                DFS(number*10+i,jarisu+1);
            }
        }
    }


}
