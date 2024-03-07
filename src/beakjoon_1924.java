import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class beakjoon_1924 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
        String[] dOw = {"SUN","MON","TUE","WED","THU","FRI","SAT"};

        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        int passed = 0;

        for(int i =0; i<m-1; i++){
            passed+=days[i];
        }
        passed+=n;

        System.out.println(dOw[passed%7]);

    }

}
