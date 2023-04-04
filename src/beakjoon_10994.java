import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class beakjoon_10994 {

    static char[][] star;
    static int tried = 0;
    static int a =0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        a = (n*2-1)*2-1;
        star = new char[a][a];

        drawstar(n);

        for(int i=0; i<a;i++){
            for (int j=0; j<a; j++){
                if(star[i][j]=='*'){
                    System.out.print(star[i][j]);
                }else System.out.print(' ');
            }
            System.out.println();
        }

    }

    static void drawstar(int n){
        //자기 사이즈 정사각형 별 찍기
        for(int i = tried*2; i<a-(tried*2); i++) {
            star[tried * 2][i] = '*'; //(0,0)~(0,a)
            star[i][tried * 2] = '*'; //(0,0)~(a,0)
            star[(a-(tried*2))-1][i] ='*';
            star[i][(a-(tried*2))-1] = '*';
        }


        //다음
        if(!((a-(tried*2))-1 == tried*2)) {
            tried++;
            drawstar(n - 1);
        }

    }
}
