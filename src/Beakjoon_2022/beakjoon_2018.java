package Beakjoon_2022;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class beakjoon_2018 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        int start_index = 1;
        int end_index = 1;
        int sum = 1;
        int count = 0;

        while(end_index <= n){
            if(sum==n){
                count++;
                end_index++;
                sum += end_index;
            }else if(sum > n){
                sum = sum - start_index;
                start_index++;
            }else if(sum < n){
                end_index++;
                sum += end_index;
            }
        }

        System.out.println(count);


    }
}
