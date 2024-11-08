package Programmers_2024;

//DATE : 2024.09.03
//NAME : 구예원
//MEMO : 정렬이 핵심이었던 문제,,!

import java.util.Arrays;

public class pro_42577 {


    public static void main(String args[]) {


        String[] phone_book = {"123", "456", "789"};

        boolean answer = true;

        Arrays.sort(phone_book);

        for(int i=0; i<phone_book.length-1; i++){
            if(phone_book[i+1].startsWith(phone_book[i])){
                System.out.println(phone_book[i+1]+" started with "+phone_book[i]);
                answer = false;
                break;
            }
        }

        System.out.println(answer);
    }
}
