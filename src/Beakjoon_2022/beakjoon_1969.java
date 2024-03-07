package Beakjoon_2022;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class beakjoon_1969 {

    static int hd = 0; //Hamming Distanced의 총합

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        String[] str = new String[n];
        String s = ""; //Hamming Distance의 합이 가장 작은 DNA s

        for(int i =0; i<n; i++){
            str[i] = br.readLine();
        }

        int a=0,c=0,g=0,t=0;

        for(int i = 0; i < m; i++){
            a=0; c=0; g=0; t=0;
            for(int j = 0; j < n; j++){
                switch (str[j].charAt(i)){
                    case 'A' :
                        a++;
                        break;
                    case 'C' :
                        c++;
                        break;
                    case 'G' :
                        g++;
                        break;
                    case 'T' :
                        t++;
                        break;
                }

            }
            s += maxFinder(a,c,g,t);


        }
        System.out.println(s+"\n"+hd);

    }
    static char maxFinder(int a, int c, int g, int t){
        int val = 0;
        if(g>=t){
            val = g;
        }else val = t;
        if(c>=val){
            val = c;
        }
        if(a>=val){
            val = a;
        }

        //val 이 누구껀지
        if(val==a) {
            hd += c + g + t;
            return 'A';
        }
        else if(val==c) {
            hd += a + g + t;
            return 'C';
        }
        else if(val==g) {
            hd += c + a + t;
            return 'G';
        }
        else{
            hd += c + g + a;
            return 'T';
        }

    }
}
