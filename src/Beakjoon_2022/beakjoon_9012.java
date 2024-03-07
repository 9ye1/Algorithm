package Beakjoon_2022;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class beakjoon_9012 {

    public static void main(String args[]) throws IOException {

        int top = 0;
        char[] stk= new char[50];
        boolean right = true;  //for문이 끝날 때 NO/YES 검사할 용도


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String st;
        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++){
            st = br.readLine();
            for(int j =0; j<st.length(); j++){
                if(st.charAt(j) == '('){
                    stk[top] = '(';
                    top++;
                }else{
                    if(top<=0){  //남은 '('가 없어서 스택이 비어있는데 ')'가 들어오면 false
                        right = false;
                        break;
                    }
                    top--;
                }

            }

            if(top==0&&right){   //'('와 ')'의 개수가 동일하면 끝났을 때 top=0
                sb.append("YES\n");
            }else{
                sb.append("NO\n");
            }
            
            //초기화
            top=0;
            right = true;
        }
        System.out.println(sb);
    }

}
