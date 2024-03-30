package Beakjoon_2024;

// DATE : 2024.03.30
// WRITER : 구예원
// CONTENT : DFS 와 BFS 문제

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Beakjoon_1260 {

    static ArrayList<Integer>[] A; //그래프 데이터 저장 인접 리스트
    static boolean[] visited; //방문 기록 저장 배열

    static Queue<Integer> q; //BSF에 쓰일 큐
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); //정점의 개수
        int m = Integer.parseInt(st.nextToken()); //간선의 개수
        int v = Integer.parseInt(st.nextToken()); //탐색 시작 노드 번호


        A = new ArrayList[n+1];
        //A 인접 리스트의 각 ArrayList 초기화
        for (int i=1; i<=n; i++){
            A[i] = new ArrayList<Integer>();
        }

        //각 노드의 연결 정보 저장
        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            A[u].add(c);
            A[c].add(u);
        }

        //각 노드의 연결 노드 정렬
        for (int i=1; i<=n; i++){
            Collections.sort(A[i]);
        }


        //visited 초기화 후 DFS 실행
        visited = new boolean[n+1];
        DFS(v);

        System.out.println();
        //visited 초기화 후 BFS 실행
        visited = new boolean[n+1];
        q = new LinkedList<>();
        BFS(v);


    }

    static void DFS(int v){

        if(!visited[v]) {
            visited[v]=true;
            System.out.print(v+" ");
            for (int i : A[v]) {
                DFS(i);
            }
        }
    }

    static void BFS(int v){ //아!!! BFS는 재귀가 아니다.

        q.add(v);
        visited[v]=true;
        int out;

        while(!q.isEmpty()){
            out = q.poll();
            System.out.print(out+" ");
            visited[out]=true;
            for (int i : A[out]){
                if(!q.contains(i)&&!visited[i]) q.add(i);
            }
        }
    }

}
