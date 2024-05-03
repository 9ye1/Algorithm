package Algorithm;

public class Prim {

    static int prim(){
        int cost = 0; // 최소 비용 변수




        return cost;
    }
    public static void main(String args) {

    }
}

//노드 클래스
class Edge implements Comparable<Edge>{

    int w;      //연결되는 정점
    int cost;   //가중치

    Edge(int w, int cost){
        this.w = w;
        this.cost = cost;
    }


    //노드 객체를 정렬할 수 있게 하기 위함
    //comparable **나중에 꼭 다시 공부할 것**
    @Override
    public int compareTo(Edge e){
        return this.cost - e.cost;
    }
}
