package Beakjoon_2025;

// DATE : 2025.01.20
// WRITER : 구예원
// CONTENT : 그래프 이론 - bfs & queue

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class beakjoon_11725{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] parent = new int[n + 1]; //부모 노드 저장
        boolean[] visited = new boolean[n + 1]; //방문 체크 배열

        ArrayList<Integer>[] adj = new ArrayList[n + 1]; //연결 리스트
        for (int i = 1; i <= n; i++) {
            adj[i] = new ArrayList<>();
        }

        Queue<Integer> queue = new LinkedList<>(); //큐

        //연결 리스트 채우기
        for(int i=1; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            adj[a].add(b);
            adj[b].add(a);
        }

        queue.add(1);

        while(!queue.isEmpty()){
            int currentNode = queue.poll();

            //현재 노드랑 연결된 노드 탐색
            for(int i=0; i<adj[currentNode].size(); i++){
                int child = adj[currentNode].get(i);
                if(!visited[child]){ //아직 방문하지 않은 노드라면
                    visited[child] = true;        //1. 방문 처리
                    queue.add(child);             //2. 큐에 넣기
                    parent[child] = currentNode;  //3. 부모 노드 저장하기
                }
            }
        }

        for(int i=2; i<=n; i++){
            System.out.println(parent[i]);
        }

    }
}
