package Algorithm;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

//DATE : 24.05.02
//NAME : 구예원
//CONTENT : SWAG 알고리즘 스터디 - 위상정렬

public class TopologicalSort {

    public static void main (String[] args) {

        //위상정렬에 사용할 큐
        Queue<Integer> queue = new LinkedList<>();
        //노드별 진입차수 저장 배열 (1~7노드 - 0번째 사용안함)
        int[] edgeCount = new int[8];
        //리스트로 구현된 그래프 그리고 노드 개수만큼 할당 (0 제외)
        ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < 8; i++) {
            graph.add(new ArrayList<Integer>(i));
        }

        //노드별 인접노드
        graph.get(1).add(2);
        graph.get(1).add(5);
        graph.get(2).add(3);
        graph.get(2).add(6);
        graph.get(3).add(4);
        graph.get(4).add(7);
        graph.get(5).add(6);
        graph.get(6).add(4);

        //노드별 진입차수
        edgeCount[2]=1;
        edgeCount[3]=1;
        edgeCount[4]=2;
        edgeCount[5]=1;
        edgeCount[6]=2;
        edgeCount[7]=1;

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
