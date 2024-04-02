package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = {2,72,1,26,7,54,28,57,76,43,21,19};//임의의 배열

        //이진검색은 정렬된 배열에서 탐색한다.
        Arrays.sort(arr);
    }
}
