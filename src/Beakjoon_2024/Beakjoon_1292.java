package Beakjoon_2024;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon_1292 {

    public static void main(String args[]) throws IOException{

        int[] seq = new int[1000];
        int[] sumSeq = new int[1000];
        int index = 1;
        int data = 2;
        seq[0]=1;
        sumSeq[0] =1;
        while (index<1000) {
            for (int j = 0; j < data; j++) {
                seq[index] = data;
                sumSeq[index] = sumSeq[index-1]+seq[index];
                index++;
                if(index==1000) break;
            }
            data++;
        }

        //for (int i=0; i<seq.length; i++) {
        //    System.out.println(i+"번"+seq[i] + ","+sumSeq[i]);
        //}

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        if(a==1) System.out.println(sumSeq[b-1]);
        else System.out.println(sumSeq[b-1]-sumSeq[a-2]);

    }
}
