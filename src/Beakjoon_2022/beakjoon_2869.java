package Beakjoon_2022;

import java.util.Scanner;

public class beakjoon_2869 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int V = sc.nextInt();

        //int val = (V-A)/(A-B);

        if(A==V){
            System.out.println(1);
        }else if((V-A)<(A-B)) {
            System.out.println(2);
        }else {
            if((V-A)%(A-B)==0) {
                System.out.println((V-A)/(A-B) + 1);
            } else{
                System.out.println((V-A)/(A-B)+2);
            }
        }
    }
}
