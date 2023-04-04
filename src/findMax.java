import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class findMax {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int a=0,b=0,c=0;
        int[] arr = {64, 32, 16, 8, 4, 2, 1};
        int stick = 0,sum = 0;

        if(a>b){
            if(a>c) System.out.println("MAX IS " + a );
        }
        else if(b>a){
            if(b>c) System.out.println("MAX IS " + b );
        }
        if(c>a){
            if(c>b) System.out.println("MAX IS " + c );
        }
        System.out.println(stick);
    }
}
