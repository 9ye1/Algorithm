package Beakjoon_2024;

// DATE : 2024.03.30
// WRITER : 구예원
// CONTENT : BFS 문제 - 미로 찾기(최단거리)

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Beakjoon_2178 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] miro = new int[n+1][m+1];
        boolean[][] visited = new boolean[n+1][m+1];
        for(int i=1; i<n+1; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=1; j<m+1; j++){
                miro[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int count=0;
        Queue<Integer[][]> q = new LinkedList<>();

        int x=1;
        int y=1;

        while(0<x&&x<n&&0<y&&y<m){
            if(!visited[x-1][y] && miro[x-1][y]==1){

            }
            if(!visited[x+1][y]){

            }
            if(!visited[x][y+1]){

            }
            if(!visited[x][y-1]){

            }
            count++;
        }
    }
}
