//Date : 24.06.07 FRI
//NAME : 구예원
//MEMO : 자료구조 기초 및 실습 HW4
//CONTENT : 유방향 그래프 사이클 유무 확인

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class HW4 {

    static int hasCycle;
    static int[][] graph;
    static int[] nodeState;
    //nodeState : 각 노드의 상태를 저장하는 배열 : 인덱스가 노드 번호
    //0 : 아직 방문하지 않은 노드
    //1 : 현재 탐색 중인 노드
    //2 : 탐색을 완료한 노드

    // 아직 방문하지 않은 노드 중 작은 번호부터 순서대고 dfs 수행
    // 계속해서 이웃한 노드로 dfs 수행 이미 탐색중인 노드를 만나면 사이클 존재

    public static void main(String args[]) throws IOException {
        FileWriter fw = new FileWriter("output.txt");

        BufferedReader br = new BufferedReader(new FileReader("input_hw4.txt"));
        StringTokenizer st;

        int testcase = Integer.parseInt(br.readLine());

        for(int test=0; test<testcase;test++){

            int n = Integer.parseInt(br.readLine());
            graph = new int[n][n];
            nodeState = new int[n];
            hasCycle = 0; //각 testcase마다 초기화

            for (int i = 0; i<n; i++){
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j<n; j++){
                    graph[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            for(int i=0; i<n; i++){
                if(nodeState[i]==0) {
                    dfs(i);
                    for(int j=0; j<n; j++){
                        if(nodeState[j]==1) nodeState[j]=2;
                    }
                }
                if (hasCycle == 1) {
                    break; // 사이클을 발견하면 탐색 중지
                }
            }

            fw.write(hasCycle+"\n");
        }

        fw.close();


    }
    static void dfs(int visit){

        //새로 방문한 노드가 현재 탐색 중인 노드(1)면 사이클 있음
        if(nodeState[visit]==1) {
            hasCycle = 1;
        }else{ //새로 방문한 노드가 현재 탐색 중인 노드가 아니면(0,2) 탐색 중(1)으로 바꿈
            nodeState[visit]=1;
            for(int i=0; i< graph.length; i++){
                if(graph[visit][i]==1) dfs(i);
            }
        }



    }


}
