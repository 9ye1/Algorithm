import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class tester {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //String st = br.readLine();
        //System.out.println();

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int t = 0;

        if(m>n){
            t = m;
            m = n;
            n = t;
        }

        System.out.println(gcd(m,n%m));



    }

    static int gcd(int n, int m){
        if(m>0)
            return gcd(m,n%m);
        else
            return n;
    }
}


