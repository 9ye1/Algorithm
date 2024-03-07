package DataStructure;/*
코드 작성자 : 구예원
코드 내용 : 자바 자료구조 스터디 - 이진 검색 구현
작성 날짜 : 2022.11.13
 */


public class Binary_Search {

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

        return 0;
    }

}
