// Data : 2022.12.23
// Name : 구예원
// 전주에 왔다가 하나 풀기 - 문제는 실버 4-5에서 랜덤으로 고름
// 백준 1026 - 보물

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import static java.util.Arrays.sort;

public class beakjoon_1026 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        int[] b = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i<n; i++){
            a[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<n; i++){
            b[i] = Integer.parseInt(st.nextToken());
        }

        sort(a); sort(b);

        int sum = 0;

        for(int i = 0; i<n; i++){
            sum += a[i]*b[n-1-i];
        }

        System.out.println(sum);
    }
}
