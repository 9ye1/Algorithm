package Beakjoon_2024;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Beakjoon_10773 {

    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        int num;
        int sum=0;

        for(int i=0; i<n; i++){
            num = Integer.parseInt(br.readLine());
            if(num==0){
                stack.pop();
            }else {
                stack.push(num);
            }
        }

        while(!stack.isEmpty()){
            sum+=stack.pop();
        }

        System.out.println(sum);
    }
}
