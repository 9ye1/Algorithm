/*
코드 작성자 : 구예원
코드 내용 : 자바 알고리즘 스터디 HW2 - 백준 10815 문제 with 이진 검색 활용
작성 날짜 : 2022.11.13
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class beakjoon_10815 {

    //이진 검색 함수
    static int binSearch(int[] arr, int n, int key){

        int pl=0, pc=0, pr=n-1;
        //pl:배열의 시작 인덱스, pc:배열의 중간 인덱스, pr:배열의 끝 인덱스

        while(pl<=pr) {                  //pl이 pr보다 클 때까지 반복
            pc = (pl + pr) / 2;          //현재 pl과 pr의 중간
            if (key == arr[pc]) {        //key값과 arr[pc]의 값이 같으면 반환 후 종료
                return pc;
            } else if (key > arr[pc]) {  //key값이 더 작으면 pl을 pc+1 인덱스로 조정
                pl = pc + 1;

            } else if (key < arr[pc]) {  //key값이 더 크면 pr을 pc-1 인덱스로 조정
                pr = pc - 1;
            }
        }

        return -1;   //배열 안에 key 없음
    }


    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int index = 0;
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<m; i++){
            index = binSearch(arr, n, Integer.parseInt(st.nextToken()));
            if(index != -1){
                sb.append("1").append(" ");
            }else{
                sb.append("0").append(" ");
            }
        }

        System.out.println(sb);

    }
}
