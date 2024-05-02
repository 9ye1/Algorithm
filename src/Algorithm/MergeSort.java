package Algorithm;

import java.io.IOException;

public class MergeSort {

    static int[] arr;
    static int[] a;
    static int[] b;
    public static void main(String[] args) throws IOException{
        int[] arr = {27, 10, 12, 20, 25, 13, 15, 22}; //sort할 배열

        mergesort(arr, 0, arr.length-1);

        for(int i : arr){
            System.out.println(i);
        }

    }

    static void mergesort(int[] arr ,int left, int right){

        if(left<right){ //원소가 1개 일 때까지
            int center = (left+right) / 2;

            int an = center-left+1; //임시 a 배열 크기
            int bn = right-(center+1)+1; //임시 b 배열 크기
            a = new int[an];
            b = new int[bn];

            System.arraycopy(arr,left,a,0,an);
            System.arraycopy(arr,center+1,b,0,bn);

            mergesort(arr, left, center);
            mergesort(arr, center+1, right);


            //인덱스 초기화
            int i = 0; int j =0; int k = left;
            //두 배열 비교해서 하나하나 넣기
            while(i<an&&j<bn){
                if(a[i] <= b[j]){
                    arr[k++]=a[i++];
                }else{
                    arr[k++]=b[j++];
                }
            }
            while (i < an) {
                arr[k++] = a[i++];
            }
            while (j < bn) {
                arr[k++] = b[j++];
            }
            //

        }
    }

}
