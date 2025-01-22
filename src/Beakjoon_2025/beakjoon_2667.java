package Beakjoon_2025;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class beakjoon_2667 {

    static int[][] map;
    static boolean[][] visit;
    static ArrayList<Integer> house = new ArrayList<Integer>(); //각각 하우스 개수
    static int count = 0;
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        map = new int[N][N];
        visit = new boolean[N][N];

        //입력 받아와서 지도에 정보 저장
        for(int i=0; i<N; i++){
            String str = br.readLine();
            for(int j=0; j<N; j++){
                map[i][j] = Integer.parseInt(String.valueOf(str.charAt(j)));
            }
        }

        //탐색 시작
        for(int a=0; a<N; a++){
            for(int b=0; b<N; b++){
                if(map[a][b] == 1 && !visit[a][b]){
                    //이 두 줄을 빼먹어서 count가 1일 때 0이 되는 오류가 있었음
                    visit[a][b]=true;
                    count++;
                    dfs(a,b);
                    house.add(count);
                    count = 0;
                }
            }
        }

        // 오름차순 정렬
        Collections.sort(house);

        //출력
        System.out.println(house.size()); // 총 단지수
        for(int i=0; i<house.size(); i++){
            System.out.println(house.get(i)); //각 단지내 집의 수
        }


    }

    static void dfs(int a, int b){

        if(a-1>=0){
            if(map[a-1][b]==1 && !visit[a-1][b]){
                visit[a-1][b] = true;
                count++;
                dfs(a-1,b);
            }
        }
        if(b-1>=0){
            if(map[a][b-1]==1 && !visit[a][b-1]){
                visit[a][b-1] = true;
                count++;
                dfs(a,b-1);
            }
        }
        if(a+1<N){
            if(map[a+1][b]==1 && !visit[a+1][b]){
                visit[a+1][b] = true;
                count++;
                dfs(a+1,b);
            }
        }
        if(b+1<N){
            if(map[a][b+1]==1 && !visit[a][b+1]){
                visit[a][b+1] = true;
                count++;
                dfs(a,b+1);
            }
        }


    }
}
