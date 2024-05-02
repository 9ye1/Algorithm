package Beakjoon_2024;

//DATE : 24.05.02
//NAME : 구예원
//CONTENT : SWAG 알고리즘 스터디 - 위상정렬 + 최소값 선택 문제

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Beakjoon_1516 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        //건물 개수
        int N = Integer.parseInt(br.readLine());

        //건물 당 작업 시간
        int[] buildTime = new int[N+1];

        //노드별 진입차수
        int[] incommingEdge = new int[N+1];

        //건물 당 총 소요 시간
        int[] completeTime = new int[N+1];

        //리스트로 구현된 그래프 그리고 노드 개수만큼 할당 (0 제외)
        ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < N+1; i++) {
            graph.add(new ArrayList<Integer>());
        }

        //노드별 인접노드와 진입차수 저장
        for(int i=1; i<=N; i++){
            st = new StringTokenizer(br.readLine());
            buildTime[i]=Integer.parseInt(st.nextToken());
            int pre = Integer.parseInt(st.nextToken());
            while(pre!=-1){
                graph.get(pre).add(i);
                incommingEdge[i]++;
                pre = Integer.parseInt(st.nextToken());
            }
        }

        //위상정렬에 필요한 큐
        Queue<Integer> queue = new LinkedList<>();

        //진입차수가 0인 노드 큐에 삽입
        for(int i =1; i<=N; i++){
            if(incommingEdge[i]==0){
                queue.add(i);
            }
        }

        while(!queue.isEmpty()){
            //큐에서 노드번호 꺼내기
            int nodeNum = queue.poll();

            //총 작업 시간에 현재 노드 작업 시간 더해주기
            completeTime[nodeNum] += buildTime[nodeNum];

            //연결된 다음 노드에 현재 노드 작업 시간 더해주고 진입차수 -1
            for(int i=0; i<graph.get(nodeNum).size();i++){
                int nextNode = graph.get(nodeNum).get(i);
                completeTime[nextNode] = Math.max(completeTime[nextNode],completeTime[nodeNum]);
                incommingEdge[nextNode]--;
                if(incommingEdge[nextNode]==0) queue.add(nextNode);
            }
        }

        //출력
        for(int i=1; i<=N; i++){
            System.out.println(completeTime[i]);
        }

    }
}
