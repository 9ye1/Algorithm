package Beakjoon_2024;

// DATE : 2024.03.28
// WRITER : 구예원
// CONTENT : 소수찾는알고리즘

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon_1978 {

    //소수 찾는 함수
    static boolean findPrime(int n){
        //2보다 크고 주어진 n의 제곱근인 수보다 작은 수로 나누어 떨어지면 소수 x
        double square = Math.sqrt(n);
        if(n==1) return false;
        for(int i =2; i<=square; i++){
            if(n%i==0) return false;
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int count =0;
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0; i<n; i++){

            if(findPrime(Integer.parseInt(st.nextToken()))) count++;
        }
        System.out.println(count);
    }

}
