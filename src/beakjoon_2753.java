import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class beakjoon_2753 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int year = Integer.parseInt(br.readLine());
        int output = 0;

        if(year%400==0){
            output=1;
        }else if(year%100!=0 && year%4==0){
            output=1;
        }
        System.out.println(output);
    }
}
