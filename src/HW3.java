import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

//Date : 24.05.29 WED
//NAME : 구예원
//MEMO : 자료구조 기초 및 실습 HW3

public class HW3 {

    static int[] heap = new int[10001]; //root node index : 1 (index:0은 사용안함)
    static int last_idx = 0;

    static void init(){
        for(int i=0; i<10001; i++) heap[i]=-1;
        last_idx = 0;
    }
    static void reheap_up(int idx){
        if(idx==0) return;
        int p_idx = idx/2;

        if(heap[p_idx]<heap[idx]){
            int temp = heap[idx];
            heap[idx] = heap[p_idx];
            heap[p_idx] = temp;

            reheap_up(p_idx);
        }
    }
    static void insert(int key){
        heap[++last_idx] = key;
        reheap_up(last_idx);
    }

    static void reheap_down(int idx){
        int m_idx = -1; //l_idx와 r_idx 중 큰 값을 저장할 변수
        int l_idx = idx*2;
        int r_idx = idx*2+1;

        if(l_idx<=last_idx){ //l_idx가 존재하는지
            if(r_idx<=last_idx){ //r_idx가 존재하는지
                if(heap[l_idx]<heap[r_idx]) m_idx = r_idx;//l_idx와 r_idx 두 값 비교
                else m_idx = l_idx;
            }
            else m_idx = l_idx; //r_idx 존재하지 않을 때
        }else {
            return;
        }

        if(heap[m_idx]>heap[idx]){
            int temp = heap[idx];
            heap[idx] = heap[m_idx];
            heap[m_idx] = temp;

            reheap_down(m_idx);
        }
    }
    static int del(){
        int max = heap[0];
        heap[0] = heap[last_idx];

        reheap_down(0);

        return max;
    }
    public static void main(String args[]) throws IOException {
        FileWriter fw = new FileWriter("output.txt");

        BufferedReader br = new BufferedReader(new FileReader("input_hw3.txt"));
        StringTokenizer st;

        int testcase = Integer.parseInt(br.readLine());

        for(int test=0; test<testcase;test++){
            init();

            st = new StringTokenizer(br.readLine());

            int m = Integer.parseInt(st.nextToken()); //주어지는 숫자의 개수
            int n = Integer.parseInt(st.nextToken()); //n번째로 큰 수 찾기 (k)

            st = new StringTokenizer(br.readLine());

            for (int i=0; i<m; i++){
                insert(Integer.parseInt(st.nextToken()));
            }
            for (int i=0; i<n-1; i++){
                del();
            }
            fw.write(del()+"\n");
        }

        fw.close();


    }
}
