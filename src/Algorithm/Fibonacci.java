package Algorithm;

// DATE : 2024.03.25
// WRITER : 구예원
// CONTENT : 알고리즘 수업 - 수행 시간 측정 과제

public class Fibonacci{
    public static int fibRecur(int n){
        if(n<=1){
            return n;
        }else{
            return fibRecur(n-1) + fibRecur(n-2);
        }
    }

    public static int fibFor (int n){
        int index = 1;
        int[] fibArr = new int[n+1];
        fibArr[0] = 0;
        if(n>0){
            fibArr[1]=1;
            for(int i=2; i<n; i++) {
                fibArr[i] = fibArr[i - 1] + fibArr[i - 2];
            }
        }
        return fibArr[n];
    }



    public static void main(String args[]){

        int n = 50; //10, 30, 50, 70

        long beforeTime = System.currentTimeMillis();
        long bTnano = System.nanoTime();
        //
            fibRecur(n);
        //
        long afterTime = System.currentTimeMillis();
        long fTnano = System.nanoTime();
        long secDiffTime = afterTime - beforeTime;
        long eTnano = fTnano - bTnano;
        System.out.println("재귀 알고리즘 실행시간(s) : "+secDiffTime/1000+"."+secDiffTime%1000+"초");

        System.out.println("시간차이(micros)"+eTnano/1000+"microsec");
        System.out.println("시간차이(nanos)"+eTnano+"nanosec");

        //


        beforeTime = System.currentTimeMillis();
        bTnano = System.nanoTime();
        //
            fibFor(n);
        //
        afterTime = System.currentTimeMillis();
        fTnano = System.nanoTime();
        secDiffTime = afterTime - beforeTime;
        eTnano = fTnano - bTnano;
        System.out.println("반복 알고리즘 실행시간(s) : "+secDiffTime/1000+"."+secDiffTime%1000+"초");
        System.out.println("시간차이(micros)"+eTnano/1000+"microsec");
        System.out.println("시간차이(nanos)"+eTnano+"nanosec");
    }
}
