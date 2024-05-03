package Algorithm;

//DATE : 24.05.03
//NAME : 구예원
//CONTENT : SWAG 알고리즘 스터디 - MST - Kruskal

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Kruskal {

    //// Union Find ////

    static int getParent(int[] parent, int x){
        if(x==parent[x]) return x;
        return parent[x] = getParent(parent, parent[x]);  //루트노드찾기
        //return parent[x]; //0_0 이렇게 해도 될 것 같은데 굳이 위 과정 왜 있는지 모르겠음!
    }
    //각 부모 노드를 합치는 함수
    static void unionParent(int[] parent, int a, int b){
        a = getParent(parent,a);
        b = getParent(parent,b);

        if(a<b) parent[b]=a;
        else parent[a]=b;
    }

    //두 노드의 부모노드가 같은지 확인하는 함수 (같은 그래프에 속하는지)
    static int findParent(int[] parent, int a, int b){
        a = getParent(parent, a);
        b = getParent(parent, b);
        if(a==b) return 1;
        else return 0;
    }

    //// Union Find ////


    //// Kruskal Algorithm ////
    static int kruskal(int[][] graph, int[] parent){
        int cost = 0; //최소 비용 저장할 변수
        //간선을 가중치 오름차순으로 정렬
        Arrays.sort(graph, (o1, o2) -> o1[2] - o2[2]);
        //하나하나 연결 - Union Find 를 이용해 사이클 방지
        for(int i=0; i < graph.length; i++){
            //같은 그래프에 속하지 않으면 연결 o
            if(findParent(parent, graph[i][0], graph[i][1])==0){
                cost+=graph[i][2];
                unionParent(parent, graph[i][0], graph[i][1]);
            }
        }
        //최종 최소 비용 리턴
        return cost;
    }

    public static void main(String[] args){

        //graph 정보 : 0:노드번호 1:노드번호 2:가중치
        int[][] graph = { {1,2,7}, {1,3,6}, {2,4,1}, {2,3,5}, {3,4,4}, {4,5,2} };


        //부모 노드 정보
        int[] parent = new int[6];
        //부모 노드 초기화
        for (int i =1; i<parent.length; i++){
            parent[i] = i;
        }

        System.out.println("이 그래프의 MST는 "+kruskal(graph, parent) +" 입니다. ");
    }
}
