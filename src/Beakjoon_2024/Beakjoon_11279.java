package Beakjoon_2024;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Beakjoon_11279 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int x;

        PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0; i<n; i++){
            x = Integer.parseInt(br.readLine());
            if(x==0){
                if(pQ.isEmpty()) System.out.println(0);
                else System.out.println(pQ.poll());
            }else{
                pQ.add(x);
            }
        }
    }
}
