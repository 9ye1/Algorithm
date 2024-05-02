package Algorithm;

//DATE : 2024.04.07
//NAME : 구예원
//CONTENT : 알고리즘 과제 - 퀵정렬

public class QuickSort {
    public static void main(String[] args) {

        int[] arr = {15,22,13,27,12,10,20,25};
        quickSort(arr, 0, arr.length-1);

    }

    static void quickSort(int[] arr,int pl,int pr){
        if(pl<pr){
            int pivot = division(arr, pl, pr);

            quickSort(arr, pl, pivot-1);
            quickSort(arr, pivot+1, pr);
        }
    }

    static int division(int[] arr,int pl, int pr){


        //변수 설정
        int pivot = arr[pr];
        int i = pl-1;
        int temp;

        //기준 수보다 작은 것들은 왼쪽 큰 것들은 오른쪽
        for(int j=pl; j<=pr-1; j++){
            if(arr[j]<=pivot){
                i++;

                //arr[i] 와 arr[j] 바꾸기
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;


                //출력
                for(int e : arr){
                    if(e==j) System.out.print("*");
                    System.out.print(e + " ");
                }
                System.out.println();
            }
        }
        //arr[i+1] 과 arr[r] 바꾸기
        temp = arr[i+1];
        arr[i+1] = arr[pr];
        arr[pr] = temp;

        return i+1;
    }
}
