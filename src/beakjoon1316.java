import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class beakjoon1316 {

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int n = Integer.parseInt(str);
        char now = ' ';
        int count = 0;
        boolean cor = true;
        ArrayList<Character> arr = new ArrayList<>();

        //n번 반복
        for (int i = 0; i < n; i++){
            str = br.readLine();
            loop:
            for (int j = 0; j<str.length(); j++){
                if(now != str.charAt(j)){
                    now = str.charAt(j);
                    arr.add(now);
                    //now 변수가 앞에 있던 알파벳 중 겹치는 게 있는지 확인
                    for(int k = 0; k < arr.size()-1; k++){
                        if(now == arr.get(k)){
                            cor = false;
                            break loop;
                        }
                    }
                }
            }
            if(cor) count++;
            //변수 초기화
            cor = true;
            now = ' ';
            arr = new ArrayList<>();

        }
        System.out.println(count);
    }
}
