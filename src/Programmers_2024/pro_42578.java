package Programmers_2024;

//DATE : 2024.09.03
//NAME : 구예원
//MEMO : 조합....

import java.util.*;
public class pro_42578 {


    public static void main(String args[]) {
        String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};

        int answer = 1;

        HashMap<String,Integer> map = new HashMap<String,Integer>();

        for(int i=0; i<clothes.length; i++){
            map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 0) + 1);


        }


        ArrayList<Integer> nums = new ArrayList<>();





        for(int i=0; i<nums.size(); i++){
            answer *= nums.get(i)+1;
        }


        System.out.println(answer-1);

    }


}
