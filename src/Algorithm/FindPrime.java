package Algorithm;

// DATE : 2024.03.28
// WRITER : 구예원
// CONTENT : 소수 구하기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FindPrime {

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

        if(findPrime(n)) System.out.println("소수입니다.");
        else System.out.println("소수가 아닙니다.");
    }

}
