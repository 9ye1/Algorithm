package Beakjoon_2025;

// DATE : 2025.01.22
// WRITER : 구예원
// CONTENT : 2차원 배열에서 집합 찾기 <유기농 배추> - dfs

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class beakjoon_1012 {

    static int[][] bat;
    static boolean[][] visit;
    static int count = 0;
    static int n;
    static int m;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); //테스트 케이스 개수


        for (int i = 0; i < T; i++) {

            count=0;

            //배추밭에 배추 위치 저장
            StringTokenizer st = new StringTokenizer(br.readLine());
            m = Integer.parseInt(st.nextToken()); //가로
            n = Integer.parseInt(st.nextToken()); //세로
            int k = Integer.parseInt(st.nextToken()); //배추 개수

            bat = new int[n][m];
            visit = new boolean[n][m];

            for(int j=0; j<k; j++){
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());

                bat[b][a] = 1;
            }

            //탐색 시작
            for(int a=0; a<n; a++){
                for(int b=0; b<m; b++){
                    if(bat[a][b] == 1&&!visit[a][b]){

                        count++;
                        dfs(a,b);
                    }
                }
            }

            System.out.println(count);
        }
    }

    static void dfs(int a, int b){
        if(a-1>=0){
            if(bat[a-1][b]==1 && !visit[a-1][b]){
                visit[a-1][b] = true;
                dfs(a-1,b);
            }
        }
        if(b-1>=0){
            if(bat[a][b-1]==1 && !visit[a][b-1]){
                visit[a][b-1] = true;
                dfs(a,b-1);
            }
        }
        if(a+1<n){
            if(bat[a+1][b]==1 && !visit[a+1][b]){
                visit[a+1][b] = true;
                dfs(a+1,b);
            }
        }
        if(b+1<m){
            if(bat[a][b+1]==1 && !visit[a][b+1]){
                visit[a][b+1] = true;
                dfs(a,b+1);
            }
        }


    }
}
