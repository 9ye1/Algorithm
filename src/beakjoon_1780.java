import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class beakjoon_1780 {

    static int zero = 0;
    static int plus = 0;
    static int minus = 0;

    static int[][] paper;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        paper = new int[n][n];


        StringTokenizer st;

        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            for (int j =0; j<n; j++){
                paper[i][j]=Integer.parseInt(st.nextToken());
            }
        }

    }

    static void finder(int x, int y, int size){
        int temp = paper[x][y];
        boolean col = true;

        loop:
        for(int i =x; i<x+size; i++){
            for(int j =y; j<y+size; j++){
                if(paper[x][y]==temp)
                    ;
                else{
                    col = false;
                    break loop;
                }

            }
        }
        if(col){

        }
    }
}
