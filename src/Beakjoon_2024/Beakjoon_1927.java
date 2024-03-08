package Beakjoon_2024;

//Date : 24.03.07-08 THU-FRI
//NAME : 구예원
//MEMO : 알고리즘 스터디 중급 테스트 5
//미해결......... 뭐가 문젠지 모르겠음ㅜ

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Beakjoon_1927 {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int x;

        MinHeap minHeap = new MinHeap();

        for (int i=1; i<=n; i++){
            x = Integer.parseInt(br.readLine());
            if(x==0){
                if(i==n) sb.append(minHeap.delete());
                else sb.append(minHeap.delete()+"\n");
            }else{
                minHeap.insert(x);
            }
        }

        System.out.println(sb);

    }


}

class MinHeap {

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
        while(cur_index>1&&(heap.get(cur_index)< heap.get(cur_index/2))){
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
    public int delete() {

        //비어있으면 0리턴
        if (heap.size() == 1) {
            return 0;
        }

        //삭제할 값 == 루트값 == 최솟값
        int root = heap.get(1);

        //마지막 노드를 root에 삽입하고 마지막 노드 삭제
        heap.set(1, heap.get(heap.size() - 1));
        heap.remove(heap.size() - 1);

        //다시 트리 정렬
        int cur_index = 1;



        while (cur_index * 2 < heap.size()) { //왼쪽 노드 인덱스가 힙 사이즈보다 작으면 자식이 있다는 뜻
            //왼쪽자식 오른쪽 자식 중 작은 값의 인덱스
            int min_index;

            if (heap.get(cur_index) < heap.get(cur_index * 2)) {  //부모가 자식보다 작으면 끝
                break;
            }

            //왼쪽자식
            min_index = cur_index*2;

            if(((min_index+1)<heap.size()) && heap.get(min_index) > heap.get(min_index + 1)) { //왼쪽, 오른쪽 중에 더 작은 쪽이랑 교
                //오른쪽 자식
                min_index += 1;
            }

            int temp = heap.get(cur_index);
            heap.set(cur_index, heap.get(min_index));
            heap.set(min_index,temp);
            cur_index = min_index;
        }
        return root;
    }
}