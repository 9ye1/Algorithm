package Beakjoon_2024;

// DATE : 2024.03.30
// WRITER : 구예원
// CONTENT : 하노이의 탑 구현

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon_1914 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());  //원반의 개수

        System.out.println((int)Math.pow(2,n)-1);

        if(n<=20) {
            Hanoi(n, 1, 2, 3);
        }

    }
    static void Hanoi(int n, int from, int by, int to) {
        if(n==1){
            System.out.println(from+" "+to);  // 원반 한 개를 옮김
        }
        else{
            Hanoi(n-1, from, to, by);      // 가장 큰 원반을 제외한 원반들을 A에서 B로 이동
            System.out.println(from +" "+to); // 가장 큰 원반을 A에서 C로 이동
            Hanoi(n-1, by, from, to);      // B로 옮겨놓은 원반들을 다시 C로 이동
        }
    }

}
