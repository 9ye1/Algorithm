package Beakjoon_2022;

import java.util.Scanner;
import java.util.Stack;

public class beakjoon_1874 {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        //수열 길이
        int n = sc.nextInt();

        //수열 배열에 저장
        int arr[] = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        //문자열 저장 sb 객체 선언 / Stack 객체 선언
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();

        int num = 1; //자연수
        boolean res = true; //yes/no
        int pop =0 ;

        for(int i=0; i<n; i++){
            int su = arr[i];
            if(num<=su) {
                while(num<=su){
                    sb.append("+\n");
                    stack.push(num++);
                }
                sb.append("-\n");
                stack.pop();
            }else{
                pop = stack.pop();
                if(pop<=su){
                    sb.append("-\n");
                }
                else{
                    System.out.println("NO");
                    System.exit(0);
                }
            }
        }
        System.out.println(sb);


    }
}
