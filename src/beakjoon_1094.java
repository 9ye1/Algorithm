import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class beakjoon_1094 {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = {64, 32, 16, 8, 4, 2, 1};
        int stick = 0,sum = 0;

        for(int i = 0; i < arr.length; i++){
            if(n==sum) break;
            if(n>=sum+arr[i]){
                sum+=arr[i];
                stick++;
            }
        }
        System.out.println(stick);
    }
}
