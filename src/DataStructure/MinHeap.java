package DataStructure;

import java.util.ArrayList;

//Date : 24.03.08 FRI
//NAME : 구예원
//MEMO : 최소힙 구현
public class MinHeap {

    private ArrayList<Integer> heap;

    //생성자
    public MinHeap(){
        heap = new ArrayList<>();
        heap.add(0);
    }

    //삽입 메소드
    public void insert(int val){
        heap.add(val);                    //새로 추가한 노드 데이터
        int cur_index = heap.size()-1;    //새로 추가한 노드 인덱스 : heap 사이즈 - 1
        while(cur_index>1&&(val< heap.get(cur_index/2))){
            //현재 인덱스가 1보다 크거나(부모노드가 있다는 뜻) && 현재 노드 값이 부모노드 값보다 작으면
            //현재 노드와 부모 노드 위치 바꾸기
            int temp = heap.get(cur_index/2);
            heap.set(cur_index/2,val);
            heap.set(cur_index,temp);

            //노드 인덱스 부모 인덱스로!
            cur_index /= 2;

        }
    }

    //삭제 메소드
    public int delete(){
        if(heap.size()==1){
            return 0;
        }

        //삭제할 값 == 루트값 == 최솟값
        int root = heap.get(1);

        //마지막 노드를 root에 삽입하고 마지막 노드 삭제
        heap.set(1,heap.get(heap.size())-1);
        heap.remove(heap.size()-1);

        //다시 트리 정렬
        int cur_index=1;

        while( cur_index*2 < heap.size()) { //왼쪽 노드 인덱스가 힙 사이즈보다 작으면 자식이 있다는 뜻

            if(heap.get(cur_index) < heap.get(cur_index*2)){  //부모가 자식보다 작으면 끝
                break;
            }

            if(heap.get(cur_index*2) < heap.get(cur_index*2+1)) { //왼쪽, 오른쪽 중에 더 작은 쪽이랑 교
                int temp = heap.get(cur_index);
                heap.set(cur_index, heap.get(cur_index*2));
                heap.set(cur_index*2,temp);
            }else{
                int temp = heap.get(cur_index);
                heap.set(cur_index, heap.get(cur_index*2+1));
                heap.set(cur_index*2+1,temp);
            }
        }
        return root;
    }


}
