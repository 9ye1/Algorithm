package Algorithm;

//DATE : 24.05.02
//NAME : 구예원
//CONTENT : SWAG 알고리즘 스터디 - UnionFind (MST 선행공부)

public class UnionFind {

    //해당 노드의 루트 노드를 반납하는 함수
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

    public static void main(String[] args){
        int[] parent = new int[11];
        for(int i=1; i<=10; i++){
            parent[i]=i;
        }
        unionParent(parent,1,2);
        unionParent(parent,4,5);
        unionParent(parent,5,6);
        System.out.println("2와4는 같은 집합인가?");
        if(findParent(parent,2,4)==1) System.out.println("네");
        else System.out.println("아니오");
        unionParent(parent,2,4);
        System.out.println("2와4는 같은 집합인가?");
        if(findParent(parent,2,4)==1) System.out.println("네");
        else System.out.println("아니오");


    }
}
