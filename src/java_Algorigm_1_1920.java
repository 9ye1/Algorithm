import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class java_Algorigm_1_1920 {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int m = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        int value = 0;
        boolean col;

        for(int i=0; i<m; i++){
            col = false;
            value = Integer.parseInt(st.nextToken());
            for(int j=0; j<arr.length; j++){
                if(value == arr[j]){
                    col = true;
                    break;
                }
            }
            if(col) sb.append("1").append("\n");
            else sb.append("0").append("\n");
        }

        System.out.println(sb);

    }
}
