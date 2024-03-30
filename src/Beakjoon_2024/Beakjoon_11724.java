package Beakjoon_2024;

// DATE : 2024.03.28
// WRITER : 구예원
// CONTENT : DFS 구현 문제

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Beakjoon_11724 {

    static ArrayList<Integer>[] A; //그래프 데이터 저장 인접 리스트
    static boolean[] visited; //방문 기록 저장 배열
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int answer = 0; // 연결 요소의 개수 : 마지막에 출력할 값
        int n = Integer.parseInt(st.nextToken()); //노드 수
        int m = Integer.parseInt(st.nextToken()); //간선 수

        A = new ArrayList[n+1]; //그래프 데이터 저장 인접 리스트
        visited = new boolean[n+1]; //방문 기록 저장 배열

        //A 인접 리스트의 각 ArrayList 초기화
        for(int i=1; i<n+1; i++){
            A[i] = new ArrayList<Integer>();
        }

        //A 인접 리스트에 그래프 데이터 저장
        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            A[u].add(v);
            A[v].add(u);
        }

        //
        for(int i=1; i<n+1; i++) {
            if (!visited[i]) {
                answer++;
                DFS(i);
            }
        }
        System.out.println(answer);
    }


    static void DFS(int v){
        if(visited[v]) return;
        visited[v]=true;
        for(int i : A[v]){
            if(!visited[i]) DFS(i);
        }
    }


}
