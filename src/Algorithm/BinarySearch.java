package Algorithm;

// DATE : 2024.04.03
// WRITER : 구예원
// CONTENT : BinarySearch 구현

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = {0,2,17,21,26,27,33,45,57,76,77,90,98};

        //임의의 배열 1-12 11개 숫자
        //이진검색은 정렬된 배열에서 탐색한다.


        for(int i : arr){
            System.out.println(i+" ");
        }

        int whereN = biSearch(arr,n);
        if(whereN==0){
            System.out.println(n+"없음!");
        }
        else {
            System.out.println(n+"은 "+whereN+"인덱스에 위치함니둥");
        }
    }

    public static int biSearch (int[] arr, int n){

        int start = 1;
        int end = arr.length-1;
        int mid;


        while (start <= end){  // start
            mid = (start + end) / 2;
            if(arr[mid]==n){
                return mid;
            }else if(n<arr[mid]){
                end = mid-1;
            }else {
                start = mid+1;
            }
        }
        return 0;
    }
}
