import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ah {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //String st = br.readLine();
        //System.out.println();

        String n = br.readLine();
        String m = br.readLine();

        if(n.length()>=m.length()){
            System.out.println("go");
        }else{
            System.out.println("no");
        }

    }
}
