package Beakjoon_2024;

//DATE : 24.05.02
//NAME : 구예원
//CONTENT : SWAG 알고리즘 스터디 - 위상정렬 문제

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Beakjoon_2252 {
    public static void main (String[] args) throws IOException {

        //입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        //리스트로 구현된 그래프 그리고 노드 개수만큼 할당 (0 제외)
        ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < N+1; i++) {
            graph.add(new ArrayList<Integer>());
        }

        //노드별 진입차수 저장 배열 (1~7노드 - 0번째 사용안함)
        int[] edgeCount = new int[N+1];

        int a;
        int b;
        //노드별 인접노드와 진입차수 저장
        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            graph.get(a).add(b);
            edgeCount[b]++;

        }

        //위상정렬에 사용할 큐
        Queue<Integer> queue = new LinkedList<>();

        //진입차수가 0인 값 큐에 넣기
        for(int i=1; i<edgeCount.length; i++){
            if(edgeCount[i]==0){
                queue.add(i);
            }
        }

        while(!queue.isEmpty()){

            //큐에서 노드 번호 꺼내기 + 출력
            int nodeNum = queue.poll();
            System.out.print(nodeNum+" ");

            //해당 노드와 연결된 노드의 진입차수 -1 / 진입차수가 0이면 queue 삽입
            for(int i=0; i<graph.get(nodeNum).size(); i++){
                int connectNodeNum = graph.get(nodeNum).get(i);
                edgeCount[connectNodeNum]--;
                if(edgeCount[connectNodeNum]==0){
                    queue.add(connectNodeNum);
                }
            }
        }
    }
}
