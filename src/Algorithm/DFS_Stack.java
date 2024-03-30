package Algorithm;

// DATE : 2024.03.28
// WRITER : 구예원
// CONTENT : 재귀함수를 이용한 bfs 구현 - stack 사용

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class DFS_Stack {

    static ArrayList<Integer>[] A; //그래프 데이터 저장 인접 리스트
    static boolean[] visited; //방문 기록 저장 배열
    public static void main(String[] args) throws IOException {

        int[][] graph = {{},{2,4,7},{1,3,4,5},{2,5},{1,2,6},{2,3},{4,7},{1,6},{7}};
        //length:9 - 0 안쓰고 1-9 //노드개수 : 8

        A = new ArrayList[graph.length]; //그래프 데이터 저장 인접 리스트
        visited = new boolean[graph.length]; //방문 기록 저장 배열

        //A 인접 리스트의 각 ArrayList 초기화
        for(int i=1; i<graph.length; i++){
            A[i] = new ArrayList<Integer>();
        }

        //A 인접 리스트에 그래프 데이터 저장
        for (int i=1; i< graph.length;i++){
            for(int j=0; j< graph[i].length; j++){
                A[i].add(graph[i][j]);
            }
        }
        //
        for(int i=1; i<graph.length; i++) {
            if (!visited[i]) {
                DFS(i);
            }
        }
    }


    static void DFS(int v){
        if(visited[v]) return;
        visited[v]=true;
        for(int i : A[v]){
            if(!visited[i]) DFS(i);
        }
    }


}
