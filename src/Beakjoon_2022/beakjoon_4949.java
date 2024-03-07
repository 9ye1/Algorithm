package Beakjoon_2022;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class beakjoon_4949 {

    public static void main(String args[]) throws IOException {

        Stack<Character> stack = new Stack<>();

        int len = 0;
        char cur;
        boolean right = true;


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String st = br.readLine();

        while(!st.equals(".")){
            len = st.length();
            for(int i =0; i<len; i++){
                cur = st.charAt(i);
                if(cur=='('){
                    stack.push('(');
                }else if(cur==')'){
                    if(stack.empty() || stack.peek()=='['){
                        right = false;
                        break;
                    }
                    stack.pop();

                }else if(cur=='['){
                    stack.push('[');
                }else if(cur==']'){
                    if(stack.empty() || stack.peek()=='('){
                        right = false;
                        break;
                    }
                    stack.pop();
                }else if(cur=='.'){
                    break;
                }

            }

            if(right && stack.empty()){
                sb.append("yes\n");
            }else{
                sb.append("no\n");
            }

            right = true;
            stack.clear();
            st = br.readLine();

        }

        System.out.println(sb);


    }
}
