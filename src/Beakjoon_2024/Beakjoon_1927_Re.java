package Beakjoon_2024;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

/*
코드 작성자 : 구예원
작성 날짜 : 2024.03.08
코드 내용 : 최소힙 구현했는데 알 수 없는 오류에 기절하고 그냥 우선순위큐 클래스 쓰기,,,
 */


public class Beakjoon_1927_Re {

    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        PriorityQueue<Integer> minHeap= new PriorityQueue<>();

        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++){
            int x = Integer.parseInt(br.readLine());
            if(x==0){
                if(minHeap.isEmpty()){
                    sb.append(0+"\n");
                }else sb.append(minHeap.poll()+"\n");
            }else{
                minHeap.add(x);
            }
        }
        System.out.println(sb);

    }

}
