package Algorithm;

// DATE : 2024.03.25
// WRITER : 구예원
// CONTENT : 알고리즘 수업 과제

import java.util.HashSet;
import java.util.Set;

public class ArrSameCheck {

    public static int origin(int[][] arr){

        for(int i=0; i<arr.length; i++){
            for (int j=0; j< arr[i].length;j++){
                for(int k=0; k< arr.length;k++){
                    for(int m=0; m<arr.length; m++){
                        if(arr[i][j]==arr[k][m]) return 1;
                    }
                }
            }
        }
        return 0;
    }

    public static int effi1(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                for (int k = i; k < arr.length; k++) {
                    for (int m = (k == i) ? j + 1 : 0; m < arr.length; m++) {
                        if (arr[i][j] == arr[k][m]) {
                            return 1;
                        }
                    }
                }
            }
        }
        return 0;
    }

    public static int effi2(int[][] arr)
    {
        Set<Integer> set = new HashSet<>();

        for (int[] subArray : arr) {
            for (int element : subArray) {
                if (!set.add(element)) {
                    return 1; // 중복된 값이 있으면 1 반환
                }
            }
        }

        return 0;
    }

    public static void main(String args[]) {

        //long beforeTime = System.currentTimeMillis();
        long bTnano = System.nanoTime();
        //
        int[][] arr = {{1,3,45,6,5},{75,14,8,2,7},{41,61,27,22,83},{9,12,43,20,45},{11,60,15,4,48}};

        origin(arr);

        //
        //long afterTime = System.currentTimeMillis();
        long fTnano = System.nanoTime();
        //long secDiffTime = afterTime - beforeTime;
        long eTnano = fTnano - bTnano;

        //System.out.println("시간차이(s) : "+secDiffTime/1000+"."+secDiffTime%1000+"초");
        //System.out.println("시간차이(ms)"+secDiffTime+"ms");
        //System.out.println("시간차이(micros)"+eTnano/1000+"microsec");
        System.out.println("시간차이(nanos)"+eTnano+"nanosec");

    }


}


