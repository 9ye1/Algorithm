//Date : 24.03.03 SUN
//NAME : 구예원
//MEMO : 개강 하루 전 문제풀이 시작 기분좋게 성공~ 1년동안 화이팅하자!!
//REMEMBER : BufferedReader, StringTokenizer

package Beakjoon_2024;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon_3226 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int price = 0;
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine(),": ");
            int hour = Integer.parseInt(st.nextToken());
            int munite = Integer.parseInt(st.nextToken());
            int count = Integer.parseInt(st.nextToken());
            //System.out.println(hour+":"+munite+" "+count);
            for(int j=0; j<count; j++){
                if(munite++==60){
                    munite=0;
                    hour+=1;
                }
                if(hour<19&&hour>=7){
                    price+=10;
                }else{
                    price+=5;
                }
            }

        }
        System.out.println(price);
    }
}
