package Beakjoon_2022;//DO IT! 007(투포인터) 문제풀이
//Date : 2023.04.09

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class beakjoon_1940 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int count = 0;
        int pt1=1, pt2=1;
        int n = Integer.parseInt(st.nextToken());
        int arr[] = new int[n+1];
        st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for (int i=1; i<=n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=1; i<n+1; i++){
            for(int j=1; j<n+1; j++){
                if(i==j) break;
                if(arr[i]+arr[j]==m){
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
