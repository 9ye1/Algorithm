package Beakjoon_2024;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLSyntaxErrorException;
import java.util.StringTokenizer;

public class Beakjoon_15649 {

    static int N;
    static int M;

    static int[] arr;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[M];
        visited = new boolean[N];

        dfs(0);

    }

    public static void dfs(int depth) {
        if(depth==M){
            for(int value : arr){
                System.out.print(value+" ");
            }
            System.out.println();
            return;
        }

        for(int i=0; i<N; i++){
            if(!visited[i]){
                visited[i]=true;
                arr[depth] = i+1;
                dfs(depth+1);
                visited[i]=false;
            }
        }
    }

}
