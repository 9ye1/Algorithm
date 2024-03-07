package Beakjoon_2022;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class beakjoon_2161 {
    public static void main(String args[]){

        Queue<Integer> queue = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            queue.add(i);
        }
        while(queue.size()>1){
            sb.append(queue.peek()+" ");
            queue.poll();
            queue.add(queue.peek());
            queue.poll();
        }

        sb.append(queue.peek());
        System.out.println(sb);

    }
}
